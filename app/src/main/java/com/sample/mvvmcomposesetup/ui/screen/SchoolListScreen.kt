package com.sample.mvvmcomposesetup.ui.screen

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sample.mvvmcomposesetup.R
import com.sample.mvvmcomposesetup.base.UIState
import com.sample.mvvmcomposesetup.networkhelper.NoInternetException
import com.sample.mvvmcomposesetup.remote.ApiConstants
import com.sample.mvvmcomposesetup.ui.base.ShowLoading
import com.sample.mvvmcomposesetup.ui.base.showToast
import com.sample.mvvmcomposesetup.viewmodel.SchoolListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SchoolListScreen : ComponentActivity() {

    /*By Using the delegation we can directly get the viewmodel*/
    /*Viewmodel provider is depreciated*/
    private val schoolListViewModel: SchoolListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SchoolListContent(viewModel = schoolListViewModel)
        }
    }

    @Composable
    fun SchoolListContent(viewModel: SchoolListViewModel) {
        val dataState by viewModel.schoolListResponse.collectAsState()

        Scaffold(topBar = { AppTopAppBar() }) { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                when (dataState) {
                    /*Initially placed a loader*/
                    UIState.Loading -> {
                        ShowLoading()
                    }
                    /*Once the response throws error or failed, it will show the message */
                    is UIState.Failure -> {
                        val errorText = when ((dataState as UIState.Failure).throwable) {
                            is NoInternetException -> R.string.no_internet_available
                            else -> R.string.something_went_wrong_try_again
                        }
                        showToast(this@SchoolListScreen, getString(errorText))
                    }
                    /*Once it is success and it moves to next screen before that it will load the List of item*/
                    is UIState.Success -> {
                        val data = remember { (dataState as UIState.Success).data }
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(8.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp),
                        ) {
                            items(data.size) { index ->
                                val item = data[index]
                                Log.v("xxxxItem", item.toString())
                                ListItemView(item = item, onItemClick = { clickedItem ->
                                    val intent = Intent(
                                        this@SchoolListScreen, SchoolDetailsScreen::class.java
                                    ).apply {
                                        also {
                                            Log.v("xxxxItemSchool", clickedItem.dbn)
                                        }
                                        putExtra(ApiConstants.DBN, clickedItem.dbn)
                                    }
                                    startActivity(intent)
                                })
                            }
                        }
                    }
                }
            }
        }
    }

    /*Created a top bar like header to show the heading of my task*/
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun AppTopAppBar() {
        TopAppBar(
            title = {
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                    Text(
                        text = "School List",
                        style = MaterialTheme.typography.titleLarge.copy(color = MaterialTheme.colorScheme.secondary)
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
}

package com.sample.mvvmcomposesetup.ui.githublist

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.sample.mvvmcomposesetup.R
import com.sample.mvvmcomposesetup.base.UIState
import com.sample.mvvmcomposesetup.networkhelper.NoInternetException
import com.sample.mvvmcomposesetup.remote.ApiConstants
import com.sample.mvvmcomposesetup.ui.base.ShowLoading
import com.sample.mvvmcomposesetup.ui.base.showToast
import com.sample.mvvmcomposesetup.ui.githubdetails.GithubUserDetailsScreen
import com.sample.mvvmcomposesetup.viewmodel.githublist.GithubUserListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GithubUserListScreen : ComponentActivity() {

    private lateinit var githubUserListViewModel: GithubUserListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            githubUserListViewModel = ViewModelProvider(this)[GithubUserListViewModel::class.java]
            GithubUserListContent(viewModel = githubUserListViewModel)
        }
    }

    @Composable
    private fun GithubUserListContent(viewModel: GithubUserListViewModel) {
        val dataState by viewModel.githubUserListResponse.collectAsState()
        val context = LocalContext.current
        Log.v("xxxxxx", dataState.toString())
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
                        showToast(this@GithubUserListScreen, getString(errorText))
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
                                ListGithubItemView(item = item, onItemClick = { clickedItem ->
                                    val intent = Intent(
                                        this@GithubUserListScreen,
                                        GithubUserDetailsScreen::class.java
                                    ).apply {
                                        putExtra(ApiConstants.DBN, clickedItem.login.toString())
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
                        text = "Github List",
                        modifier = Modifier.absolutePadding(
                            left = 0.dp, right = 5.dp, top = 5.dp, bottom = 5.dp
                        ),
                        style = typography.titleLarge.copy(color = Color.Black)
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

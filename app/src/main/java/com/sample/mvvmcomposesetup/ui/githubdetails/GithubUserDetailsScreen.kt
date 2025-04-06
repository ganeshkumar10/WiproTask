package com.sample.mvvmcomposesetup.ui.githubdetails

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.sample.mvvmcomposesetup.R
import com.sample.mvvmcomposesetup.base.UIState
import com.sample.mvvmcomposesetup.networkhelper.NoInternetException
import com.sample.mvvmcomposesetup.remote.ApiConstants
import com.sample.mvvmcomposesetup.ui.base.ShowLoading
import com.sample.mvvmcomposesetup.ui.base.showToast
import com.sample.mvvmcomposesetup.viewmodel.githubdetails.GithubUserDetailsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class GithubUserDetailsScreen : ComponentActivity() {

    private var name: String? = ""

    private lateinit var githubUserDetailsViewModel: GithubUserDetailsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        name = intent.getStringExtra(ApiConstants.DBN) ?: ""
        githubUserDetailsViewModel =
            ViewModelProvider(this)[GithubUserDetailsViewModel::class.java]
        lifecycleScope.launch {
            githubUserDetailsViewModel.getDetails(name.toString())
        }
        setContent {
            GithubUserDetailsContent(viewModel = githubUserDetailsViewModel)
        }
    }

    @Composable
    private fun GithubUserDetailsContent(viewModel: GithubUserDetailsViewModel) {
        val dataState by viewModel.githubUserDetailsResponse.collectAsState()
        val context = LocalContext.current
        Log.v("xxxxxx", dataState.toString())

        Scaffold(topBar = { AppTopAppBar() }) { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                when (dataState) {
                    UIState.Loading -> {
                        ShowLoading()
                    }

                    is UIState.Failure -> {
                        val errorText = when ((dataState as UIState.Failure).throwable) {
                            is NoInternetException -> R.string.no_internet_available
                            else -> R.string.something_went_wrong_try_again
                        }
                        showToast(context, getString(errorText))
                    }

                    is UIState.Success -> {
                        val overAllData = remember { (dataState as UIState.Success).data }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.White)
                                .padding(paddingValues)
                                .padding(horizontal = 20.dp)
                        ) {
                            Spacer(modifier = Modifier.height(20.dp))

                            Box(
                                contentAlignment = Alignment.BottomEnd,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_person), // replace with your image
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(100.dp)
                                        .clip(CircleShape)
                                        .align(Alignment.Center)
                                )

                                Icon(
                                    imageVector = Icons.Default.Face,
                                    contentDescription = "Edit",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .size(24.dp)
                                        .background(Color.Red, shape = CircleShape)
                                        .padding(4.dp)
                                        .align(Alignment.BottomEnd)
                                )
                            }

                            Spacer(modifier = Modifier.height(30.dp))

                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(24.dp)
                            ) {
                                Text(
                                    text = "Profile",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(bottom = 24.dp)
                                )

                                ProfileItem(
                                    label = "Username",
                                    value = overAllData.login.toString()
                                )
                                ProfileItem(label = "ID", value = overAllData.id.toString())
                                ProfileItem(
                                    label = "Phone Number",
                                    value = overAllData.userViewType.toString()
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun AppTopAppBar() {
        TopAppBar(
            title = {
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                    Text(
                        text = "Github User Details", modifier = Modifier.absolutePadding(
                            left = 0.dp, right = 5.dp, top = 5.dp, bottom = 5.dp
                        ), style = typography.titleLarge.copy(color = Color.Black)
                    )
                }
            }, colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary
            ), modifier = Modifier.fillMaxWidth()
        )
    }

    @Composable
    fun ProfileItem(label: String, value: String) {
        Column(modifier = Modifier.padding(vertical = 8.dp)) {
            Text(
                text = label,
                color = Color.Gray,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = value,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
            )
        }
    }
}
package com.sample.mvvmcomposesetup.ui.screen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.sample.mvvmcomposesetup.theme.AppTheme
import com.sample.mvvmcomposesetup.viewmodel.SplashViewModel
import com.sample.mvvmcomposesetup.ui.githublist.GithubUserListScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {

    private val splashViewModel: SplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
//                startActivity(Intent(this@SplashActivity, SchoolListScreen::class.java))
                startActivity(Intent(this@SplashActivity, GithubUserListScreen::class.java))
            }
        }
    }
}


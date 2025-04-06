package com.sample.mvvmcomposesetup.ui.school

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.sample.mvvmcomposesetup.viewmodel.SchoolListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SchoolListActivity : ComponentActivity() {

    private lateinit var schoolListViewModel: SchoolListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SchoolListContent(viewModel = schoolListViewModel)
        }
    }

    @Composable
    private fun SchoolListContent(viewModel: SchoolListViewModel) {

    }
}
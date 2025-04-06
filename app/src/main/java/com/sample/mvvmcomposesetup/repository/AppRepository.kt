package com.sample.mvvmcomposesetup.repository

import android.util.Log
import com.sample.mvvmcomposesetup.model.SchoolDetailsResponse
import com.sample.mvvmcomposesetup.model.SchoolListResponse
import com.sample.mvvmcomposesetup.remote.ApiDataSource
import com.sample.mvvmcomposesetup.model.response.GithubUserDetailsResponse
import com.sample.mvvmcomposesetup.model.response.UserListResponseItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AppRepository @Inject constructor(private val apiDataSource: ApiDataSource) {

    fun getSchoolList(): Flow<List<SchoolListResponse>> = flow {
        emit(apiDataSource.getSchoolList())
    }

    fun getSchoolDetails(dbn: String): Flow<List<SchoolDetailsResponse>> = flow {
        emit(apiDataSource.getSchoolDetails(dbn))
    }

    fun getGithubUserList(): Flow<List<UserListResponseItem>> = flow {
        emit(apiDataSource.getGithubUserList())
    }

    fun getGithubUserDetails(name: String): Flow<GithubUserDetailsResponse> = flow {
        Log.d("API_CALL", "Calling API for user: $name") // Add this
        emit(apiDataSource.getGithubDetails(name))
    }
}

package com.sample.mvvmcomposesetup.remote

import com.sample.mvvmcomposesetup.model.SchoolDetailsResponse
import com.sample.mvvmcomposesetup.model.SchoolListResponse
import com.sample.mvvmcomposesetup.model.response.GithubUserDetailsResponse
import com.sample.mvvmcomposesetup.model.response.UserListResponseItem
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface ApiDataSource {

    @GET(ApiConstants.API_SCHOOL_LIST)
    suspend fun getSchoolList(): List<SchoolListResponse>

    @GET(ApiConstants.API_SCHOOL_DETAILS)
    suspend fun getSchoolDetails(@Query(ApiConstants.DBN) dbn: String): List<SchoolDetailsResponse>

    @GET(ApiConstants.API_GITHUB_USER_LIST)
    suspend fun getGithubUserList(): List<UserListResponseItem>

    @GET("users/{username}")
    suspend fun getGithubDetails(@Path("username") username: String): GithubUserDetailsResponse
}

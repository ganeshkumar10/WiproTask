package com.sample.mvvmcomposesetup.app

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.sample.mvvmcomposesetup.repository.AppRepository
import com.sample.mvvmcomposesetup.remote.ApiDataSource
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
@InstallIn(SingletonComponent::class)
class ApiModule {


    @Provides
    @Singleton
    fun bindsApiDataSource(retrofit: Retrofit): ApiDataSource {
        return retrofit.create(ApiDataSource::class.java)
    }

    @Provides
    @Singleton
    fun bindsAppRepo(apiDataSource: ApiDataSource): AppRepository {
        return AppRepository(apiDataSource)
    }
}
package com.sample.mvvmcomposesetup.app

import android.content.Context
import com.sample.mvvmcomposesetup.application.AppController
import com.sample.mvvmcomposesetup.dispatcher.DefaultDispatcherProvider
import com.sample.mvvmcomposesetup.dispatcher.DispatcherProvider
import com.sample.mvvmcomposesetup.networkhelper.NetworkHelper
import com.sample.mvvmcomposesetup.networkhelper.NetworkHelperImpl
import com.sample.mvvmcomposesetup.preferences.AppPreference
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    internal fun providesContext(): Context {
        return AppController.instance?.applicationContext!!
    }

    @Provides
    @Singleton
    internal fun providesAppPreference(context: Context): AppPreference {
        return AppPreference(context)
    }

    @Provides
    @Singleton
    fun provideNetworkHelper(@ApplicationContext context: Context): NetworkHelper {
        return NetworkHelperImpl(context)
    }

    @Provides
    @Singleton
    fun provideDispatcher(): DispatcherProvider = DefaultDispatcherProvider()
}
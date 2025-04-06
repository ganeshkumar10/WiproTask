package com.sample.mvvmcomposesetup.base



sealed class UIState<out T> {
    object Loading : UIState<Nothing>()
    data class Success<out T>(val data: T) : UIState<T>()
    data class Failure(val throwable: Throwable) : UIState<Nothing>()
}

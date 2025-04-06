package com.sample.mvvmcomposesetup.viewmodel

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sample.mvvmcomposesetup.base.UIState
import com.sample.mvvmcomposesetup.dispatcher.DispatcherProvider
import com.sample.mvvmcomposesetup.model.SchoolListResponse
import com.sample.mvvmcomposesetup.networkhelper.NetworkHelper
import com.sample.mvvmcomposesetup.networkhelper.NoInternetException
import com.sample.mvvmcomposesetup.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SchoolListViewModel @Inject constructor(
    private val dispatcherProvider: DispatcherProvider,
    private val networkHelper: NetworkHelper,
    private val appRepo: AppRepository
) : ViewModel() {
    private val _schoolListResponse =
        MutableStateFlow<UIState<List<SchoolListResponse>>>(UIState.Loading)
    val schoolListResponse: StateFlow<UIState<List<SchoolListResponse>>> = _schoolListResponse

    init {
        fetchSchoolList()
    }

    private fun fetchSchoolList() {
        viewModelScope.launch(dispatcherProvider.io) {
            try {
                if (!networkHelper.isNetworkConnected()) {
                    _schoolListResponse.emit(UIState.Failure(NoInternetException()))
                    return@launch
                }
                _schoolListResponse.emit(UIState.Loading) // Ensure loading state is emitted
                appRepo.getSchoolList()
                    .flowOn(dispatcherProvider.io)
                    .catch { exception ->
                        _schoolListResponse.emit(UIState.Failure(exception))
                    }.collectLatest { response ->
                        _schoolListResponse.emit(UIState.Success(response))
                    }
            } catch (e: Exception) {
                _schoolListResponse.emit(UIState.Failure(e))
            }
        }
    }
}

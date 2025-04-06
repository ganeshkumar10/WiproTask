package com.sample.mvvmcomposesetup.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sample.mvvmcomposesetup.base.UIState
import com.sample.mvvmcomposesetup.dispatcher.DispatcherProvider
import com.sample.mvvmcomposesetup.model.SchoolDetailsResponse
import com.sample.mvvmcomposesetup.networkhelper.NetworkHelper
import com.sample.mvvmcomposesetup.networkhelper.NoInternetException
import com.sample.mvvmcomposesetup.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SchoolDetailViewModel @Inject constructor(
    private val dispatcherProvider: DispatcherProvider,
    private val networkHelper: NetworkHelper,
    private val appRepo: AppRepository
) : ViewModel() {

    private val _schoolDetailsResponse =
        MutableStateFlow<UIState<List<SchoolDetailsResponse>>>(UIState.Loading)
    val schoolDetailsResponse: StateFlow<UIState<List<SchoolDetailsResponse>>> =
        _schoolDetailsResponse

    private val _dbn = MutableStateFlow<String?>(null)

    init {
        viewModelScope.launch(dispatcherProvider.io) {  // Run on IO dispatcher
            _dbn.collectLatest { dbn ->
                dbn?.let { getSchoolDetails(it) }
            }
        }
    }

    fun updateDbn(dbn: String) {
        if (_dbn.value != dbn) {  // Prevent unnecessary updates
            _dbn.value = dbn
        }
    }

    suspend fun getSchoolDetails(dbn: String) {
        if (!networkHelper.isNetworkConnected()) {
            _schoolDetailsResponse.emit(UIState.Failure(NoInternetException()))
            return
        }

        _schoolDetailsResponse.emit(UIState.Loading)  // Show loading before fetching data

        appRepo.getSchoolDetails(dbn)
            .flowOn(dispatcherProvider.io)  // Ensure network call runs on IO
            .catch { exception ->
                _schoolDetailsResponse.emit(UIState.Failure(exception))
            }.collect { response ->
                _schoolDetailsResponse.emit(UIState.Success(response))
            }
    }
}


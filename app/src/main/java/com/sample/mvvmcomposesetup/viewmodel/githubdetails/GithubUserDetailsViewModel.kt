package com.sample.mvvmcomposesetup.viewmodel.githubdetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sample.mvvmcomposesetup.base.UIState
import com.sample.mvvmcomposesetup.dispatcher.DispatcherProvider
import com.sample.mvvmcomposesetup.model.response.GithubUserDetailsResponse
import com.sample.mvvmcomposesetup.networkhelper.NetworkHelper
import com.sample.mvvmcomposesetup.networkhelper.NoInternetException
import com.sample.mvvmcomposesetup.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GithubUserDetailsViewModel @Inject constructor(
    private val dispatcherProvider: DispatcherProvider,
    private val networkHelper: NetworkHelper,
    private val appRepo: AppRepository
) : ViewModel() {

    private val _githubUserDetailsResponse =
        MutableStateFlow<UIState<GithubUserDetailsResponse>>(UIState.Loading)
    val githubUserDetailsResponse: StateFlow<UIState<GithubUserDetailsResponse>> =
        _githubUserDetailsResponse

    private val _userName = MutableStateFlow<String?>(null)

    /* init {
         viewModelScope.launch(dispatcherProvider.io) {
             _userName.collectLatest { dbn ->
                 dbn?.let { getDetails(it) }
             }
         }
     }*/

    suspend fun getDetails(name: String) {

        viewModelScope.launch(dispatcherProvider.io) {
            try {
                if (!networkHelper.isNetworkConnected()) {
                    _githubUserDetailsResponse.emit(UIState.Failure(NoInternetException()))
                    return@launch
                }
                _githubUserDetailsResponse.emit(UIState.Loading)  // Show loading before fetching data
                appRepo.getGithubUserDetails(name)
                    .flowOn(dispatcherProvider.io)  // Ensure network call runs on IO
                    .catch { exception ->
                        _githubUserDetailsResponse.emit(UIState.Failure(exception))
                    }.collect { response ->
                        _githubUserDetailsResponse.emit(UIState.Success(response))
                    }
            } catch (e: Exception) {
                _githubUserDetailsResponse.emit(UIState.Failure(e))
            }
        }
    }
}

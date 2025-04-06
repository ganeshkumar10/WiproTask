package com.sample.mvvmcomposesetup.viewmodel.githublist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sample.mvvmcomposesetup.base.UIState
import com.sample.mvvmcomposesetup.dispatcher.DispatcherProvider
import com.sample.mvvmcomposesetup.model.response.UserListResponseItem
import com.sample.mvvmcomposesetup.networkhelper.NetworkHelper
import com.sample.mvvmcomposesetup.networkhelper.NoInternetException
import com.sample.mvvmcomposesetup.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GithubUserListViewModel @Inject constructor(
    private val dispatcherProvider: DispatcherProvider,
    private val networkHelper: NetworkHelper,
    private val appRepo: AppRepository
) : ViewModel() {
    private val _githubUserListResponse =
        MutableStateFlow<UIState<List<UserListResponseItem>>>(UIState.Loading)
    val githubUserListResponse: StateFlow<UIState<List<UserListResponseItem>>> = _githubUserListResponse

    init {
        getGithubUserList()
    }

    private fun getGithubUserList() {
        viewModelScope.launch(dispatcherProvider.io) {
            try {
                if (!networkHelper.isNetworkConnected()) {
                    _githubUserListResponse.emit(UIState.Failure(NoInternetException()))
                    return@launch
                }
                _githubUserListResponse.emit(UIState.Loading) // Ensure loading state is emitted
                appRepo.getGithubUserList()
                    .flowOn(dispatcherProvider.io)
                    .catch { exception ->
                        _githubUserListResponse.emit(UIState.Failure(exception))
                    }.collectLatest { response ->
                        _githubUserListResponse.emit(UIState.Success(response))
                    }
            } catch (e: Exception) {
                _githubUserListResponse.emit(UIState.Failure(e))
            }
        }
    }

}
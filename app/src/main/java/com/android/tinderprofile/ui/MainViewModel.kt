package com.android.tinderprofile.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.android.tinderprofile.base.BaseViewModel

class MainViewModel(private val mRepo: MainRepo) : BaseViewModel() {

    val liveData: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }
    fun getUsers() {
        if (basehelper?.isNetworkAvailable()!!) {
            basehelper?.showProgressBar()
            viewModelScope.launch {
                mRepo.getUsers(
                    liveData,
                    errorLiveData
                )
            }
        }
    }
}
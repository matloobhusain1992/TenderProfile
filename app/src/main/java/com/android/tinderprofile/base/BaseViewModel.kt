package com.android.tinderprofile.base

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import net.one97.selfcare.globacom.BaseHelper
import com.android.tinderprofile.data.remote.EmptyResponse

open class BaseViewModel: ViewModel() {

    var basehelper: BaseHelper? = null
    val errorLiveData = MutableLiveData<EmptyResponse>()

    fun setErrorObserver(owner: LifecycleOwner, errorObserver: Observer<EmptyResponse>) {
        errorLiveData.observe(owner, errorObserver)
    }

    override fun onCleared() {
        basehelper = null
        super.onCleared()
    }
}
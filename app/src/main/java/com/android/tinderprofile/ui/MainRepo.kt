package com.android.tinderprofile.ui

import androidx.lifecycle.MutableLiveData
import com.android.tinderprofile.base.BaseApplication
import com.android.tinderprofile.data.local.AppDataStore
import com.android.tinderprofile.data.remote.ApiManager
import com.android.tinderprofile.base.BaseRepository
import com.android.tinderprofile.data.remote.EmptyResponse
import com.android.tinderprofile.data.remote.ResultWrapper
import com.android.tinderprofile.data.local.room.User

class MainRepo: BaseRepository() {

    suspend fun getUsers(
        liveData: MutableLiveData<Boolean>,
        errorLiveData: MutableLiveData<EmptyResponse>
    ) {
        safeApiCall {
            ApiManager.retrofitService.getUsers(10)
        }.let {
            when (it) {
                is ResultWrapper.Success -> {
                    val user = it.response as User
                    BaseApplication.INSTANCE.userDao().insertUsers(user.results)
                    AppDataStore.saveBooleanPref(AppDataStore.IS_FIRST_TIME,true)
                    liveData.value = true
                }
                is ResultWrapper.GenericError -> {
                    errorLiveData.value = it.response as EmptyResponse
                }
            }
        }
    }
}
package com.android.tinderprofile.data.local

import com.android.tinderprofile.R
import com.android.tinderprofile.base.BaseApplication

enum class NetworkStatusMessage(val message: String) {
    NO_INTERNET(BaseApplication.instance.getString(R.string.connectionError)),
    SERVER_ERROR(BaseApplication.instance.getString(R.string.connectionError)),
    CONNECTION_ERROR(BaseApplication.instance.getString(R.string.connectionError))
}

enum class UserStatus(val status: String){
    ACCEPT("ACCEPT"),
    DECLINE("DECLINE"),
    NONE("NONE")
}
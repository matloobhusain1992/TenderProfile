package com.android.tinderprofile.data.remote

sealed class ResultWrapper<out T> {
    data class Success<out T>(val response: T?) : ResultWrapper<T?>()
    data class GenericError<out T>(val response: T?) : ResultWrapper<T?>()
}
package com.android.tinderprofile.base

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.android.tinderprofile.data.local.NetworkStatusMessage
import com.android.tinderprofile.data.remote.EmptyResponse
import com.android.tinderprofile.data.remote.ResultWrapper
import java.net.ConnectException
import java.net.SocketException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.concurrent.TimeoutException

open class BaseRepository {

    suspend fun <T> safeApiCall(
        dispatcher: CoroutineDispatcher = Dispatchers.IO,
        apiCall: suspend () -> T
    ): ResultWrapper<Any?> {
        return withContext(dispatcher) {
            handleApiCallAndResponse(apiCall)
        }
    }

    private suspend fun <T> handleApiCallAndResponse(
        apiCall: suspend () -> T
    ): ResultWrapper<Any?> {
        try {
            val response = apiCall.invoke()
            return ResultWrapper.Success(response)
        } catch (throwable: Throwable) {

            when (throwable) {
                is SocketTimeoutException,
                is SocketException,
                is ConnectException,
                is TimeoutException,
                is UnknownHostException
                -> {
                    val errorResponse = getDefaultErrorObject()
                    errorResponse.msg = NetworkStatusMessage.CONNECTION_ERROR.message
                    return ResultWrapper.GenericError(errorResponse)
                }

                else -> {
                    val errorResponse = getDefaultErrorObject()
                    errorResponse.msg =
                        throwable.localizedMessage ?: NetworkStatusMessage.SERVER_ERROR.message
                    return ResultWrapper.GenericError(errorResponse)
                }
            }
        }
    }

    private fun getDefaultErrorObject(): EmptyResponse {
        return EmptyResponse()
    }

}
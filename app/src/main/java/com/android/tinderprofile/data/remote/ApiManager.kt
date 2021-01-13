package com.android.tinderprofile.data.remote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiManager {

    private const val CONNECTION_TIMEOUT: Long = 60L

    val retrofitService: ApiInterface by lazy { retrofit.create(ApiInterface::class.java) }

    // Configure retrofit to parse JSON and use coroutines
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://randomuser.me")
        .client(getOkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    private fun getOkHttpClient(): OkHttpClient {
        val okClientBuilder = OkHttpClient.Builder()

        val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        okClientBuilder.addInterceptor(httpLoggingInterceptor)

        okClientBuilder.connectTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
        okClientBuilder.readTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
        okClientBuilder.writeTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
        okClientBuilder.callTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)

        return okClientBuilder.build()
    }

}
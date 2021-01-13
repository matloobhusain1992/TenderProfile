package com.android.tinderprofile.data.remote

import com.android.tinderprofile.data.local.room.User
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/api/")
    suspend fun getUsers(@Query("results") count: Int): User
}


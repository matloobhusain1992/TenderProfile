package com.android.tinderprofile.base

import android.app.Application
import androidx.room.Room
import com.android.tinderprofile.data.local.AppDataStore
import com.android.tinderprofile.data.local.room.UserRoomDatabase

class BaseApplication: Application() {

    companion object {
        lateinit var instance: BaseApplication
        lateinit var INSTANCE: UserRoomDatabase
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        AppDataStore.initDataStore(instance)
        INSTANCE = Room.databaseBuilder(
            this,
            UserRoomDatabase::class.java,
            "user_database"
        ).allowMainThreadQueries().build()
    }


}
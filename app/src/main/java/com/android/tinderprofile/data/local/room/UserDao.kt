package com.android.tinderprofile.data.local.room

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Query("SELECT * FROM user_table")
    fun getUsers(): List<Result>

    @Insert
    suspend fun insertUsers(users: List<Result>)

    @Update
    suspend fun updateUser(users: Result)
}
package com.android.tinderprofile.data.local

import android.content.Context
import androidx.datastore.DataStore
import androidx.datastore.preferences.Preferences
import androidx.datastore.preferences.createDataStore
import androidx.datastore.preferences.edit
import androidx.datastore.preferences.preferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


object AppDataStore {

    private lateinit var dataStore: DataStore<Preferences>

    val IS_FIRST_TIME = preferencesKey<Boolean>("IS_FIRST_TIME")

    fun initDataStore(context: Context) {
        dataStore = context.createDataStore(name = "app_preferences")
    }

    fun getBooleanPref(key: Preferences.Key<Boolean>): Flow<Boolean?> {
        val bookmark: Flow<Boolean?> = dataStore.data.map { preferences ->
            preferences[key]
        }
        return bookmark
    }

    suspend fun saveBooleanPref(key: Preferences.Key<Boolean>, value: Boolean) {
        dataStore.edit { preferences ->
            preferences[key] = value
        }
    }
}

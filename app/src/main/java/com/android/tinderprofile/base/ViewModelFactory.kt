package com.android.tinderprofile.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.tinderprofile.ui.MainRepo
import com.android.tinderprofile.ui.MainViewModel

/**
 * Factory for constructing ViewModel with parameter
 */
class ViewModelFactory(private val repo: BaseRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MainViewModel(repo as MainRepo) as T

        }
        throw IllegalArgumentException("Unable to construct viewmodel")
    }
}
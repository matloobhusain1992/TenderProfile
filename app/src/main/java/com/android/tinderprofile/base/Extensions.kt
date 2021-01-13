package com.android.tinderprofile.base

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


inline fun <reified T : ViewModel> AppCompatActivity.getViewModel(mainRepo: BaseRepository): T {
    return ViewModelProvider(this,ViewModelFactory(mainRepo)).get(T::class.java)
}


fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}
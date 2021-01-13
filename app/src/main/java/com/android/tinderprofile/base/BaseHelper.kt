package net.one97.selfcare.globacom

interface BaseHelper {
    fun showProgressBar()
    fun hideProgressBar()
    fun showShortToast(msg: String?)
    fun showLongToast(msg: String?)
    fun isNetworkAvailable() : Boolean
    fun showNoNetworkError()
}
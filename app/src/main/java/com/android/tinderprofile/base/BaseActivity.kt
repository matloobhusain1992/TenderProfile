package com.android.tinderprofile.base

import android.app.Dialog
import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.viewbinding.ViewBinding
import com.android.tinderprofile.R
import net.one97.selfcare.globacom.BaseHelper
import com.android.tinderprofile.data.local.AppDataStore
import com.android.tinderprofile.data.local.NetworkStatusMessage
import com.android.tinderprofile.data.remote.EmptyResponse

abstract class BaseActivity<viewBinding : ViewBinding, ViewModel : BaseViewModel> :
    AppCompatActivity(), BaseHelper {

    var binding: viewBinding? = null
    var viewModel: ViewModel? = null


    private var mProgressDialog: Dialog? = null
    lateinit var appDataStore: AppDataStore

    abstract fun initViewBinding(): viewBinding?

    abstract fun initViewModel(): ViewModel?

    abstract fun initVariables()

    abstract fun setObservers()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = initViewBinding()
        setContentView(binding?.root)
        viewModel = initViewModel()
        viewModel?.basehelper = this
        setErrorObserver()

        initVariables()
        setObservers()
    }

    private fun setErrorObserver() {
        viewModel?.setErrorObserver(this, Observer {
            hideProgressBar()
            handleApiErrorResponse(it)
        })
    }


    override fun showProgressBar() {
        if (!isFinishing && !isDestroyed) {
            hideProgressBar()

            mProgressDialog = Dialog(this)
            mProgressDialog?.setContentView(R.layout.layout_progressbar)
            mProgressDialog?.setCancelable(false)

            mProgressDialog?.window?.let {
                it.setBackgroundDrawable(
                    ContextCompat.getDrawable(this, android.R.color.transparent)
                )
                it.setDimAmount(0.1f)
            }

            mProgressDialog?.show()
        }
    }

    override fun hideProgressBar() {

        if (!isFinishing && mProgressDialog != null && mProgressDialog!!.isShowing) {
            mProgressDialog?.dismiss()
            mProgressDialog = null
        }
    }

    override fun showShortToast(msg: String?) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun showLongToast(msg: String?) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    override fun isNetworkAvailable(): Boolean {

        return if (checkNetworkStatus()) {
            true
        } else {
            showNoNetworkError()
            false
        }
    }

    private fun checkNetworkStatus(): Boolean {

        val connectivity = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivity.activeNetworkInfo

        return (networkInfo != null && networkInfo.isAvailable && networkInfo.isConnected)
    }

    override fun showNoNetworkError() {
        showLongToast(getString(R.string.no_internet))
    }

    protected open fun handleApiErrorResponse(responseModel: EmptyResponse) {
        val message = responseModel.msg ?: NetworkStatusMessage.SERVER_ERROR.message
        showLongToast(message)
    }

}
package com.android.tinderprofile.ui

import android.content.Context
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import com.android.tinderprofile.base.BaseActivity
import com.android.tinderprofile.base.BaseApplication
import com.android.tinderprofile.base.getViewModel
import com.android.tinderprofile.data.local.AppDataStore
import com.android.tinderprofile.databinding.ActivityMainBinding
import com.mindorks.placeholderview.SwipeDecor
import com.mindorks.placeholderview.SwipePlaceHolderView
import com.mindorks.placeholderview.SwipeViewBuilder


class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    private var mContext: Context? = null
    private lateinit var mSwipeView: SwipePlaceHolderView

    override fun initViewBinding() = ActivityMainBinding.inflate(layoutInflater)

    override fun initViewModel() = getViewModel<MainViewModel>(MainRepo())

    override fun initVariables() {
        mContext = applicationContext
        AppDataStore.getBooleanPref(AppDataStore.IS_FIRST_TIME).asLiveData()
            .observe(this, Observer {
                if (it == true) {
                    getData()
                } else {
                    viewModel?.getUsers()
                }
            })
    }

    override fun setObservers() {
        viewModel?.liveData?.observe(this, Observer {
            if(it == true){
                hideProgressBar()
                getData()
            }
        })

        mSwipeView = binding?.swipeView!!
        mSwipeView.getBuilder<SwipePlaceHolderView, SwipeViewBuilder<SwipePlaceHolderView>>()
            .setDisplayViewCount(10)
            .setSwipeDecor(
                SwipeDecor()
                    .setPaddingTop(20)
                    .setRelativeScale(0.01f)
            )
    }

    private fun getData() {
        val dao = BaseApplication.INSTANCE.userDao()
        val users = dao.getUsers()
        for (profile in users) {
            binding?.swipeView?.addView(TinderCard(mContext!!, profile, mSwipeView))
        }
    }
}
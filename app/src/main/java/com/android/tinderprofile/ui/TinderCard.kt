package com.android.tinderprofile.ui

import android.content.Context
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import com.android.tinderprofile.R
import com.android.tinderprofile.base.BaseApplication
import com.android.tinderprofile.base.gone
import com.android.tinderprofile.base.visible
import com.android.tinderprofile.data.local.UserStatus
import com.android.tinderprofile.data.local.room.Result
import com.bumptech.glide.Glide
import com.mindorks.placeholderview.SwipePlaceHolderView
import com.mindorks.placeholderview.annotations.Layout
import com.mindorks.placeholderview.annotations.Resolve
import com.mindorks.placeholderview.annotations.View
import com.mindorks.placeholderview.annotations.swipe.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


@Layout(R.layout.tinder_card_view)
class TinderCard(context: Context, profile: Result, swipeView: SwipePlaceHolderView) {
    @View(R.id.profileImageView)
    private val profileImageView: ImageView? = null

    @View(R.id.nameTxt)
    private val nameTxt: AppCompatTextView? = null

    @View(R.id.ageTxt)
    private val ageTxt: AppCompatTextView? = null

    @View(R.id.llParent)
    private val parent: LinearLayout? = null

    @View(R.id.declineBtn)
    private val declineBtn: AppCompatButton? = null

    @View(R.id.acceptBtn)
    private val acceptBtn: AppCompatButton? = null

    @View(R.id.message)
    private val message: AppCompatTextView? = null

    private val mProfile: Result
    private val mContext: Context
    private val mSwipeView: SwipePlaceHolderView

    @Resolve
    private fun onResolved() {
        Glide.with(mContext).load(mProfile.picture?.large)
            .into(profileImageView!!)
        nameTxt?.setText(mProfile.name?.title + " " + mProfile.name?.first+" "+mProfile.name?.last)
        ageTxt?.setText(mProfile.dob?.age.toString())

        if(mProfile.status == UserStatus.ACCEPT.status){
            message?.visible()
            message?.text = mContext.getString(R.string.member_accepted)
        } else if(mProfile.status == UserStatus.DECLINE.status){
            message?.visible()
            message?.text = mContext.getString(R.string.member_declined)
        } else {
            parent?.visible()
        }

        acceptBtn?.setOnClickListener {
            GlobalScope.launch(Dispatchers.IO) {
                mProfile.status = UserStatus.ACCEPT.status
                BaseApplication.INSTANCE.userDao().updateUser(mProfile)
            }
            message?.visible()
            message?.text = mContext.getString(R.string.member_accepted)
            parent?.gone()
        }

        declineBtn?.setOnClickListener {
            GlobalScope.launch(Dispatchers.IO) {
                mProfile.status = UserStatus.DECLINE.status
                BaseApplication.INSTANCE.userDao().updateUser(mProfile)
            }
            message?.visible()
            message?.text = mContext.getString(R.string.member_declined)
            parent?.gone()
        }
    }

    @SwipeOut
    private fun onSwipedOut() {
        Log.d("EVENT", "onSwipedOut")
        //mSwipeView.addView(this)
    }

    @SwipeCancelState
    private fun onSwipeCancelState() {
        Log.d("EVENT", "onSwipeCancelState")
    }

    @SwipeIn
    private fun onSwipeIn() {
        Log.d("EVENT", "onSwipedIn")
    }

    @SwipeInState
    private fun onSwipeInState() {
        Log.d("EVENT", "onSwipeInState")
    }

    @SwipeOutState
    private fun onSwipeOutState() {
        Log.d("EVENT", "onSwipeOutState")
    }

    init {
        mContext = context
        mProfile = profile
        mSwipeView = swipeView
    }
}
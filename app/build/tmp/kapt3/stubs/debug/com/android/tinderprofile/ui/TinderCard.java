package com.android.tinderprofile.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0003J\b\u0010\u0019\u001a\u00020\u0018H\u0003J\b\u0010\u001a\u001a\u00020\u0018H\u0003J\b\u0010\u001b\u001a\u00020\u0018H\u0003J\b\u0010\u001c\u001a\u00020\u0018H\u0003J\b\u0010\u001d\u001a\u00020\u0018H\u0003R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/android/tinderprofile/ui/TinderCard;", "", "context", "Landroid/content/Context;", "profile", "Lcom/android/tinderprofile/data/local/room/Result;", "swipeView", "Lcom/mindorks/placeholderview/SwipePlaceHolderView;", "(Landroid/content/Context;Lcom/android/tinderprofile/data/local/room/Result;Lcom/mindorks/placeholderview/SwipePlaceHolderView;)V", "acceptBtn", "Landroidx/appcompat/widget/AppCompatButton;", "ageTxt", "Landroidx/appcompat/widget/AppCompatTextView;", "declineBtn", "mContext", "mProfile", "mSwipeView", "message", "nameTxt", "parent", "Landroid/widget/LinearLayout;", "profileImageView", "Landroid/widget/ImageView;", "onResolved", "", "onSwipeCancelState", "onSwipeIn", "onSwipeInState", "onSwipeOutState", "onSwipedOut", "app_debug"})
@com.mindorks.placeholderview.annotations.Layout(value = com.android.tinderprofile.R.layout.tinder_card_view)
public final class TinderCard {
    @com.mindorks.placeholderview.annotations.View(value = com.android.tinderprofile.R.id.profileImageView)
    private final android.widget.ImageView profileImageView = null;
    @com.mindorks.placeholderview.annotations.View(value = com.android.tinderprofile.R.id.nameTxt)
    private final androidx.appcompat.widget.AppCompatTextView nameTxt = null;
    @com.mindorks.placeholderview.annotations.View(value = com.android.tinderprofile.R.id.ageTxt)
    private final androidx.appcompat.widget.AppCompatTextView ageTxt = null;
    @com.mindorks.placeholderview.annotations.View(value = com.android.tinderprofile.R.id.llParent)
    private final android.widget.LinearLayout parent = null;
    @com.mindorks.placeholderview.annotations.View(value = com.android.tinderprofile.R.id.declineBtn)
    private final androidx.appcompat.widget.AppCompatButton declineBtn = null;
    @com.mindorks.placeholderview.annotations.View(value = com.android.tinderprofile.R.id.acceptBtn)
    private final androidx.appcompat.widget.AppCompatButton acceptBtn = null;
    @com.mindorks.placeholderview.annotations.View(value = com.android.tinderprofile.R.id.message)
    private final androidx.appcompat.widget.AppCompatTextView message = null;
    private final com.android.tinderprofile.data.local.room.Result mProfile = null;
    private final android.content.Context mContext = null;
    private final com.mindorks.placeholderview.SwipePlaceHolderView mSwipeView = null;
    
    @com.mindorks.placeholderview.annotations.Resolve()
    private final void onResolved() {
    }
    
    @com.mindorks.placeholderview.annotations.swipe.SwipeOut()
    private final void onSwipedOut() {
    }
    
    @com.mindorks.placeholderview.annotations.swipe.SwipeCancelState()
    private final void onSwipeCancelState() {
    }
    
    @com.mindorks.placeholderview.annotations.swipe.SwipeIn()
    private final void onSwipeIn() {
    }
    
    @com.mindorks.placeholderview.annotations.swipe.SwipeInState()
    private final void onSwipeInState() {
    }
    
    @com.mindorks.placeholderview.annotations.swipe.SwipeOutState()
    private final void onSwipeOutState() {
    }
    
    public TinderCard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.android.tinderprofile.data.local.room.Result profile, @org.jetbrains.annotations.NotNull()
    com.mindorks.placeholderview.SwipePlaceHolderView swipeView) {
        super();
    }
}
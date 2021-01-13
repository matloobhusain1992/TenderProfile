package com.android.tinderprofile.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u001c\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/android/tinderprofile/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "basehelper", "Lnet/one97/selfcare/globacom/BaseHelper;", "getBasehelper", "()Lnet/one97/selfcare/globacom/BaseHelper;", "setBasehelper", "(Lnet/one97/selfcare/globacom/BaseHelper;)V", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/android/tinderprofile/data/remote/EmptyResponse;", "getErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "onCleared", "", "setErrorObserver", "owner", "Landroidx/lifecycle/LifecycleOwner;", "errorObserver", "Landroidx/lifecycle/Observer;", "app_debug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private net.one97.selfcare.globacom.BaseHelper basehelper;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.android.tinderprofile.data.remote.EmptyResponse> errorLiveData = null;
    
    @org.jetbrains.annotations.Nullable()
    public final net.one97.selfcare.globacom.BaseHelper getBasehelper() {
        return null;
    }
    
    public final void setBasehelper(@org.jetbrains.annotations.Nullable()
    net.one97.selfcare.globacom.BaseHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.android.tinderprofile.data.remote.EmptyResponse> getErrorLiveData() {
        return null;
    }
    
    public final void setErrorObserver(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<com.android.tinderprofile.data.remote.EmptyResponse> errorObserver) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
}
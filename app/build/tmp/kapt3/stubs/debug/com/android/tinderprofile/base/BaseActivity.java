package com.android.tinderprofile.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH&J\u000f\u0010$\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0010J\u000f\u0010%\u001a\u0004\u0018\u00018\u0001H&\u00a2\u0006\u0002\u0010\u0018J\b\u0010&\u001a\u00020\u001dH\u0016J\u0012\u0010\'\u001a\u00020\u001f2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH&J\u0012\u0010,\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u001fH\u0016J\b\u00100\u001a\u00020\u001fH\u0016J\u0012\u00101\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0004\u0018\u00018\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u00062"}, d2 = {"Lcom/android/tinderprofile/base/BaseActivity;", "viewBinding", "Landroidx/viewbinding/ViewBinding;", "ViewModel", "Lcom/android/tinderprofile/base/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "Lnet/one97/selfcare/globacom/BaseHelper;", "()V", "appDataStore", "Lcom/android/tinderprofile/data/local/AppDataStore;", "getAppDataStore", "()Lcom/android/tinderprofile/data/local/AppDataStore;", "setAppDataStore", "(Lcom/android/tinderprofile/data/local/AppDataStore;)V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "mProgressDialog", "Landroid/app/Dialog;", "viewModel", "getViewModel", "()Lcom/android/tinderprofile/base/BaseViewModel;", "setViewModel", "(Lcom/android/tinderprofile/base/BaseViewModel;)V", "Lcom/android/tinderprofile/base/BaseViewModel;", "checkNetworkStatus", "", "handleApiErrorResponse", "", "responseModel", "Lcom/android/tinderprofile/data/remote/EmptyResponse;", "hideProgressBar", "initVariables", "initViewBinding", "initViewModel", "isNetworkAvailable", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setErrorObserver", "setObservers", "showLongToast", "msg", "", "showNoNetworkError", "showProgressBar", "showShortToast", "app_debug"})
public abstract class BaseActivity<viewBinding extends androidx.viewbinding.ViewBinding, ViewModel extends com.android.tinderprofile.base.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity implements net.one97.selfcare.globacom.BaseHelper {
    @org.jetbrains.annotations.Nullable()
    private viewBinding binding;
    @org.jetbrains.annotations.Nullable()
    private ViewModel viewModel;
    private android.app.Dialog mProgressDialog;
    @org.jetbrains.annotations.NotNull()
    public com.android.tinderprofile.data.local.AppDataStore appDataStore;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final viewBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    viewBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    ViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.tinderprofile.data.local.AppDataStore getAppDataStore() {
        return null;
    }
    
    public final void setAppDataStore(@org.jetbrains.annotations.NotNull()
    com.android.tinderprofile.data.local.AppDataStore p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract viewBinding initViewBinding();
    
    @org.jetbrains.annotations.Nullable()
    public abstract ViewModel initViewModel();
    
    public abstract void initVariables();
    
    public abstract void setObservers();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setErrorObserver() {
    }
    
    @java.lang.Override()
    public void showProgressBar() {
    }
    
    @java.lang.Override()
    public void hideProgressBar() {
    }
    
    @java.lang.Override()
    public void showShortToast(@org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void showLongToast(@org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public boolean isNetworkAvailable() {
        return false;
    }
    
    private final boolean checkNetworkStatus() {
        return false;
    }
    
    @java.lang.Override()
    public void showNoNetworkError() {
    }
    
    protected void handleApiErrorResponse(@org.jetbrains.annotations.NotNull()
    com.android.tinderprofile.data.remote.EmptyResponse responseModel) {
    }
    
    public BaseActivity() {
        super();
    }
}
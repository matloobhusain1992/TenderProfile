package net.one97.selfcare.globacom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\f"}, d2 = {"Lnet/one97/selfcare/globacom/BaseHelper;", "", "hideProgressBar", "", "isNetworkAvailable", "", "showLongToast", "msg", "", "showNoNetworkError", "showProgressBar", "showShortToast", "app_debug"})
public abstract interface BaseHelper {
    
    public abstract void showProgressBar();
    
    public abstract void hideProgressBar();
    
    public abstract void showShortToast(@org.jetbrains.annotations.Nullable()
    java.lang.String msg);
    
    public abstract void showLongToast(@org.jetbrains.annotations.Nullable()
    java.lang.String msg);
    
    public abstract boolean isNetworkAvailable();
    
    public abstract void showNoNetworkError();
}
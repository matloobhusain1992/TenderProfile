package com.android.tinderprofile.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/android/tinderprofile/data/remote/ApiManager;", "", "()V", "CONNECTION_TIMEOUT", "", "retrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "retrofitService", "Lcom/android/tinderprofile/data/remote/ApiInterface;", "getRetrofitService", "()Lcom/android/tinderprofile/data/remote/ApiInterface;", "retrofitService$delegate", "Lkotlin/Lazy;", "getOkHttpClient", "Lokhttp3/OkHttpClient;", "app_debug"})
public final class ApiManager {
    private static final long CONNECTION_TIMEOUT = 60L;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy retrofitService$delegate = null;
    private static final retrofit2.Retrofit retrofit = null;
    public static final com.android.tinderprofile.data.remote.ApiManager INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.tinderprofile.data.remote.ApiInterface getRetrofitService() {
        return null;
    }
    
    private final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    private ApiManager() {
        super();
    }
}
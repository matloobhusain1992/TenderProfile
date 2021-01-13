package com.android.tinderprofile.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J=\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\b\u0000\u0010\u00072\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJG\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\b\u0000\u0010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/android/tinderprofile/base/BaseRepository;", "", "()V", "getDefaultErrorObject", "Lcom/android/tinderprofile/data/remote/EmptyResponse;", "handleApiCallAndResponse", "Lcom/android/tinderprofile/data/remote/ResultWrapper;", "T", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeApiCall", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public class BaseRepository {
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.lang.Object safeApiCall(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.android.tinderprofile.data.remote.ResultWrapper<? extends java.lang.Object>> p2) {
        return null;
    }
    
    private final com.android.tinderprofile.data.remote.EmptyResponse getDefaultErrorObject() {
        return null;
    }
    
    public BaseRepository() {
        super();
    }
}
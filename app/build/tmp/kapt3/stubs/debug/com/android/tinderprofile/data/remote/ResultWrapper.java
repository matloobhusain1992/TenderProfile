package com.android.tinderprofile.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/android/tinderprofile/data/remote/ResultWrapper;", "T", "", "()V", "GenericError", "Success", "Lcom/android/tinderprofile/data/remote/ResultWrapper$Success;", "Lcom/android/tinderprofile/data/remote/ResultWrapper$GenericError;", "app_debug"})
public abstract class ResultWrapper<T extends java.lang.Object> {
    
    private ResultWrapper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/android/tinderprofile/data/remote/ResultWrapper$Success;", "T", "Lcom/android/tinderprofile/data/remote/ResultWrapper;", "response", "(Ljava/lang/Object;)V", "getResponse", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/android/tinderprofile/data/remote/ResultWrapper$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.android.tinderprofile.data.remote.ResultWrapper<T> {
        @org.jetbrains.annotations.Nullable()
        private final T response = null;
        
        @org.jetbrains.annotations.Nullable()
        public final T getResponse() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.Nullable()
        T response) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.tinderprofile.data.remote.ResultWrapper.Success<T> copy(@org.jetbrains.annotations.Nullable()
        T response) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/android/tinderprofile/data/remote/ResultWrapper$GenericError;", "T", "Lcom/android/tinderprofile/data/remote/ResultWrapper;", "response", "(Ljava/lang/Object;)V", "getResponse", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/android/tinderprofile/data/remote/ResultWrapper$GenericError;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class GenericError<T extends java.lang.Object> extends com.android.tinderprofile.data.remote.ResultWrapper<T> {
        @org.jetbrains.annotations.Nullable()
        private final T response = null;
        
        @org.jetbrains.annotations.Nullable()
        public final T getResponse() {
            return null;
        }
        
        public GenericError(@org.jetbrains.annotations.Nullable()
        T response) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.tinderprofile.data.remote.ResultWrapper.GenericError<T> copy(@org.jetbrains.annotations.Nullable()
        T response) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}
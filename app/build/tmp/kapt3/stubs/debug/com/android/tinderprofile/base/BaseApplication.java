package com.android.tinderprofile.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/android/tinderprofile/base/BaseApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class BaseApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static com.android.tinderprofile.base.BaseApplication instance;
    @org.jetbrains.annotations.NotNull()
    public static com.android.tinderprofile.data.local.room.UserRoomDatabase INSTANCE;
    public static final com.android.tinderprofile.base.BaseApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public BaseApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/android/tinderprofile/base/BaseApplication$Companion;", "", "()V", "INSTANCE", "Lcom/android/tinderprofile/data/local/room/UserRoomDatabase;", "getINSTANCE", "()Lcom/android/tinderprofile/data/local/room/UserRoomDatabase;", "setINSTANCE", "(Lcom/android/tinderprofile/data/local/room/UserRoomDatabase;)V", "instance", "Lcom/android/tinderprofile/base/BaseApplication;", "getInstance", "()Lcom/android/tinderprofile/base/BaseApplication;", "setInstance", "(Lcom/android/tinderprofile/base/BaseApplication;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.tinderprofile.base.BaseApplication getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        com.android.tinderprofile.base.BaseApplication p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.tinderprofile.data.local.room.UserRoomDatabase getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.NotNull()
        com.android.tinderprofile.data.local.room.UserRoomDatabase p0) {
        }
        
        private Companion() {
            super();
        }
    }
}
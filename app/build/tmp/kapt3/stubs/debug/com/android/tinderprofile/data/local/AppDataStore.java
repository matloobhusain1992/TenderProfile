package com.android.tinderprofile.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\'\u0010\u0012\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/android/tinderprofile/data/local/AppDataStore;", "", "()V", "IS_FIRST_TIME", "Landroidx/datastore/preferences/Preferences$Key;", "", "getIS_FIRST_TIME", "()Landroidx/datastore/preferences/Preferences$Key;", "dataStore", "Landroidx/datastore/DataStore;", "Landroidx/datastore/preferences/Preferences;", "getBooleanPref", "Lkotlinx/coroutines/flow/Flow;", "key", "initDataStore", "", "context", "Landroid/content/Context;", "saveBooleanPref", "value", "(Landroidx/datastore/preferences/Preferences$Key;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AppDataStore {
    private static androidx.datastore.DataStore<androidx.datastore.preferences.Preferences> dataStore;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> IS_FIRST_TIME = null;
    public static final com.android.tinderprofile.data.local.AppDataStore INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> getIS_FIRST_TIME() {
        return null;
    }
    
    public final void initDataStore(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getBooleanPref(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveBooleanPref(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> key, boolean value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    private AppDataStore() {
        super();
    }
}
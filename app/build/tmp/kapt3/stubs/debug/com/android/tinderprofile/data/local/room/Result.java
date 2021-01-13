package com.android.tinderprofile.data.local.room;

import java.lang.System;

@androidx.room.Entity(tableName = "user_table")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\fH\u00c6\u0003JO\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\u0003H\u00d6\u0001J\t\u0010G\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0010\"\u0004\b,\u0010-R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0010\"\u0004\b7\u0010-R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;\u00a8\u0006H"}, d2 = {"Lcom/android/tinderprofile/data/local/room/Result;", "", "userID", "", "phone", "", "status", "picture", "Lcom/android/tinderprofile/data/local/room/Picture;", "name", "Lcom/android/tinderprofile/data/local/room/Name;", "dob", "Lcom/android/tinderprofile/data/local/room/Dob;", "(ILjava/lang/String;Ljava/lang/String;Lcom/android/tinderprofile/data/local/room/Picture;Lcom/android/tinderprofile/data/local/room/Name;Lcom/android/tinderprofile/data/local/room/Dob;)V", "cell", "getCell", "()Ljava/lang/String;", "getDob", "()Lcom/android/tinderprofile/data/local/room/Dob;", "setDob", "(Lcom/android/tinderprofile/data/local/room/Dob;)V", "email", "getEmail", "gender", "getGender", "id", "Lcom/android/tinderprofile/data/local/room/Id;", "getId", "()Lcom/android/tinderprofile/data/local/room/Id;", "location", "Lcom/android/tinderprofile/data/local/room/Location;", "getLocation", "()Lcom/android/tinderprofile/data/local/room/Location;", "login", "Lcom/android/tinderprofile/data/local/room/Login;", "getLogin", "()Lcom/android/tinderprofile/data/local/room/Login;", "getName", "()Lcom/android/tinderprofile/data/local/room/Name;", "setName", "(Lcom/android/tinderprofile/data/local/room/Name;)V", "nat", "getNat", "getPhone", "setPhone", "(Ljava/lang/String;)V", "getPicture", "()Lcom/android/tinderprofile/data/local/room/Picture;", "setPicture", "(Lcom/android/tinderprofile/data/local/room/Picture;)V", "registered", "Lcom/android/tinderprofile/data/local/room/Registered;", "getRegistered", "()Lcom/android/tinderprofile/data/local/room/Registered;", "getStatus", "setStatus", "getUserID", "()I", "setUserID", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Result {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private final com.android.tinderprofile.data.local.room.Id id = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private final java.lang.String cell = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private final java.lang.String gender = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private final com.android.tinderprofile.data.local.room.Location location = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private final com.android.tinderprofile.data.local.room.Login login = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private final java.lang.String nat = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private final com.android.tinderprofile.data.local.room.Registered registered = null;
    @androidx.room.ColumnInfo(name = "user_id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int userID;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "phone_number")
    private java.lang.String phone;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "user_status")
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.android.tinderprofile.data.local.room.Picture picture;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.android.tinderprofile.data.local.room.Name name;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.android.tinderprofile.data.local.room.Dob dob;
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.tinderprofile.data.local.room.Id getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCell() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.tinderprofile.data.local.room.Location getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.tinderprofile.data.local.room.Login getLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.tinderprofile.data.local.room.Registered getRegistered() {
        return null;
    }
    
    public final int getUserID() {
        return 0;
    }
    
    public final void setUserID(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.tinderprofile.data.local.room.Picture getPicture() {
        return null;
    }
    
    public final void setPicture(@org.jetbrains.annotations.Nullable()
    com.android.tinderprofile.data.local.room.Picture p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.tinderprofile.data.local.room.Name getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    com.android.tinderprofile.data.local.room.Name p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.tinderprofile.data.local.room.Dob getDob() {
        return null;
    }
    
    public final void setDob(@org.jetbrains.annotations.Nullable()
    com.android.tinderprofile.data.local.room.Dob p0) {
    }
    
    public Result(int userID, @org.jetbrains.annotations.Nullable()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    com.android.tinderprofile.data.local.room.Picture picture, @org.jetbrains.annotations.Nullable()
    com.android.tinderprofile.data.local.room.Name name, @org.jetbrains.annotations.Nullable()
    com.android.tinderprofile.data.local.room.Dob dob) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.tinderprofile.data.local.room.Picture component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.tinderprofile.data.local.room.Name component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.tinderprofile.data.local.room.Dob component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.tinderprofile.data.local.room.Result copy(int userID, @org.jetbrains.annotations.Nullable()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    com.android.tinderprofile.data.local.room.Picture picture, @org.jetbrains.annotations.Nullable()
    com.android.tinderprofile.data.local.room.Name name, @org.jetbrains.annotations.Nullable()
    com.android.tinderprofile.data.local.room.Dob dob) {
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
package com.android.tinderprofile.data.local.room

import androidx.room.*
import com.google.gson.annotations.SerializedName
import com.android.tinderprofile.data.local.UserStatus

data class User(
    val info: Info,
    val results: List<Result>
)


data class Info(
    val page: Int,
    val results: Int,
    val seed: String,
    val version: String
)

@Entity(tableName = "user_table")
data class Result(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    var userID: Int,
    @ColumnInfo(name = "phone_number")
    var phone: String?,
    @ColumnInfo(name = "user_status")
    var status: String? = UserStatus.NONE.status,
    @Embedded
    var picture: Picture?,
    @Embedded
    var name: Name?,
    @Embedded
    var dob: Dob?
){
    @Ignore
    val id: Id? = null
    @Ignore
    val cell: String? = null
    @Ignore
    val email: String? = null
    @Ignore
    val gender: String? = null
    @Ignore
    val location: Location? = null
    @Ignore
    val login: Login? = null
    @Ignore
    val nat: String? = null
    @Ignore
    val registered: Registered? = null
}

data class Dob(
    @ColumnInfo(name = "age")
    var age: Int,
    var date: String
)

data class Id(
    val name: String,
    val value: Any
)

data class Location(
    val city: String,
    val coordinates: Coordinates,
    val country: String,
    val postcode: Any,
    val state: String,
    val street: Street,
    val timezone: Timezone
)

data class Login(
    val md5: String,
    val password: String,
    val salt: String,
    val sha1: String,
    val sha256: String,
    val username: String,
    val uuid: String
)

data class Name(
    @ColumnInfo(name = "first")
    var first: String,
    @ColumnInfo(name = "last")
    var last: String,
    @ColumnInfo(name = "title")
    var title: String
)

data class Picture(
    @ColumnInfo(name = "profile_image")
    var large: String,
    var medium: String,
    var thumbnail: String
)

data class Registered(
    val age: Int,
    val date: String
)

data class Coordinates(
    val latitude: String,
    val longitude: String
)

data class Street(
    val name: String,
    val number: Int
)

data class Timezone(
    val description: String,
    val offset: String
)
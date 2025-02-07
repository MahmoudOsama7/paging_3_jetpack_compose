package com.example.paging3jetpackcompose.model

import androidx.room.Embedded
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerializedName("links")
    @Embedded
    val userLinks:UserLinks?=null,
    @SerializedName("username")
    val userName:String?=null
)

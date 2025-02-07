package com.example.paging3jetpackcompose.model

import androidx.room.Entity
import com.example.paging3jetpackcompose.utils.Constants.UNSPLASH_IMAGE_TABLE
import kotlinx.serialization.SerialName

@Entity(tableName = UNSPLASH_IMAGE_TABLE)
data class UnsplashImage(
    @SerialName("id")
    val id:String?=null,
    @SerialName("urls")
    val urls:Urls?=null,
    @SerialName("likes")
    val likes:Int?=null,
    @SerialName("user")
    val user:User?=null
)

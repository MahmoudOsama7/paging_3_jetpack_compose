package com.example.paging3jetpackcompose.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.paging3jetpackcompose.utils.Constants.UNSPLASH_IMAGE_TABLE
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Entity(tableName = UNSPLASH_IMAGE_TABLE)
@Serializable
data class UnsplashImage(
    @SerializedName("id")
    @PrimaryKey(autoGenerate = false)
    val id:String?=null,
    @SerializedName("urls")
    @Embedded
    val urls:Urls?=null,
    @SerializedName("likes")
    val likes:Int?=null,
    @SerializedName("user")
    @Embedded
    val user:User?=null
)

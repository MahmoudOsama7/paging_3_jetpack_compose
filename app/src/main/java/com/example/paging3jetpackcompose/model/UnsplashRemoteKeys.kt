package com.example.paging3jetpackcompose.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.paging3jetpackcompose.utils.Constants.UNSPLASH_REMOTE_KEYS_TABLE
import com.google.gson.annotations.SerializedName

@Entity(tableName = UNSPLASH_REMOTE_KEYS_TABLE)
data class UnsplashRemoteKeys(
    @SerializedName("id")
    @PrimaryKey(autoGenerate = false)
    val id:String?=null,
    @SerializedName("prevPage")
    val prevPage:Int?=null,
    @SerializedName("nextPage")
    val nextPage:Int?=null
)

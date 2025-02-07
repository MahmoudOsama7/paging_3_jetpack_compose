package com.example.paging3jetpackcompose.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Urls(
    @SerializedName("regular")
    val regular:String?=null
)

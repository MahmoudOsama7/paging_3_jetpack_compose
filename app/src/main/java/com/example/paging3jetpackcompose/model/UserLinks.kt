package com.example.paging3jetpackcompose.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class UserLinks(
    @SerializedName("html")
    val html:String?=null
)

package com.example.paging3jetpackcompose.data.remote

import com.example.paging3jetpackcompose.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {
    @Headers("Authorization: Client-ID WLR0W3H9QlMjQh959njPwS7TkI1vD6M3WtXv-dHRzLQ")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page:Int,
        @Query("per_page")perPage:Int,
    ):List<UnsplashImage>

    @Headers("Authorization: Client-ID WLR0W3H9QlMjQh959njPwS7TkI1vD6M3WtXv-dHRzLQ")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("page") page:Int,
        @Query("per_page")perPage:Int,
    ):List<UnsplashImage>
}
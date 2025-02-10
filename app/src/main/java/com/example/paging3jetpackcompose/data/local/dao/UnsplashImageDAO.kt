package com.example.paging3jetpackcompose.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.paging3jetpackcompose.model.UnsplashImage

@Dao
interface UnsplashImageDAO {
    @Query("SELECT * FROM `unsplash-image-table`")
    fun getAllImages():PagingSource<Int,UnsplashImage>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addImages(images:List<UnsplashImage>)

    @Query("DELETE FROM `unsplash-image-table`")
    fun deleteAllImages():PagingSource<Int,UnsplashImage>
}
package com.example.paging3jetpackcompose.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.paging3jetpackcompose.data.local.dao.UnsplashImageDAO
import com.example.paging3jetpackcompose.data.local.dao.UnsplashRemoteKeysDAO
import com.example.paging3jetpackcompose.model.UnsplashImage
import com.example.paging3jetpackcompose.model.UnsplashRemoteKeys

@Database(
    entities = [
        UnsplashImage::class,
        UnsplashRemoteKeys::class
    ],
    version = 1
)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun getUnsplashImagesDao(): UnsplashImageDAO
    abstract fun getUnsplashRemoteKeysDAO(): UnsplashRemoteKeysDAO

}
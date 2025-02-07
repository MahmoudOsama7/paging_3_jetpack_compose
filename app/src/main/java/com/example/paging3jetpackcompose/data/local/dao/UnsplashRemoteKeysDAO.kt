package com.example.paging3jetpackcompose.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.paging3jetpackcompose.model.UnsplashRemoteKeys

@Dao
interface UnsplashRemoteKeysDAO {

    @Query("SELECT * FROM `unsplash-remote-keys-table` WHERE id =:id")
    suspend fun getRemoteKeys(id: String): UnsplashRemoteKeys

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(remoteKeys: List<UnsplashRemoteKeys>)

    @Query("DELETE FROM `unsplash-remote-keys-table`")
    suspend fun deleteAllRemoteKeys()

}
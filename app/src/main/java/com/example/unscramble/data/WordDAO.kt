package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(word: Word)
    @Query("SELECT * FROM Words ORDER BY timestamp DESC")
    fun getAllFlow(): Flow<List<Word>>
    @Query("DELETE FROM Words")
    suspend fun deleteAll()
}
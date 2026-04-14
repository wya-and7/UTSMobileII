package com.example.unscramble.data

import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity(tableName = "Words")
data class Word(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val word: String,
    val timestamp: Long = System.currentTimeMillis()
)

package com.example.mooddiary.data.local.entity

import androidx.room.*
import java.time.LocalDate

/**
 * Сущность БД, работающая с записями настроения
 */
@Entity(tableName = "mood_entries")
data class MoodEntry (
    @PrimaryKey(true)
    val id: Long = 0,

    val userId: String? = null,

    val date: LocalDate,
    val moodLevel: Int,
    val emoji: String? = null,
    val note: String? = null,
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis(),
    val isSynced: Boolean = false
)

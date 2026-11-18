package com.example.mooddiary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Сущность БД, работающая с тегами
 */
@Entity(tableName = "tags")
data class Tag(
    @PrimaryKey(true)
    val id : Long = 0,
    val name: String,
    val color: Int? = null //hexFormat: kotlin.text.HexFormat

)

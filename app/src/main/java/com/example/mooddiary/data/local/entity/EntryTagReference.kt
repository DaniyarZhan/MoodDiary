package com.example.mooddiary.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

/**
 * Сущность, позволяющее осуществить связь M:N между записями и тегами
 */
@Entity (
    tableName = "entry_tag_ref", //название таблицы
    primaryKeys = ["entryId", "tagId"], //первичные ключи (так как тут связь, поэтому их несколько)
    foreignKeys = [ //вторичные ключи, с другими таблицами
        ForeignKey(
            entity = MoodEntry::class,
            parentColumns = ["id"],
            childColumns = ["entryId"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Tag::class,
            parentColumns = ["id"],
            childColumns = ["tagId"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        )
    ],
    indices = [Index("entryId"), Index("tagId")] //индексы для поиска
)
data class EntryTagReference (
    val entryId : Long,
    val tagId : Long,
)
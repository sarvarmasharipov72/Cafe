package com.sarvarmasharipov72.cafe.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "menu_entity")
data class MenuEntity(
    @PrimaryKey val id: String,
    val img: String,
    val name: String,
    val dsc: String,
    val price: Int,
    val rate: Int
    )
package com.sarvarmasharipov72.cafe.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sarvarmasharipov72.cafe.model.entity.MenuEntity

@Database(entities = [MenuEntity::class], exportSchema = false, version = 1)
abstract class MenuDatabase : RoomDatabase() {
    abstract val menuDao: MenuDao

    companion object {
        private const val DATABASE_NAME = "Menu.db"

        private var instance: MenuDatabase? = null
        fun getInstance(context: Context): MenuDatabase {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = Room.databaseBuilder(
                            context.applicationContext,
                            MenuDatabase::class.java,
                            DATABASE_NAME
                        ).build()
                    }
                }
            }
            return instance!!
        }
    }
}
package com.sarvarmasharipov72.cafe.data.db

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sarvarmasharipov72.cafe.model.entity.MenuEntity

@Dao
interface MenuDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(menuList: List<MenuEntity>)

    @Query("SELECT * FROM menu_entity m order by m.id ASC")
    fun getAllMenu(): PagingSource<Int, MenuEntity>

    @Query("DELETE FROM menu_entity")
    suspend fun clearAll()
}
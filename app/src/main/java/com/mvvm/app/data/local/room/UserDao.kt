package com.mvvm.app.data.local.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user:User)
    @Query("SELECT * FROM user_table")
    fun getUserList():LiveData<MutableList<User>>
    @Query("DELETE FROM user_table")
    fun deleteAll()
}
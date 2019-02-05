package com.example.admin.mvvmposts.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.admin.mvvmposts.model.Post
import com.example.admin.mvvmposts.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
 abstract fun postDao():PostDao
}
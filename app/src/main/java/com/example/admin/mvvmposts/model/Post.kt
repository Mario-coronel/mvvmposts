package com.example.admin.mvvmposts.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Post(@PrimaryKey val userId: Int, val id: Int, val title: String, val body: String)

package com.example.admin.mvvmposts.network

import com.example.admin.mvvmposts.model.Post
import io.reactivex.Observable
import retrofit2.http.GET


interface PostApi {
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>

}
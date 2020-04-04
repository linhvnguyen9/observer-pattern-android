package com.linh.observerpattern.data

import com.linh.observerpattern.domain.entity.Post
import retrofit2.http.GET

interface PostService {
    @GET("/posts")
    suspend fun getPosts(): List<Post>
}
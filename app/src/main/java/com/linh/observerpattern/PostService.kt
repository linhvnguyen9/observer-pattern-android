package com.linh.observerpattern

import retrofit2.http.GET

interface PostService {
    @GET("/posts")
    suspend fun getPosts(): List<Post>
}
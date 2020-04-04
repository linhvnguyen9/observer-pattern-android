package com.linh.observerpattern.data

class PostDatasource(private val postService: PostService) {
    suspend fun getPosts() = postService.getPosts()
}
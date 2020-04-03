package com.linh.observerpattern

class PostDatasource(private val postService: PostService) {
    suspend fun getPosts() = postService.getPosts()
}
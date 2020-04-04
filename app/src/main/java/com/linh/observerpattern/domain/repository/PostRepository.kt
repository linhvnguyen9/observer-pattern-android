package com.linh.observerpattern.domain.repository

import com.linh.observerpattern.domain.entity.Post

interface PostRepository {
    suspend fun getPosts() : List<Post>
}
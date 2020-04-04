package com.linh.observerpattern.repository

import com.linh.observerpattern.data.PostDatasource
import com.linh.observerpattern.domain.entity.Post
import com.linh.observerpattern.domain.repository.PostRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PostRepositoryImpl(private val datasource: PostDatasource) : PostRepository {

    override suspend fun getPosts() : List<Post> =
        withContext(Dispatchers.IO) {
            datasource.getPosts()
        }

}
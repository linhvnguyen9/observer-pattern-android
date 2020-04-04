package com.linh.observerpattern.domain.usecase

import com.linh.observerpattern.domain.entity.Post
import com.linh.observerpattern.domain.repository.PostRepository

interface GetPostsUseCase {
    suspend operator fun invoke(): List<Post>
}

class GetPostsUseCaseImpl(private val repository: PostRepository) : GetPostsUseCase {
    override suspend operator fun invoke(): List<Post> = repository.getPosts()
}
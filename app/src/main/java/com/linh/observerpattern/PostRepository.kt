package com.linh.observerpattern

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.coroutines.coroutineContext

class PostRepository() {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    private val postService = retrofit.create(PostService::class.java)
    private val postDatasource = PostDatasource(postService)

    suspend fun getPosts() : List<Post> =
        GlobalScope.async(Dispatchers.IO) {
            postDatasource.getPosts()
        }.await()

}
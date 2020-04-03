package com.linh.observerpattern

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class MainViewModel() : Subject() {
    private val scope = CoroutineScope(Dispatchers.Main)
    private val postRepository = PostRepository()

    fun getPosts() {
        scope.launch {
            val posts = postRepository.getPosts()
            Timber.d(posts.toString())
            notifyObservers(posts)
        }
    }
}
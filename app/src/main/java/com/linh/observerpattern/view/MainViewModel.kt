package com.linh.observerpattern.view

import com.linh.observerpattern.data.PostRepository
import com.linh.observerpattern.common.observer.Subject
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class MainViewModel (private val postRepository: PostRepository) : Subject() {
    private val scope = CoroutineScope(Dispatchers.Main)

    fun getPosts() {
        scope.launch {
            val posts = postRepository.getPosts()
            Timber.d(posts.toString())
            notifyObservers(posts)
        }
    }
}
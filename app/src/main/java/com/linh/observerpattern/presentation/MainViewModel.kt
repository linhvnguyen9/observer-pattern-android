package com.linh.observerpattern.presentation

import com.linh.observerpattern.common.utils.observer.Subject
import com.linh.observerpattern.domain.usecase.GetPostsUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class MainViewModel (private val getPostsUseCase: GetPostsUseCase) : Subject() {
    private val scope = CoroutineScope(Dispatchers.Main)

    fun getPosts() {
        scope.launch {
            val posts = getPostsUseCase()
            Timber.d(posts.toString())
            notifyObservers(posts)
        }
    }
}
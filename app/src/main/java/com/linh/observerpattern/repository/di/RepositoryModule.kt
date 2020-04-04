package com.linh.observerpattern.repository.di

import com.linh.observerpattern.domain.repository.PostRepository
import com.linh.observerpattern.repository.PostRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    factory { PostRepositoryImpl(get()) as PostRepository }
}
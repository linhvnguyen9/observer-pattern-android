package com.linh.observerpattern.view.di

import com.linh.observerpattern.domain.usecase.GetPostsUseCase
import com.linh.observerpattern.domain.usecase.GetPostsUseCaseImpl
import com.linh.observerpattern.presentation.MainViewModel
import org.koin.dsl.module

val viewModule = module {
    factory { GetPostsUseCaseImpl(get()) as GetPostsUseCase }
    factory { MainViewModel(get()) }
}
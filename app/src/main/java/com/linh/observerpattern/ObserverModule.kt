package com.linh.observerpattern

import com.linh.observerpattern.presentation.MainViewModel
import com.linh.observerpattern.data.PostDatasource
import com.linh.observerpattern.repository.PostRepositoryImpl
import com.linh.observerpattern.data.PostService
import com.linh.observerpattern.data.di.dataModule
import com.linh.observerpattern.domain.repository.PostRepository
import com.linh.observerpattern.domain.usecase.GetPostsUseCase
import com.linh.observerpattern.domain.usecase.GetPostsUseCaseImpl
import com.linh.observerpattern.repository.di.repositoryModule
import com.linh.observerpattern.view.di.viewModule
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val observerModule = listOf(viewModule, repositoryModule, dataModule)
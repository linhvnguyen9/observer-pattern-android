package com.linh.observerpattern.di

import com.linh.observerpattern.presentation.MainViewModel
import com.linh.observerpattern.data.PostDatasource
import com.linh.observerpattern.repository.PostRepositoryImpl
import com.linh.observerpattern.data.PostService
import com.linh.observerpattern.domain.repository.PostRepository
import com.linh.observerpattern.domain.usecase.GetPostsUseCase
import com.linh.observerpattern.domain.usecase.GetPostsUseCaseImpl
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val observerModule = module {

    single {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory { get<Retrofit>().create(PostService::class.java) }

    factory { PostRepositoryImpl(get()) as PostRepository }

    factory { PostDatasource(get()) }

    factory { MainViewModel(get()) }

    factory { GetPostsUseCaseImpl(get()) as GetPostsUseCase }
}
package com.linh.observerpattern.data.di

import com.linh.observerpattern.data.PostDatasource
import com.linh.observerpattern.data.PostService
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory { get<Retrofit>().create(PostService::class.java) }

    factory { PostDatasource(get()) }
}
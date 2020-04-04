package com.linh.observerpattern

import android.app.Application
import com.linh.observerpattern.di.observerModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class ObserverApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@ObserverApplication)
            val modules = modules(
                observerModule
            )
        }

        Timber.plant(Timber.DebugTree())
    }
}
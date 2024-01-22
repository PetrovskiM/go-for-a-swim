package com.gfas

import android.app.Application
import com.gfas.core.network.di.networkModule
import com.gfas.di.sharedModule
import org.koin.core.context.startKoin

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(sharedModule, networkModule))
        }
    }
}
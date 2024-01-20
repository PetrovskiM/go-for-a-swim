package com.gfas

import android.app.Application
import di.sharedModule
import org.koin.core.context.startKoin

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(sharedModule)
        }
    }
}
package com.gfas

import androidx.compose.ui.window.ComposeUIViewController
import com.gfas.App
import com.gfas.core.network.di.networkModule
import com.gfas.di.sharedModule
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController { App() }

fun initKoin() {
    startKoin { modules(sharedModule, networkModule) }
}
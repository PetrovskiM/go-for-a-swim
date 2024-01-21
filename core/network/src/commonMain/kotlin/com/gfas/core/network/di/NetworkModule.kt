package com.gfas.core.network.di

import com.gfas.core.network.NetworkClient
import org.koin.dsl.module

val networkModule = module {
    single { NetworkClient() }
}
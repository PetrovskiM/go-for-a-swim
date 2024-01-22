package com.gfas.di

import com.gfas.data.SwimApi
import com.gfas.domain.SwimRepository
import org.koin.dsl.module
import com.gfas.presentation.HomeViewModel

val sharedModule = module {
    factory { SwimApi(networkClient = get()) }
    factory { SwimRepository(swimApi = get()) }
    single { HomeViewModel(swimRepository = get()) }
}
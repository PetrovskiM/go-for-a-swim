package di

import data.SwimApi
import domain.SwimRepository
import org.koin.dsl.module
import presentation.HomeViewModel

val sharedModule = module {
    factory { SwimApi(networkClient = get()) }
    factory { SwimRepository(swimApi = get()) }
    single { HomeViewModel(swimRepository = get()) }
}
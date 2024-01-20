package presentation

import domain.SwimRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import presentation.contract.HomeState

internal class HomeViewModel(private val swimRepository: SwimRepository) {

    private val mutableState = MutableStateFlow(HomeState.InitialState(isLoading = false))
    val state = mutableState.asStateFlow()

}
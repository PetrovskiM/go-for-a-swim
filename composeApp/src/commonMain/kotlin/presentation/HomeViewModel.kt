package presentation

import domain.SwimRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import presentation.contract.HomeState

internal class HomeViewModel(private val swimRepository: SwimRepository) {

    private val mutableState =
        MutableStateFlow<HomeState>(HomeState.InitialState(isLoading = false))
    val state = mutableState.asStateFlow()

    init {
        CoroutineScope(Dispatchers.Default).launch {
            delay(3000)
            mutableState.emit(
                HomeState.MappedState(
                    temperature = "22.3",
                    canSwim = "Go for it",
                    swimableOn = "Now"
                )
            )
        }
    }
}
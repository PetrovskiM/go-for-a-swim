package presentation.contract

internal sealed class HomeState(open val isLoading: Boolean = false) {

    data class InitialState(override val isLoading: Boolean) : HomeState(isLoading)

    data class MappedState(
        override val isLoading: Boolean = false,
        val error: String? = null,
        val mapUrl: String = "",
        val temperature: String = "",
        val canSwim: String = "",
        val swimable: String = "",
    ) : HomeState(isLoading)
}
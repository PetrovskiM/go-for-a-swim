package presentation

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.gfas.core.ui.components.GText
import com.gfas.core.ui.components.Spacer
import org.koin.compose.koinInject
import presentation.components.MapComponent
import presentation.components.WaterInformation
import presentation.contract.HomeState
import presentation.contract.HomeState.InitialState
import presentation.contract.HomeState.MappedState
import com.gfas.core.ui.theme.Dimens

@Composable
internal fun HomeScreen(viewModel: HomeViewModel = koinInject()) {
    val state by viewModel.state.collectAsState()
    HomeContent(state = state)
}

@Composable
private fun HomeContent(state: HomeState) {
    AnimatedContent(
        modifier = Modifier.fillMaxWidth(),
        targetState = state,
        contentKey = { it is MappedState }
    ) {
        Column {
            when (state) {
                is InitialState -> InitialComponent(state = state)
                is MappedState -> MappedComponent(state = state)
            }
        }
    }
}

@Composable
private fun InitialComponent(state: InitialState) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        if (state.isLoading) {
            CircularProgressIndicator()
        } else {
            GoForASwimButton(onClick = {})
        }
    }
}

@Composable
private fun MappedComponent(state: MappedState) {
    MapComponent()
    Spacer(height = Dimens.Space)
    GoForASwimButton(onClick = {})
    WaterInformation(
        temperature = state.temperature,
        canSwim = state.canSwim,
        swimableOn = state.swimableOn
    )
}

@Composable
private fun GoForASwimButton(onClick: () -> Unit) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = Dimens.Space),
        onClick = onClick,
    ) {
        GText.BodyMedium("Can I go for a swim?")
    }
}
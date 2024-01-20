package presentation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import components.GText
import components.Spacer
import org.koin.compose.koinInject
import presentation.components.MapComponent
import presentation.components.WaterInformation
import presentation.contract.HomeState
import theme.Dimens

@Composable
internal fun HomeScreen(viewModel: HomeViewModel = koinInject()) {
    val state by viewModel.state.collectAsState()
    HomeContent(state = state)
}

@Composable
private fun HomeContent(state: HomeState) {
    MapComponent()
    Spacer(height = Dimens.Space)
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = Dimens.Space),
        onClick = {},
    ) {
        GText.BodyMedium("Can I go for a swim?")
    }
    WaterInformation(
        temperature = "22.4",
        shouldSwim = "No! It's way too cold for swimming!",
        whenCanSwim = "June till September!"
    )

}
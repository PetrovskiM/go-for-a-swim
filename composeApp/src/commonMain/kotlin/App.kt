import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import components.Spacer
import presentation.components.MapComponent
import presentation.components.WaterInformation
import theme.AppTheme
import theme.Dimens.Space
import theme.Dimens.SpaceXLarge

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun App() {
    AppTheme {
        Scaffold {
            val insets = PaddingValues(top = SpaceXLarge)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .consumeWindowInsets(insets),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MapComponent()
                Spacer(height = Space)
                WaterInformation("22.4")
            }
        }
    }
}
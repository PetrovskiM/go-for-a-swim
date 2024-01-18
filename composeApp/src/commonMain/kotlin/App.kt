import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import presentation.components.MapComponent

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun App() {
    MaterialTheme {
        Scaffold {
            val insets = PaddingValues(top = 32.dp)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .consumeWindowInsets(insets),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MapComponent()
            }
        }
    }
}
package presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import coil3.compose.AsyncImage
import coil3.compose.LocalPlatformContext
import coil3.request.ImageRequest
import com.gfas.core.ui.theme.Dimens.SpaceXLarge

@Composable
internal fun MapComponent() {
    Card(
        shape = RoundedCornerShape(
            bottomStart = SpaceXLarge,
            bottomEnd = SpaceXLarge,
        ),
        colors = CardDefaults.cardColors(containerColor = Color.Green),
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalPlatformContext.current)
                .data("https://images.unsplash.com/photo-1621155346337-1d19476ba7d6?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGltYWdlfGVufDB8fDB8fHww")
                .build(),
            contentDescription = null,
        )
        Box(
            modifier = Modifier
                .fillMaxHeight(MAP_HEIGHT_FACTOR)
                .fillMaxWidth()
        )
    }
}

private const val MAP_HEIGHT_FACTOR = 0.4f
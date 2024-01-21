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
        Box(
            modifier = Modifier
                .fillMaxHeight(MAP_HEIGHT_FACTOR)
                .fillMaxWidth()
        )
    }
}

private const val MAP_HEIGHT_FACTOR = 0.4f
package com.gfas.presentation.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.IntSize
import coil3.annotation.ExperimentalCoilApi
import coil3.compose.AsyncImagePainter
import coil3.compose.LocalPlatformContext
import coil3.compose.rememberAsyncImagePainter
import coil3.request.ImageRequest
import coil3.size.Size
import com.gfas.core.ui.theme.Dimens.SpaceXLarge
import com.gfas.util.toImageBitmap

@OptIn(ExperimentalCoilApi::class)
@Composable
internal fun MapComponent(mapUrl: String) {
    val basePainter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(LocalPlatformContext.current)
            .data(mapUrl)
            .size(Size.ORIGINAL)
            .build()
    )
    val baseImageLoadedState = basePainter.state
    Card(
        shape = RoundedCornerShape(
            bottomStart = SpaceXLarge,
            bottomEnd = SpaceXLarge,
        ),
        colors = CardDefaults.cardColors(containerColor = Color.Green),
    ) {

        if (baseImageLoadedState is AsyncImagePainter.State.Success) {
            val baseImageBitmap = baseImageLoadedState.result.image
            val imageBitmap = toImageBitmap(baseImageBitmap)
            Canvas(
                Modifier
                    .fillMaxHeight(MAP_HEIGHT_FACTOR)
                    .fillMaxWidth()
            ) {
                val canvasWidth = size.width.toInt()
                val canvasHeight = size.height.toInt()
                this.drawImage(imageBitmap, dstSize = IntSize(canvasWidth, canvasHeight))
                val pixelData = IntArray(canvasWidth * canvasHeight)
                imageBitmap.readPixels(pixelData)
            }
        }
    }
}

private const val MAP_HEIGHT_FACTOR = 0.4f
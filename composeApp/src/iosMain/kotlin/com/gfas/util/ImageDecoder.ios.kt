package com.gfas.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asComposeImageBitmap
import coil3.Image
import coil3.annotation.ExperimentalCoilApi

@Composable
@OptIn(ExperimentalCoilApi::class)
internal actual fun toImageBitmap(image: Image): ImageBitmap =
    image.asBitmap().asComposeImageBitmap()
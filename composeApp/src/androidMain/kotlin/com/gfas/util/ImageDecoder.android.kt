package com.gfas.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.core.graphics.drawable.toBitmap
import coil3.Image
import coil3.annotation.ExperimentalCoilApi

@Composable
@OptIn(ExperimentalCoilApi::class)
internal actual fun toImageBitmap(image: Image): ImageBitmap =
    image.asDrawable(LocalContext.current.resources).toBitmap().asImageBitmap()
package com.gfas.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import coil3.Image
import coil3.annotation.ExperimentalCoilApi

@Composable
@OptIn(ExperimentalCoilApi::class)
internal expect fun toImageBitmap(image: Image): ImageBitmap
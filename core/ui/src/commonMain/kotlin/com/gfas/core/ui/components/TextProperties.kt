package com.gfas.core.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

data class TextProperties(
    val fontSize: TextUnit,
    val fontWeight: FontWeight,
    val lineHeight: TextUnit,
)

@Composable
fun getTextProperties(rText: GText): TextProperties {
    return when (rText) {
        GText.HeadlineLarge -> TextProperties(
            fontSize = 32.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 40.sp,
        )

        GText.HeadlineMedium -> TextProperties(
            fontSize = 28.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 36.sp,
        )

        GText.HeadlineSmall -> TextProperties(
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 32.sp,
        )

        GText.BodyLarge -> TextProperties(
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 24.sp,
        )

        GText.BodyMedium -> TextProperties(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 20.sp,
        )

        GText.BodySmall -> TextProperties(
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 16.sp,
        )

        GText.LabelLarge -> TextProperties(
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            lineHeight = 20.sp,
        )

        GText.LabelMedium -> TextProperties(
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            lineHeight = 0.sp,
        )
    }
}
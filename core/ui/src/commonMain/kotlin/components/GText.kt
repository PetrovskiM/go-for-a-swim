package components

import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit

enum class GText {
    HeadlineLarge,
    HeadlineMedium,
    HeadlineSmall,
    BodyLarge,
    BodyMedium,
    BodySmall,
    LabelLarge,
    LabelMedium;

    @Composable
    operator fun invoke(
        text: String,
        modifier: Modifier = Modifier,
        textColor: Color? = null,
        fontSize: TextUnit? = null,
        fontWeight: FontWeight? = null,
        textAlign: TextAlign? = null,
        overflow: TextOverflow? = null,
        lineHeight: TextUnit? = null,
        maxLines: Int? = null,
    ) {
        val properties = getTextProperties(rText = this)
        RText(
            modifier = modifier,
            text = text,
            textColor = textColor ?: LocalTextStyle.current.color,
            fontSize = fontSize ?: properties.fontSize,
            fontWeight = fontWeight ?: properties.fontWeight,
            textAlign = textAlign ?: TextAlign.Start,
            overflow = overflow ?: TextOverflow.Clip,
            lineHeight = lineHeight ?: properties.lineHeight,
            maxLines = maxLines,
        )
    }
}

@Composable
private fun RText(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color,
    fontSize: TextUnit,
    fontWeight: FontWeight,
    textAlign: TextAlign,
    overflow: TextOverflow,
    lineHeight: TextUnit,
    maxLines: Int? = null,
) {
    Text(
        modifier = modifier,
        text = text,
        color = textColor,
        fontSize = fontSize,
        fontWeight = fontWeight,
        textAlign = textAlign,
        overflow = overflow,
        lineHeight = lineHeight,
        maxLines = maxLines ?: Int.MAX_VALUE,
    )
}

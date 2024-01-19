package presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import components.GText.BodyLarge
import components.GText.BodyMedium
import components.Spacer
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import theme.Dimens.Space
import theme.Dimens.SpaceMedium
import theme.Dimens.SpaceSmall

@Composable
internal fun WaterInformation(temperature: String) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(Space)
    ) {
        item {
            InfoComponent(
                title = "Temperature",
                value = temperature,
                icon = "ic_swim.xml"
            )
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
private fun InfoComponent(
    title: String,
    value: String,
    icon: String,
) {
    Column(
        modifier = Modifier
            .height(INFO_HEIGHT)
            .width(INFO_WIDTH)
            .clip(RoundedCornerShape(Space))
            .background(MaterialTheme.colorScheme.tertiary)
            .padding(Space)
    ) {
        Image(
            painter = painterResource(icon),
            contentDescription = null,
        )
        Spacer(height = SpaceMedium)
        BodyLarge(
            text = title,
            textColor = MaterialTheme.colorScheme.onTertiary,
        )
        Spacer(height = SpaceSmall)
        BodyMedium(
            text = value,
            textColor = MaterialTheme.colorScheme.onTertiary,
        )
    }
}

private val INFO_HEIGHT = 150.dp
private val INFO_WIDTH = 130.dp
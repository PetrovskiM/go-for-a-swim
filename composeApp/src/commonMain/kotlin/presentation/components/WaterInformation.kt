package presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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
import res.Drawables
import theme.Dimens.Space
import theme.Dimens.SpaceMedium
import theme.Dimens.SpaceSmall

@Composable
internal fun WaterInformation(
    temperature: String,
    shouldSwim: String,
    whenCanSwim: String,
) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(Space)
    ) {
        item {
            InfoComponent(
                title = "Temperature",
                value = temperature,
                icon = Drawables.IC_TEMPERATURE
            )
        }
        item {
            InfoComponent(
                title = "Swim?",
                value = shouldSwim,
                icon = Drawables.IC_SWIM
            )
        }
        item {
            InfoComponent(
                title = "Swimable on?",
                value = whenCanSwim,
                icon = Drawables.IC_CALENDAR
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
    Row {
        Column(
            modifier = Modifier
                .height(INFO_HEIGHT)
                .width(INFO_WIDTH)
                .clip(RoundedCornerShape(Space))
                .background(MaterialTheme.colorScheme.tertiary)
                .padding(Space)
        ) {
            Icon(
                painter = painterResource(icon),
                tint = MaterialTheme.colorScheme.onTertiary,
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
        Spacer(width = Space)
    }
}

private val INFO_HEIGHT = 150.dp
private val INFO_WIDTH = 130.dp
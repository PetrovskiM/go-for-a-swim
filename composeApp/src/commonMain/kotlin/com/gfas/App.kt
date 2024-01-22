package com.gfas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.koin.compose.KoinContext
import com.gfas.presentation.HomeScreen
import com.gfas.core.ui.theme.AppTheme
import com.gfas.core.ui.theme.Dimens.SpaceXLarge

@OptIn(ExperimentalLayoutApi::class)
@Composable
internal fun App() {
    KoinContext {
        AppTheme {
            Scaffold {
                val insets = PaddingValues(top = SpaceXLarge)
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .consumeWindowInsets(insets),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    HomeScreen()
                }
            }
        }
    }
}
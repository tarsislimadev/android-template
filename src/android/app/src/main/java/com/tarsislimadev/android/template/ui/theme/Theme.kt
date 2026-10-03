package com.tarsislimadev.android.template.ui.theme

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val PurpleForeground80 = Color(0xFFD0BCFF)

private val LightColorScheme = lightColorScheme(
    primary = PurpleForeground80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

@Composable
fun WomenTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        content = content
    )
}
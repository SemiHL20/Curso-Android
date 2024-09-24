package com.example.yoga30days.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.ViewCompat

private val DarkColorScheme = darkColorScheme(
    primary = dark_primary,
    secondary = dark_secondary,
    surface = dark_surface,
    background = dark_background,
    onSurface = dark_onSurface,
    onPrimary = dark_onPrimary
)

private val LightColorScheme = lightColorScheme(
    primary = light_primary,
    secondary = light_secondary,
    surface = light_surface,
    background = light_background,
    onSurface = light_onSurface,
    onPrimary = light_onPrimary
)

@Composable
fun Yoga30DaysTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
package com.example.heroes.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = md_theme_dark_primary,
    secondary = md_theme_dark_secondary,
    onPrimary = md_theme_dark_onPrimary,
    background = md_theme_dark_background,
    onSurface = md_theme_dark_onSurface,
    surface = md_theme_dark_surface
)

private val LightColorScheme = lightColorScheme(
    primary = md_theme_light_primary,
    secondary = md_theme_light_secondary,
    onPrimary = md_theme_light_onPrimary,
    background = md_theme_light_background,
    onSurface = md_theme_light_onSurface,
    surface = md_theme_light_surface
)

@Composable
fun HeroesTheme(
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
package com.example.myapplication.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = getColorSchemeDark()

private val LightColorScheme = getColorSchemeLight()


object DBTheme {
    val colors: DBThemeColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val dimensions: DBThemeDimensions
        @Composable
        @ReadOnlyComposable
        get() = LocalDimensions.current

    val typography: DBThemeTextStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}

@Composable
fun DBTheme(
    density: Density = Density.REGULAR,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val configuration = LocalConfiguration.current
    // typography
    val typography: DBThemeTextStyles = when {
        configuration.screenWidthDp > 768 ->
            when (density) {
                Density.FUNCTIONAL -> getTextStyles(getTypographyFunctionalTablet())
                Density.EXPRESSIVE -> getTextStyles(getTypographyExpressiveTablet())
                else -> getTextStyles(getTypographyRegularTablet())
            }

        else -> when (density) {
            Density.FUNCTIONAL -> getTextStyles(getTypographyFunctionalMobile())
            Density.EXPRESSIVE -> getTextStyles(getTypographyExpressiveMobile())
            else -> getTextStyles(getTypographyRegularMobile())
        }
    }

    // screen
    val dimensions: DBThemeDimensions = when {
        configuration.screenWidthDp > 768 ->
            when (density) {
                Density.FUNCTIONAL -> getDimensionsFunctionalTablet()
                Density.EXPRESSIVE -> getDimensionsExpressiveTablet()
                else -> getDimensionsRegularTablet()
            }

        else -> when (density) {
            Density.FUNCTIONAL -> getDimensionsFunctionalMobile()
            Density.EXPRESSIVE -> getDimensionsExpressiveMobile()
            else -> getDimensionsRegularMobile()
        }
    }

    // colors
    val colorScheme: DBThemeColorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.neutral.bgBasicLevel1Default.toArgb()
            window.navigationBarColor = colorScheme.neutral.bgBasicLevel1Default.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    CompositionLocalProvider(
        LocalColors provides colorScheme,
        LocalDimensions provides dimensions,
        LocalTypography provides typography
    ) {
        content()
    }
}

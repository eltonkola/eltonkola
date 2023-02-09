package com.eltonkola.components.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.eltonkola.model.ColorScheme
import com.eltonkola.model.UiState


@Composable
fun EKTheme(
    uiState: UiState,
    content: @Composable () -> Unit
) {

    val colors = when(uiState.color){
        ColorScheme.Default -> if (uiState.darkMode) darkPurpleColorTheme  else lightPurpleColorTheme
        ColorScheme.Blue -> if (uiState.darkMode) darkBlueColorTheme  else lightBlueColorTheme
        ColorScheme.Green -> if (uiState.darkMode) darkGreenColorTheme  else lightGreenColorTheme
        ColorScheme.Red -> if (uiState.darkMode) darkRedColorTheme  else lightRedColorTheme
        ColorScheme.Yellow -> if (uiState.darkMode) darkYellowColorTheme  else lightYellowColorTheme
    }

    ProvideEKColorsTypography(colors) {
        MaterialTheme(
            content = content
        )
    }
}


object EKTheme {

    @Composable
    @ReadOnlyComposable
    fun colors(): EKColors = LocalEKColors.current

//ios wont support this
//    val colors: EKColors
//        @Composable
//        @ReadOnlyComposable
//        get() = LocalEKColors.current

    @Composable
    @ReadOnlyComposable
    fun typography(): EKTypography = LocalTypography.current

//    val typography: EKTypography
//        @Composable
//        @ReadOnlyComposable
//        get() = LocalTypography.current

    //not used
//    val shapes: EKShape
//        @Composable
//        @ReadOnlyComposable
//        get() = LocalEKShapes.current
}

@Composable
fun ProvideEKColorsTypography(
    colors: EKColors,
    content: @Composable () -> Unit
) {
    val colorPalette = remember {
        // Explicitly creating a new object here so we don't mutate the initial [colors]
        // provided, and overwrite the values set in it.
        colors.copy()
    }
    colorPalette.update(colors)
    CompositionLocalProvider(
        LocalEKColors provides colorPalette,
        LocalTypography provides typography,
        LocalEKShapes provides EKShapes,
        content = content
    )
}

private val LocalEKColors = staticCompositionLocalOf<EKColors> {
    error("No OKColorPalette provided")
}
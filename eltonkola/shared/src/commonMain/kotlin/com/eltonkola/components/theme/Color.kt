package com.eltonkola.components.theme

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

/**
 * This file hold all the colors used in the app
 */


internal val PRIMARY1 = Color(0xff301453)
internal val SECONDARY1 = Color(0xffBC64A1)
internal val ON_PRIMARY1 = Color(0xffBEB5CA)
internal val ON_SECONDARY1 = Color(0xff15090D)


internal val PRIMARY2 = Color(0xffB00909)
internal val SECONDARY2 = Color(0xff81061C)
internal val ON_PRIMARY2 = Color(0xffBEB5CA)
internal val ON_SECONDARY2 = Color(0xff15090D)


internal val PRIMARY3 = Color(0xffFFE600)
internal val SECONDARY3 = Color(0xffC5B105)
internal val ON_PRIMARY3 = Color(0xffBEB5CA)
internal val ON_SECONDARY3 = Color(0xff15090D)

internal val PRIMARY4 = Color(0xff24FF00)
internal val SECONDARY4 = Color(0xff046714)
internal val ON_PRIMARY4 = Color(0xffBEB5CA)
internal val ON_SECONDARY4 = Color(0xff15090D)

internal val PRIMARY5 = Color(0xff041DFC)
internal val SECONDARY5 = Color(0xff060377)
internal val ON_PRIMARY5 = Color(0xffBEB5CA)
internal val ON_SECONDARY5 = Color(0xff15090D)

/**
 * Class the describes apps color pallet
 */

val lightPurpleColorTheme = EKColors(
    primary = PRIMARY1,
    secondary = SECONDARY1,
    onPrimary = ON_PRIMARY1,
    onSecondary = ON_SECONDARY1,
)

val darkPurpleColorTheme = EKColors(
    primary = SECONDARY1,
    secondary = PRIMARY1,
    onPrimary = ON_SECONDARY1,
    onSecondary = ON_PRIMARY1,
)


val lightRedColorTheme = EKColors(
    primary = PRIMARY2,
    secondary = SECONDARY2,
    onPrimary = ON_PRIMARY2,
    onSecondary = ON_SECONDARY2,
)

val darkRedColorTheme = EKColors(
    primary = SECONDARY2,
    secondary = PRIMARY2,
    onPrimary = ON_SECONDARY2,
    onSecondary = ON_PRIMARY2,
)

val lightYellowColorTheme = EKColors(
    primary = PRIMARY3,
    secondary = SECONDARY3,
    onPrimary = ON_PRIMARY3,
    onSecondary = ON_SECONDARY3,
)

val darkYellowColorTheme = EKColors(
    primary = SECONDARY3,
    secondary = PRIMARY3,
    onPrimary = ON_SECONDARY3,
    onSecondary = ON_PRIMARY3,
)

val lightGreenColorTheme = EKColors(
    primary = PRIMARY4,
    secondary = SECONDARY4,
    onPrimary = ON_PRIMARY4,
    onSecondary = ON_SECONDARY4,
)

val darkGreenColorTheme = EKColors(
    primary = SECONDARY4,
    secondary = PRIMARY4,
    onPrimary = ON_SECONDARY4,
    onSecondary = ON_PRIMARY4,
)

val lightBlueColorTheme = EKColors(
    primary = PRIMARY5,
    secondary = SECONDARY5,
    onPrimary = ON_PRIMARY5,
    onSecondary = ON_SECONDARY5,
)

val darkBlueColorTheme = EKColors(
    primary = SECONDARY5,
    secondary = PRIMARY5,
    onPrimary = ON_SECONDARY5,
    onSecondary = ON_PRIMARY5,
)

@Stable
class EKColors(
    primary: Color,
    secondary: Color,
    onPrimary: Color,
    onSecondary: Color,
) {
    var primary by mutableStateOf(primary)
        private set
    var secondary by mutableStateOf(secondary)
        private set
    var onPrimary by mutableStateOf(onPrimary)
        private set
    var onSecondary by mutableStateOf(onSecondary)
        private set


    fun update(other: EKColors) {
        primary = other.primary
        secondary = other.secondary
        onPrimary = other.onPrimary
        onSecondary = other.onSecondary
    }

    fun copy(): EKColors = EKColors(
        primary = primary,
        secondary = secondary,
        onPrimary = onPrimary,
        onSecondary = onSecondary,
    )
}
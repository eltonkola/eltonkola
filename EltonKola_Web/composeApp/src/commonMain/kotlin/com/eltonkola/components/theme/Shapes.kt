package com.eltonkola.components.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

@Immutable
data class EKShape(
    val surface: CornerBasedShape,
    val small: CornerBasedShape,
    val medium: CornerBasedShape,
    val large: CornerBasedShape
)

val LocalEKShapes = staticCompositionLocalOf {
    EKShape(
        surface = RoundedCornerShape(ZeroCornerSize),
        small = RoundedCornerShape(ZeroCornerSize),
        medium = RoundedCornerShape(ZeroCornerSize),
        large = RoundedCornerShape(ZeroCornerSize)
    )
}

val EKShapes = EKShape(
    surface = RoundedCornerShape(ZeroCornerSize),
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(16.dp)
)
package com.eltonkola.wallpapers.animations.albanianEagle

import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import math.PI
import kotlin.math.atan
import kotlin.math.cos
import kotlin.math.sin

const val TWO_PI = 2 * PI
const val RADIANS_TO_DEGREES_RATIO = 360f / TWO_PI

val getSlope: (Int, Float, Float) -> Float
        = { x, amplitude, period ->
    (
            cos((TWO_PI * x / period)) * (amplitude * (TWO_PI) / period)
            ).toFloat()
}

val getRotation: (Float) -> Float = { slope ->
    (atan(slope) * RADIANS_TO_DEGREES_RATIO).toFloat()
}

val getYOffset: (Int, Float, Float) -> Float = { x, amplitude, period ->
    (sin(x * TWO_PI / period) * amplitude).toFloat()
}


@Composable
fun AlbanianEagleTrack(
    modifier: Modifier,
    amplitude: Float,
    period: Float,
    durationMillis: Int,
    initialOffset : Int,
    item: @Composable () -> Unit
    ){

    val infiniteTransition = rememberInfiniteTransition()


    BoxWithConstraints(modifier) {

        val xOffset by infiniteTransition.animateValue(
            initialValue = initialOffset.dp,
            targetValue = maxWidth,
            typeConverter = Dp.VectorConverter,
            animationSpec = infiniteRepeatable(
                animation =  tween(durationMillis = durationMillis, easing = LinearEasing),
                repeatMode = RepeatMode.Restart
            )
        )
        Box(
            Modifier
                .offset(
                    x = xOffset,
                    y = getYOffset(xOffset.value.toInt(), amplitude, period).dp
                )
               // .rotate(getRotation(getSlope(xOffset.value.toInt(), amplitude, period)))
                .align(Alignment.CenterStart)
        ) {
            item()

        }
    }

}


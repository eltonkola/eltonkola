package com.eltonkola.components

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.eltonkola.components.theme.EKTheme
import supportsAdvancedAnimations

@Composable
fun EkCard(modifier: Modifier, content: @Composable () -> Unit) {

    val infiniteTransition = rememberInfiniteTransition()
    val color by infiniteTransition.animateColor(
        initialValue = EKTheme.colors().primary,
        targetValue = EKTheme.colors().secondary,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        )
    )

    val rotationValX by infiniteTransition.animateFloat(
        initialValue = 2F,
        targetValue = -2f,
        animationSpec = infiniteRepeatable(
            repeatMode = RepeatMode.Reverse,
            animation = tween(
                durationMillis = 1300,
                easing = LinearEasing,
            ),
        )
    )

    val rotationValY by infiniteTransition.animateFloat(
        initialValue = 10f,
        targetValue = -10f,
        animationSpec = infiniteRepeatable(
            repeatMode = RepeatMode.Reverse,
            animation = tween(
                durationMillis = 3400,
                easing = LinearEasing,
            ),
        )
    )

    val translation by infiniteTransition.animateFloat(
        initialValue = -2f,
        targetValue = 2f,
        animationSpec = infiniteRepeatable(
            repeatMode = RepeatMode.Reverse,
            animation = tween(
                durationMillis = 2000,
                easing = LinearEasing,
            ),
        )
    )

    val elevation by infiniteTransition.animateFloat(
        initialValue = 2f,
        targetValue = 6f,
        animationSpec = infiniteRepeatable(
            repeatMode = RepeatMode.Reverse,
            animation = tween(
                durationMillis = 3000,
                easing = LinearEasing,
            ),
        )
    )

    Card (
        modifier = modifier
            .drawBehind {

            }
            .graphicsLayer {
                //TODO - fix rotation XY not working on compose web

                if(supportsAdvancedAnimations()) {
                    rotationY = rotationValY
                    rotationX = rotationValX
                    rotationZ = rotationValX
                }
                translationX = translation
                translationY = translation
                spotShadowColor = color
                ambientShadowColor = color
            },
        content = content,
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, color),
        elevation = elevation.dp
    )

}
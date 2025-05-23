package com.eltonkola.wallpapers.animations

import K5
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import math.Vector2D
import math.map
import show
@Composable
fun CircleGridAnimation() {
    K5(
        modifier = Modifier.fillMaxSize().background(Color.Transparent)
    ) { dimensFloat, dimensInt ->

        val colorsList = listOf(Color.White, Color.Gray, Color.Magenta, Color.Cyan, Color.Blue, Color.Green, Color.Yellow, Color.Red)

        // This is not a design term of anything, this movement of contraction and expansion of muscle is called as peristalsis.
        // I'm just relating this here because circles are contracting and expanding. They say you must be very good at naming variables ;-)
        val peristalsisFactor = 0.5f + (1.75f - 0.5f)

        var scale = 0f
        var factor = 0f
        var reverse = false

        show(
            modifier = Modifier.fillMaxSize().background(Color.Transparent)
        ) {

            factor += 1000f
            if (factor > 400000f) {
                reverse = !reverse
                factor -= 400000f
            }
            val fraction = map(factor, 0f, 400000f, 0f, 1f)
            scale = if (reverse) {
                peristalsisFactor * FastOutSlowInEasing.transform(fraction)
            } else {
                peristalsisFactor * (1.0f - FastOutSlowInEasing.transform(fraction))
            }

            val radius = 50f
            val n = 25
            var cx: Float
            var cy = 0f
            for (row in 1..n) {
                cx = if (row % 2 == 0) {
                    radius
                } else {
                    0f
                }
                for (col in 1..n) {
                    it.drawCircle(
                        brush = Brush.radialGradient(colorsList),
                        radius = radius * scale,
                        center = Offset(
                            cx,
                            cy
                        ),
                        style = Stroke(width = 1f)
                    )
                    cx += 2 * radius
                }
                cy += 2 * radius - 10f
            }

        }
    }
}
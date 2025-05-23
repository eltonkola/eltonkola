package com.eltonkola.wallpapers.animations

import K5
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import math.PI
import math.TAU
import show
import kotlin.math.tan
import kotlin.random.Random

@Composable
fun RainAnimation() {
    K5(
        modifier = Modifier.fillMaxSize().background(Color.Transparent)
    ) { dimensFloat, dimensInt ->

        val N = 200
        var t = 0f
        val r = List(N) { Random.nextFloat() }

        show(modifier = Modifier.fillMaxSize().background(Color.Transparent)) {

            t += 0.002f
            for (i in 0 until N) {
                val x = dimensFloat.width * r[(i + 2) % N]
                val y = (tan(-PI / 2 + TAU * (t + r[i])) * 10 + dimensFloat.width * (1 - r[(i + 1) % N])).toFloat()
                val radius = 10 * r[(i + 3) % N]
                it.drawCircle(
                    Color(0xff3498db),
                    center = Offset(
                        x = x,
                        y = y
                    ),
                    radius = radius,
                    alpha = 0.7f
                )
            }
        }
    }
}

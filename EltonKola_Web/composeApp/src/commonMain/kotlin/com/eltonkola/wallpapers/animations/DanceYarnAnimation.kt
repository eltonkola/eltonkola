package com.eltonkola.wallpapers.animations

import K5
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import math.*
import show
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun DanceYarnAnimation() {
    K5(
        modifier = Modifier.fillMaxSize().background(Color.Transparent)
    ) { dimensFloat, dimensInt ->

        val loop = 10000
        val mouseVector = Vector2D()
        var m2d3dvec = 0
        var isUp = true

        show(
            modifier = Modifier.fillMaxSize().background(Color.Transparent)
                .pointerMoveFilter(onMove = {
                    mouseVector.x = it.x
                    mouseVector.y = it.y
                    false
                })
        ) {

            it.apply {
                when {
                    isUp && m2d3dvec > loop * loop -> {
                        isUp = false
                    }

                    isUp -> {
                        m2d3dvec++
                    }

                    m2d3dvec <= 0 -> {
                        isUp = true
                    }

                    else -> {
                        m2d3dvec--
                    }
                }
                var offset = 0.0
                mouseVector += Vector2D((-1..1).random().toFloat(), (-1..1).random().toFloat())
                val m2d = m2d3dvec / loop * 0.002
                val m3d = abs(m2d3dvec % loop - loop / 2) * 0.002
                for (i in 0 until max(0f, mouseVector.x - 2).toInt()) {
                    fun noiseX(variant: Double) = 2 * dimensFloat.width * noise3D(variant, m2d, m3d)
                    fun noiseY(variant: Double) = 2 * dimensFloat.height * noise3D(offset + variant, m2d, m3d)
                    fun color(variant: Double) = 0xFF - (0xFF * noise3D(variant, m2d, m3d)).toInt()
                    val x = FloatArray(4) { index -> noiseX(offset + 5 + index * 10).toFloat() }
                    val y = FloatArray(5) { index -> noiseY(offset + 5 + index * 10).toFloat() }
                    val path = Path()
                    path.moveTo(x[0], y[0])
                    path.cubicTo(x[1], y[1], x[2], y[2], x[2], y[2])
                    val red = color(offset + 35)
                    val green = color(offset + 25)
                    val blue = color(offset + 15)
                    drawPath(
                        path,
                        Color(red, green, blue),
                        alpha = max(min(mouseVector.y / dimensFloat.height, 1f), 0f),
                        style = Stroke(width = 0.3f)
                    )
                    offset += 0.002
                }
            }
        }
    }
}

package com.eltonkola.wallpapers.animations


import K5
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.consumeAllChanges
import androidx.compose.ui.input.pointer.pointerInput
import math.map
import show

@Composable
fun HeartsAnimation() {
    K5(
        modifier = Modifier.fillMaxSize().background(Color.Transparent)
    ) { dimensFloat, dimensInt ->


        var factor = 0f
        val scale = 2.0f
        var index = 0
        val n = 18

        val colors = listOf(
            Color(0xFFE03776).copy(alpha = 0.3f),
            Color(0xFF8F3E98).copy(alpha = 0.3f),
            Color(0xFF4687BF).copy(alpha = 0.3f),
            Color(0xFF3BAB6F).copy(alpha = 0.3f),
            Color(0xFFF9C25E).copy(alpha = 0.3f),
            Color(0xFFF47274).copy(alpha = 0.3f),
        )


        show(
            modifier = Modifier.fillMaxSize().background(Color.Transparent)
        ) {


            factor += 0.04f
            if (factor > scale) {
                factor -= scale
                index += 1
            }

            it.apply {
                translate(dimensFloat.width / 2, dimensFloat.height / 2) {
                    for (i in n downTo 0) {
                        val ithscale = factor + i * scale
                        val path = Path()
                        path.moveTo(0.0f * ithscale, 12.0f * ithscale)
                        path.cubicTo(
                            50.0f * ithscale,
                            -30.0f * ithscale,
                            110.0f * ithscale,
                            50.0f * ithscale,
                            0.0f * ithscale,
                            120.0f * ithscale
                        )
                        path.cubicTo(
                            -110.0f * ithscale,
                            50.0f * ithscale,
                            -50.0f * ithscale,
                            -30.0f * ithscale,
                            0.0f * ithscale,
                            12.0f * ithscale
                        )
                        path.close()
                        path.translate(Offset(0.0f, -69.0f * ithscale))

                        drawPath(
                            path = path,
                            color = colors[(index + (colors.size - i % colors.size)) % colors.size],
                            alpha = 0.4f
                        )
                    }
                }

            }
        }
    }
}

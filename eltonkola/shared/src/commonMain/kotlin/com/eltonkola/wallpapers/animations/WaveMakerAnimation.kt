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
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.consumeAllChanges
import androidx.compose.ui.input.pointer.pointerInput
import math.map
import show

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun WaveMakerAnimation() {
    K5(
        modifier = Modifier.fillMaxSize().background(Color.Transparent)
    ) { dimensFloat, dimensInt ->


        var angle = 0f
        var pointer = 0f
        val colorsList = listOf(Color.White, Color.Gray, Color.Cyan, Color.Blue, Color.Green, Color.Yellow, Color.Red)



        show(
            modifier = Modifier.fillMaxSize().background(Color.Transparent).pointerMoveFilter(
                onMove = {
                    pointer = map(it.x, 0f, dimensFloat.width, 1f, 30f)
                    true
                }
            )
        ) {
            val n = 25
            val circleRadius = (dimensFloat.width / n + n / 3)
            val spacing = circleRadius + n / 3
            val dotRadius = circleRadius / 7
            val diff = spacing - circleRadius
            var offsetX = 0f
            var offsetY = 0f
            for (row in 0..n) {
                for (col in 0..n) {
                    // it.drawCircle(
                    //     SolidColor(Color.White),
                    //     radius = circleRadius,
                    //     center = Offset(offsetX, offsetY),
                    //     style = Stroke(width = 3f),
                    //     alpha = 0.3f
                    // )
                    it.withTransform({
                        rotate(
                            (angle + (row * col) + (col + row) * pointer) % 360,
                            Offset(offsetX, offsetY - diff - circleRadius)
                        )
                    }) {
                        drawCircle(
                            brush = Brush.linearGradient(colorsList),
                            radius = dotRadius,
                            center = Offset(offsetX - diff, offsetY - diff)
                        )
                    }
                    offsetX += spacing
                }
                offsetX = 0f
                offsetY += spacing
            }
            angle += 0.01f * 360f
        }

    }
}


/**
 * Modifier allowing to track pointer (i.e. mouse or trackpad) move events.
 *  @param onMove The callback invoked when pointer is moved inside a component,
 *  relative position inside a component is passed
 *  @param onEnter The callback invoked when pointer enters the component
 *  @param onExit The callback invoked when pointer leaves the component
 */
@ExperimentalComposeUiApi
fun Modifier.pointerMoveFilter(
    onMove: (position: Offset) -> Boolean = { false },
    onExit: () -> Boolean = { false },
    onEnter: () -> Boolean = { false },
): Modifier = pointerInput(onMove, onExit, onEnter) {
    awaitPointerEventScope {
        while (true) {
            val event = awaitPointerEvent()
            val consumed = when (event.type) {
                PointerEventType.Move -> {
                    onMove(event.changes.first().position)
                }
                PointerEventType.Enter -> {
                    onEnter()
                }
                PointerEventType.Exit -> {
                    onExit()
                }
                else -> false
            }
            if (consumed) {
                event.changes.forEach { it.consumeAllChanges() }
            }
        }
    }
}

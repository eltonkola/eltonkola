package com.eltonkola.wallpapers.animations

import K5
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.translate
import math.map
import math.random
import show


data class Star(val dimens: Size) {
    val width = dimens.width
    val height = dimens.height
    var x = (-width..width).random()
    var y = (-height..height).random()
    var z = (0f..width).random()
    var pz = z

    fun update() {
        z -= 20
        if (z < 1) {
            z = dimens.width
            x = (-width..width).random()
            y = (-height..height).random()
            pz = z
        }
    }

    fun showStar(drawScope: DrawScope) {
        val sx = map(this.x / this.z, -1f, 1f, -dimens.width, dimens.width)
        val sy = map(this.y / this.z, -1f, 1f, -dimens.height, dimens.height)
        val r = map(this.z, 0f, dimens.width, 16f, 0f)
        drawScope.drawCircle(Color.White, r, Offset(sx, sy))

        val px = map(this.x / this.pz, -1f, 1f, -dimens.width, dimens.width)
        val py = map(this.y / this.pz, -1f, 1f, -dimens.height, dimens.height)
        val stroke = map(this.pz, 0f, dimens.width, 16f, 1f)
        pz = z
        drawScope.drawLine(Color.White, Offset(px, py), Offset(sx, sy), strokeWidth = stroke)
    }
}


@Composable
fun StarFieldAnimation() {
    K5(
        modifier = Modifier.fillMaxSize().background(Color.Transparent)
    ) { dimensFloat, dimensInt ->

        val stars = List(600) { Star(dimensFloat) }


        show(modifier = Modifier.fillMaxSize().background(Color.Transparent)) {
            it.translate(dimensFloat.width / 2, dimensFloat.height / 2) {
                for (star in stars) {
                    star.update()
                    star.showStar(it)
                }
            }
        }
    }
}

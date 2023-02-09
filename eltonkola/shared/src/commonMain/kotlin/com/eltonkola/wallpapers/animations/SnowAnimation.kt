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
import androidx.compose.ui.unit.IntSize
import math.PI
import math.k5Random
import show
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

val snowflakes = mutableListOf<SnowFlake>()

class SnowFlake(sizeDim: IntSize) {

    private var width : Double= sizeDim.width.toDouble()
    private var height : Double = sizeDim.height.toDouble()

    private var posX : Float = 0f
    // initialize coordinates
    private var posY : Float = k5Random(-50, 0)
    private val initialangle = k5Random(0, (2 * PI).toInt())
    private val size = k5Random(2, 5)

    // radius of snowflake spiral
    // chosen so the snowflakes are uniformly spread out in area
    private val radius = sqrt(k5Random(0, (width / 2).pow(2).toInt()))

    fun update(time: Int) {
        // x position follows a circle
        val w = 0.6 // angular speed
        val angle = w * time + this.initialangle;
        this.posX = ((width / 2 + this.radius * sin(angle)).toFloat())

        // different size snowflakes fall at slightly different y speeds
        this.posY += this.size.pow(0.5.toFloat())

        // delete snowflake if past end of screen
        if (this.posY > height) {
            snowflakes.remove(this)
        }
    }

    fun display(drawScope: DrawScope) {

        drawScope.drawOval(
            color = Color.White,
            topLeft = Offset(x =this.posX, y = this.posY),
            size = Size(this.size, this.size), //Size(height = 300F, width = 500F),
        )

    }
}

@Composable
fun SnowAnimation() {
    K5(
        modifier = Modifier.fillMaxSize().background(Color.Transparent)
    ) { dimensFloat, dimensInt ->

        val snowflakes = mutableListOf<SnowFlake>()

        show(modifier = Modifier.fillMaxSize().background(Color.Transparent)) {
            val t = 10 //frameCount / 60f

            for (i in 0 until k5Random(0, 5).toInt()) {
                snowflakes.add(SnowFlake(dimensInt))
            }

            for (flake in snowflakes) {
                flake.update(t)
                flake.display(it)
            }


        }
    }
}

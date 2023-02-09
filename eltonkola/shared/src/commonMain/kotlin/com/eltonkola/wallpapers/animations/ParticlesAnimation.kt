package com.eltonkola.wallpapers.animations

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import K5
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.dp
import math.Vector2D
import math.distance
import math.divide
import math.multiply
import math.plusAssign
import math.random
import math.toOffSet
import show
import showWithControls
import kotlin.math.abs

class Particle(private val dimension: Size, private val velocityFactor: State<Float>, private val distance: State<Float>) {

    val position = Vector2D(
        (0f..dimension.width).random(),
        (0f..dimension.height).random()
    )

    var r = (1f..8f).random()

    private var velocity = Vector2D(
        (-2.0f..2.0f).random(),
        (-1.0f..1.5f).random()
    )

    fun createParticle(drawScope: DrawScope) {
        drawScope.drawCircle(Color.White, r, position.toOffSet())
    }

    fun moveParticle() {
        velocity.multiply(velocityFactor.value)
        if (position.x < 0f || position.x > dimension.width) {
            velocity.x *= -1
        }
        if (position.y < 0f || position.y > dimension.height) {
            velocity.y *= -1
        }
        position += velocity
        velocity.divide(velocityFactor.value)
    }

    fun joinParticles(drawScope: DrawScope, particles: List<Particle>) {
        particles.forEach {
            val dist = this.position.distance(it.position)
            if (dist < distance.value) {
                drawScope.drawLine(Color.Cyan, this.position.toOffSet(), it.position.toOffSet(), alpha = 0.5f)
            }
        }
    }
}

//https://github.com/CuriousNikhil/k5-compose/blob/main/src/main/kotlin/examples/particles/particles-js-simulation.kt
@Composable
fun ParticlesAnimation() {
    K5(
        modifier = Modifier.fillMaxSize().background(Color.Transparent)
    ) { dimensFloat, _ ->

        val numberOfParticles = mutableStateOf(50)
        val velocityFactor = mutableStateOf(1f)
        val distance = mutableStateOf(100f)
        val particles = mutableStateListOf<Particle>()
        repeat(numberOfParticles.value) {
            particles.add(Particle(dimensFloat, velocityFactor, distance))
        }

        show(modifier = Modifier.fillMaxSize().background(Color.Transparent)) { drawScope ->
            particles.forEachIndexed { index, particle ->
                particle.createParticle(drawScope)
                particle.moveParticle()
                particle.joinParticles(drawScope, particles.slice(0 until index))
            }
        }

    }
}
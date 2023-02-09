package com.eltonkola.components

import androidx.compose.animation.animateColor
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer


enum class BoxState { Front, Back }

@Composable
fun AnimatingBox(
    rotated: Boolean,
    onRotate: (Boolean) -> Unit
) {
    val transitionData = updateTransitionData(
        if (rotated) BoxState.Back else BoxState.Front
    )
    Card(
        Modifier
            .fillMaxSize(.5f)
            .graphicsLayer {
                rotationY = transitionData.rotation
                cameraDistance = 8 * density
            }
            .clickable { onRotate(!rotated) },
        backgroundColor = transitionData.color
    )
    {
        Column (
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = if (rotated) "Back" else "Front",
                modifier = Modifier
                    .graphicsLayer {
                        alpha =
                            if (rotated) transitionData.animateBack else transitionData.animateFront
                        rotationY = transitionData.rotation
                    })
        }

    }
}


private class TransitionData(
    color: State<Color>,
    rotation: State<Float>,
    animateFront: State<Float>,
    animateBack: State<Float>
) {
    val color by color
    val rotation by rotation
    val animateFront by animateFront
    val animateBack by animateBack
}


@Composable
private fun updateTransitionData(boxState: BoxState): TransitionData {
    val transition = updateTransition(boxState, label = "")
    val color = transition.animateColor(
        transitionSpec = {
            tween(500)
        },
        label = ""
    ) { state ->
        when (state) {
            BoxState.Front -> Color.Blue
            BoxState.Back -> Color.Red
        }
    }
    val rotation = transition.animateFloat(
        transitionSpec = {
            tween(500)
        },
        label = ""
    ) { state ->
        when (state) {
            BoxState.Front -> 0f
            BoxState.Back -> 180f
        }
    }

    val animateFront = transition.animateFloat(
        transitionSpec = {
            tween(500)
        },
        label = ""
    ) { state ->
        when (state) {
            BoxState.Front -> 1f
            BoxState.Back -> 0f
        }
    }
    val animateBack = transition.animateFloat(
        transitionSpec = {
            tween(500)
        },
        label = ""
    ) { state ->
        when (state) {
            BoxState.Front -> 0f
            BoxState.Back -> 1f
        }
    }

    return remember(transition) { TransitionData(color, rotation, animateFront, animateBack) }
}




@Composable
fun FlipCard() {

    var rotated by remember { mutableStateOf(false) }

    val rotation by animateFloatAsState(
        targetValue = if (rotated) 180f else 0f,
        animationSpec = tween(500)
    )

    val animateFront by animateFloatAsState(
        targetValue = if (!rotated) 1f else 0f,
        animationSpec = tween(500)
    )

    val animateBack by animateFloatAsState(
        targetValue = if (rotated) 1f else 0f,
        animationSpec = tween(500)
    )

    val animateColor by animateColorAsState(
        targetValue = if (rotated) Color.Red else Color.Blue,
        animationSpec = tween(500)
    )

    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Card(
            Modifier
                .fillMaxSize(.5f)
                .graphicsLayer {
                    rotationY = rotation
                    cameraDistance = 8 * density
                }
                .clickable {
                    rotated = !rotated
                },
            backgroundColor = animateColor
        )
        {
            Column(
                Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Text(text = if (rotated) "Back" else "Front",
                    modifier = Modifier
                        .graphicsLayer {
                            alpha = if (rotated) animateBack else animateFront
                            rotationY = rotation
                        })
            }

        }
    }
}



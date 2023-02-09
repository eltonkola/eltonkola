package com.eltonkola.wallpapers.animations.albanianEagle

import androidx.compose.animation.core.*
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.eltonkola.components.icons.EKIcon
import com.eltonkola.components.icons.ekicon.*

@Composable
fun AlbanianEagle(modifier: Modifier, speed: Int){
    val infiniteTransition = rememberInfiniteTransition()

    val currentIndex by infiniteTransition.animateFloat(
        initialValue = 1.0f,
        targetValue = 10.0f,
        animationSpec = infiniteRepeatable(
            animation = tween(speed, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        )
    )


    val icon = when(currentIndex.toInt()){
        1 -> EKIcon.AlbanianEagle1
        2 -> EKIcon.AlbanianEagle2
        3 -> EKIcon.AlbanianEagle3
        4 -> EKIcon.AlbanianEagle4
        5 -> EKIcon.AlbanianEagle5
        6 -> EKIcon.AlbanianEagle6
        7 -> EKIcon.AlbanianEagle7
        8 -> EKIcon.AlbanianEagle8
        9 -> EKIcon.AlbanianEagle9
        10 -> EKIcon.AlbanianEagle10
        else -> EKIcon.AlbanianEagle1
    }

    Icon(
        modifier = modifier,
        imageVector = icon,
        contentDescription = "animated eagle"
    )


}
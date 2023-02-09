package com.eltonkola.components


import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RoundButton(modifier: Modifier = Modifier,
               selected: Boolean,
               onAction: () -> Unit,
               buttonContent: @Composable RowScope.(Boolean) -> Unit) {

    val backgroundColor = animateColorAsState(
        targetValue = if (selected) {
            Color(0xff301453)
        } else {
            Color(0xffBC64A1)
        },
        animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing),
    )
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(6.dp))
            .background(backgroundColor.value)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(color = MaterialTheme.colors.primarySurface),
                enabled = !selected
            ) {
                onAction()
            }
            ,
        horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ){
        Row (
            content = { buttonContent(selected) }
        )
    }
}
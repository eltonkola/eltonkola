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
fun SideButton(modifier: Modifier = Modifier,
               selected: Boolean,
               onAction: () -> Unit,
               isRight: Boolean = true,
               buttonContent: @Composable RowScope.(Boolean) -> Unit) {

    val backgroundColor = animateColorAsState(
        targetValue = if (selected) {
            Color(0xff301453)
        } else {
            Color(0xffBC64A1)
        },
        animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing),
    )
    val rightCorners = RoundedCornerShape(topEnd = 6.dp, bottomEnd = 6.dp)
    val leftCorners = RoundedCornerShape(topStart = 6.dp, bottomStart = 6.dp)
    Row(
        modifier = modifier
            .clip(if(isRight) rightCorners else leftCorners)
            .background(backgroundColor.value)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(color = MaterialTheme.colors.primarySurface),
                enabled = !selected
            ) {
                onAction()
            }
           // .sizeIn(minWidth = 140.dp)
            ,
        horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ){
        Row (
          // modifier = Modifier.padding(2.dp),
            content = { buttonContent(selected) }
        )
    }
}
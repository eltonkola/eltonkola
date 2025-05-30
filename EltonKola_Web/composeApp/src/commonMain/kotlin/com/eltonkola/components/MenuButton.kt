package com.eltonkola.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.eltonkola.components.theme.EKTheme

@Composable
fun MenuButton(modifier: Modifier = Modifier, text: String, selected: Boolean, onAction: () -> Unit) {

    val backgroundColor = animateColorAsState(
        targetValue = if (selected) {
            EKTheme.colors().primary
        } else {
            EKTheme.colors().secondary
        },
        animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing),
    )
    val textColor = animateColorAsState(
        targetValue = if (selected) {
            EKTheme.colors().onPrimary
        } else {
            EKTheme.colors().onSecondary
        },
        animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing),
    )

    Card  (
        modifier = modifier,
        elevation =  CardDefaults.cardElevation(
            10.dp
        ),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor.value,
        ),
        onClick = onAction
    ) {
        Text(
            modifier = Modifier.padding(top = 12.dp, bottom = 12.dp, start = 24.dp, end = 24.dp),
            text = text,
            color = textColor.value
        )
    }

}
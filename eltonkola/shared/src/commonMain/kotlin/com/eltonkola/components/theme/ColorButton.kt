package com.eltonkola.components.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.eltonkola.components.RoundButton
import com.eltonkola.components.SideButton
import com.eltonkola.model.ColorScheme
import com.eltonkola.model.UiState


@Composable
fun ColorButton(uiState: UiState, onUpdate: (UiState) -> Unit, color: ColorScheme, colorValue: Color) {
    val selected = uiState.color ==  color
    SideButton(
        modifier = Modifier.alpha(if(selected) 1f else 0.5f).width(if(selected) 34.dp else 20.dp).height(20.dp),
        selected = selected,
        onAction= { onUpdate(uiState.copy(color = color)) },
        isRight = true
    ) {
        Box(
            modifier = Modifier
                .width(if(selected) 34.dp else 20.dp)
                .height(20.dp).background(colorValue)
            ,
        )
    }
}

@Composable
fun RoundColorButton(uiState: UiState, onUpdate: (UiState) -> Unit, color: ColorScheme, colorValue: Color) {
    val selected = uiState.color ==  color
    RoundButton(
        modifier = Modifier.alpha(if(selected) 1f else 0.5f).width(if(selected) 34.dp else 20.dp).height(20.dp),
        selected = selected,
        onAction= { onUpdate(uiState.copy(color = color)) },
    ) {
        Box(
            modifier = Modifier
                .width(if(selected) 34.dp else 20.dp)
                .height(20.dp).background(colorValue)
            ,
        )
    }
}

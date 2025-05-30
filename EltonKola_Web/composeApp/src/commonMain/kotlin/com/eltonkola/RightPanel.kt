package com.eltonkola

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.eltonkola.components.SideButton
import com.eltonkola.components.icons.EKIcon
import com.eltonkola.components.icons.ekicon.*
import com.eltonkola.components.theme.ColorButton
import com.eltonkola.components.theme.PRIMARY1
import com.eltonkola.model.ColorScheme
import com.eltonkola.model.UiState

@Composable
fun RightPanel(modifier: Modifier, uiState: UiState, onUpdate: (UiState) -> Unit) {

    Column(
        modifier = modifier
    ) {


        Spacer(modifier = Modifier.size(16.dp))

        SideButton(
            modifier = Modifier,
            selected = false,
            onAction= { onUpdate(uiState.copy(darkMode = !uiState.darkMode)) },
            isRight = true
        ) {
            Image(
                modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 2.dp).width(28.dp).height(28.dp),
                imageVector = if (uiState.darkMode)  EKIcon.Sun else EKIcon.Moon,
                contentDescription = "Light/Night mode"
            )
        }
        Spacer(modifier = Modifier.size(6.dp))
        SideButton(
            modifier = Modifier,
            selected = false,
            onAction = { onUpdate(uiState.copy(mobileMode = !uiState.mobileMode)) },
        ) {
            Image(
                modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 2.dp)
                    .width(28.dp)
                    .height(28.dp),
                imageVector = if (uiState.mobileMode) EKIcon.DesktopMode else EKIcon.MobileMode,
                contentDescription = "Desktop/Mobile mode"
            )
        }


        Spacer(modifier = Modifier.size(18.dp))
        ColorButton(
            uiState = uiState,
            onUpdate = onUpdate,
            color = ColorScheme.Red,
            colorValue = Color.Red
        )
        Spacer(modifier = Modifier.size(4.dp))
        ColorButton(
            uiState = uiState,
            onUpdate = onUpdate,
            color = ColorScheme.Yellow,
            colorValue = Color.Yellow
        )
        Spacer(modifier = Modifier.size(4.dp))
        ColorButton(
            uiState = uiState,
            onUpdate = onUpdate,
            color = ColorScheme.Blue,
            colorValue = Color.Blue
        )
        Spacer(modifier = Modifier.size(4.dp))
        ColorButton(
            uiState = uiState,
            onUpdate = onUpdate,
            color = ColorScheme.Green,
            colorValue = Color.Green
        )
        Spacer(modifier = Modifier.size(4.dp))
        ColorButton(
            uiState = uiState,
            onUpdate = onUpdate,
            color = ColorScheme.Default,
            colorValue = PRIMARY1
        )



        Spacer(modifier = Modifier.width(8.dp).weight(1f))


        SideButton(
            modifier = Modifier,
            selected = false,
            onAction= { onUpdate(uiState.copy(wallpaper = uiState.wallpaper.prev())) },
            isRight = true
        ) {
            Image(
                modifier = Modifier.padding(6.dp).width(34.dp).height(34.dp),
                imageVector = EKIcon.ArrowLeft,
                contentDescription = "Previous wallpaper"
            )
        }
        Spacer(modifier = Modifier.size(4.dp))
        SideButton(
            modifier = Modifier,
            selected = false,
            onAction= { onUpdate(uiState.copy(wallpaper = uiState.wallpaper.next())) },
            isRight = true
        ){
            Image(
                modifier = Modifier.padding(6.dp).width(34.dp).height(34.dp),
                imageVector = EKIcon.ArrowRight,
                contentDescription = "Next wallpaper"
            )
        }
        Spacer(modifier = Modifier.size(16.dp))

    }
}
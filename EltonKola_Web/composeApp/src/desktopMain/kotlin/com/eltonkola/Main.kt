package com.eltonkola

import DesktopView
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import com.eltonkola.data.EK_TITLE

fun main() = application {
    Window(
        state = WindowState(size = DpSize(1600.dp, 880.dp)),
        onCloseRequest = ::exitApplication,
        title = EK_TITLE,
    ) {
        DesktopView()
    }

}

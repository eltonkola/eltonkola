package com.eltonkola

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.style.TextAlign
import com.eltonkola.components.theme.EKTheme
import com.eltonkola.data.LocalContent
import com.eltonkola.model.UiState

@Composable
fun BottomPanel(modifier: Modifier, uiState: UiState, onUpdate: (UiState) -> Unit) {

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {

       Text(
           modifier = Modifier.fillMaxWidth(),
           textAlign = TextAlign.Center,
           style = EKTheme.typography().footer.copy(
               shadow = Shadow(
                   color = EKTheme.colors().onPrimary,
                   offset = Offset(4f, 4f),
                   blurRadius = 8f
               )
           ),
           text = LocalContent.current.footer
       )
        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = MaterialTheme.colors.onPrimary,
            text = LocalContent.current.footer
        )
    }
}

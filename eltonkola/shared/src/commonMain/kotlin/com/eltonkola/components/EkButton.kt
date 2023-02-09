package com.eltonkola.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.eltonkola.components.theme.EKTheme

@Composable
fun EkButton(onClick: () -> Unit, icon: ImageVector, text: String) {
    OutlinedButton(
        onClick = onClick,
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = EKTheme.colors().secondary.copy(alpha = 0.1f),
            contentColor = EKTheme.colors().onSecondary,
            disabledBackgroundColor = EKTheme.colors().primary.copy(alpha = 0.12f),
            disabledContentColor = EKTheme.colors().onSecondary.copy(alpha = 0.42f)
        )
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ){
            Image(imageVector = icon, contentDescription = null, modifier = Modifier.size(24.dp))
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                text = text,
                color = EKTheme.colors().onSecondary
            )
        }
    }

}
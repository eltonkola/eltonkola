package com.eltonkola.components.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Immutable
data class EKTypography(
    val titleLarge: TextStyle,
    val titleSmall: TextStyle,
    val body: TextStyle,
    val bodySmall: TextStyle,
    val bodySmaller: TextStyle,
    val bodyTiny: TextStyle,
    val headerButton: TextStyle,
    val bodyButton: TextStyle,
    val footer: TextStyle
)

val LocalTypography = staticCompositionLocalOf {
    EKTypography(
        titleLarge = TextStyle.Default,
        titleSmall = TextStyle.Default,
        body = TextStyle.Default,
        bodySmall = TextStyle.Default,
        bodySmaller = TextStyle.Default,
        bodyTiny = TextStyle.Default,
        headerButton = TextStyle.Default,
        bodyButton = TextStyle.Default,
        footer = TextStyle.Default,
    )
}

val  EkFont = FontFamily.Monospace

val typography = EKTypography(
    titleLarge = TextStyle(
        fontFamily = EkFont,
        fontWeight = FontWeight.Bold,
        fontSize = 38.sp,
        lineHeight = 52.sp
    ),
    titleSmall = TextStyle(
        fontFamily = EkFont,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 48.sp
    ),
    body = TextStyle(
        fontFamily = EkFont,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        lineHeight = 30.sp
    ),
    bodySmall = TextStyle(
        fontFamily = EkFont,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 30.sp
    ),
    bodySmaller = TextStyle(
        fontFamily = EkFont,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 30.sp
    ),
    bodyTiny = TextStyle(
        fontFamily = EkFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    headerButton = TextStyle(
        fontFamily = EkFont,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 18.sp
    ),
    bodyButton = TextStyle(
        fontFamily = EkFont,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    footer =TextStyle(
        fontFamily = EkFont,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
    ),


)

@Composable
fun TextPreviewsContent() {
    Column {
        Text(
            text = "Bla bla bla.",
            style = EKTheme.typography().titleLarge
        )
        Spacer(modifier = Modifier.size(12.dp))
        Text(
            text = "Bla bla bla.",
            style = EKTheme.typography().titleSmall
        )
        Spacer(modifier = Modifier.size(12.dp))
        Text(
            text = "Bla bla bla.",
            style = EKTheme.typography().body
        )
        Spacer(modifier = Modifier.size(12.dp))
        Text(
            text = "Bla bla bla.",
            style = EKTheme.typography().bodySmall
        )
        Spacer(modifier = Modifier.size(12.dp))
        Text(
            text = "Bla bla bla.",
            style = EKTheme.typography().bodySmaller
        )
        Spacer(modifier = Modifier.size(12.dp))
        Text(
            text = "Bla bla bla.",
            style = EKTheme.typography().bodyTiny
        )
        Spacer(modifier = Modifier.size(12.dp))
        Text(
            text = "Bla bla bla.",
            style = EKTheme.typography().headerButton
        )
        Spacer(modifier = Modifier.size(12.dp))
        Text(
            text = "Bla bla bla.",
            style = EKTheme.typography().bodyButton
        )
        Spacer(modifier = Modifier.size(12.dp))
    }

}
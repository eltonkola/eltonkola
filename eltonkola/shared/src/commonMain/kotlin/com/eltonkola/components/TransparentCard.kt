package com.eltonkola.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.*
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.dp

@Composable
fun TransparentCard(
    modifier :Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,

) {

    Card(
        shape = RoundedCornerShape(18.dp),
        elevation = 0.dp,
        modifier = modifier,
        backgroundColor = Color.Transparent // Color.Red.copy(alpha = 0.5f).compositeOver(Color.Transparent)
    ) {

        Box(
            modifier = Modifier.fillMaxSize()
                .border(
                    width = 2.dp,
                    brush = Brush.horizontalGradient(
                        colors = listOf(
//                            Color(0x80FFFFFF),
//                            Color(0x80151C2E)
                            Color(0x66FFFFFF),
                            Color(0x66151C2E)
                        )
                    ),
                    shape = RoundedCornerShape(16.dp)
                )
        ) {
            blurBackground()
            Column(
                modifier = Modifier.fillMaxSize().padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                content()
            }
        }

    }
}
/*
100% — FF
95% — F2
90% — E6
85% — D9
80% — CC
75% — BF
70% — B3
65% — A6
60% — 99
55% — 8C
50% — 80
45% — 73
40% — 66
35% — 59
30% — 4D
25% — 40
20% — 33
15% — 26
10% — 1A
5%  — 0D
0% —  00
*/

@Composable
fun blurBackground(){
    Box(
        modifier = Modifier.fillMaxSize()
            .alpha(1f)
            .blur(
                radius = 40.dp,
                edgeTreatment = BlurredEdgeTreatment.Unbounded
            )
            .background(
                Brush.radialGradient(
                    listOf(
//                        Color(0x12FFFFFF),
//                        Color(0xDFFFFFF),
//                        Color(0x9FFFFFFF)
                        Color(0x4DFF0000),
                        Color(0x80336699),
                        Color(0x99FFFFFF)

                    ),
                    radius = 640f,
                    center = Offset.Infinite
                )
            )
    ) {

    }
}
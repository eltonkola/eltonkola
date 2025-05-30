package com.eltonkola.wallpapers.animations.albanianEagle

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun AlbanianEagleBackground(
    modifier: Modifier
    ){

    Box(
        modifier = modifier
    ){

        AlbanianEagleTrack(
            amplitude = 30f,
            period = 280f,
            initialOffset = -320,
            durationMillis = 40000,
            modifier = Modifier.fillMaxWidth().height(200.dp) //.background(Color.Red)
        ){
            AlbanianEagle(
                modifier = Modifier.size(80.dp, 60.dp), //.background(Color.Blue),
                speed = 1200
            )
        }

        AlbanianEagleTrack(
            amplitude = 30f,
            period = 280f,
            initialOffset = 0,
            durationMillis = 50000,
            modifier = Modifier.fillMaxWidth()
                .padding(top = 80.dp)
                .height(200.dp) //.background(Color.Red)
        ){
            AlbanianEagle(
                modifier = Modifier.size(80.dp, 60.dp), //.background(Color.Blue),
                speed = 1100
            )
        }


        AlbanianEagleTrack(
            amplitude = 30f,
            period = 280f,
            initialOffset = -40,
            durationMillis = 30000,
            modifier = Modifier.fillMaxWidth()
                .padding(top = 80.dp).height(200.dp)
                .padding(top = 120.dp)
                .graphicsLayer {
                    rotationZ = 180f
                }
        //.background(Color.Red)
        ){
            AlbanianEagle(
                modifier = Modifier.size(80.dp, 60.dp), //.background(Color.Blue),
                speed = 1600
            )
        }

        AlbanianEagleTrack(
            amplitude = 30f,
            period = 280f,
            initialOffset = -420,
            durationMillis = 42000,
            modifier = Modifier.fillMaxWidth()
                .padding(top = 40.dp)
                .graphicsLayer {
                    rotationZ = 180f
                }
                .height(200.dp) //.background(Color.Red)
        ){
            AlbanianEagle(
                modifier = Modifier.size(80.dp, 60.dp), //.background(Color.Blue),
                speed = 1400
            )
        }


    }



}


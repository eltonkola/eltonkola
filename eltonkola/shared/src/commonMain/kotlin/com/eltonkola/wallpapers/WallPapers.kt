package com.eltonkola.wallpapers

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.eltonkola.wallpapers.animations.albanianEagle.AlbanianEagleBackground
import com.eltonkola.data.URLS
import com.eltonkola.wallpapers.animations.*
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
@OptIn(ExperimentalResourceApi::class)
@Composable
fun WallPaper1() {
    Box(  modifier = Modifier.fillMaxSize()){
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(URLS.WALLPAPER_1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )

        AlbanianEagleBackground(
            modifier = Modifier.fillMaxSize()
        )

    }

}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun WallPaper2() {
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(URLS.WALLPAPER_2),
        contentDescription = null,
        contentScale = ContentScale.Crop,
    )
    ParticlesAnimation()
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun WallPaper3() {
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(URLS.WALLPAPER_3),
        contentDescription = null,
        contentScale = ContentScale.Crop,
    )
    RainAnimation()
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun WallPaper4() {
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(URLS.WALLPAPER_4),
        contentDescription = null,
        contentScale = ContentScale.Crop,
    )

    StarFieldAnimation()

}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun WallPaper5() {
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(URLS.WALLPAPER_5),
        contentDescription = null,
        contentScale = ContentScale.Crop,
    )

    SnowAnimation()

    //WaveMakerAnimation() //TODO - shemtuar
    //HeartsAnimation()
    //CircleGridAnimation()
    //HeartsAnimation()
    //DanceYarnAnimation()
}

//other cool ideas
//https://p5js.org/examples/simulate-penrose-tiles.html
//https://p5js.org/examples/simulate-snowflakes.html
//https://p5js.org/examples/simulate-l-systems.html
//https://p5js.org/examples/simulate-flocking.html
//https://p5js.org/examples/3d-sine-cosine-in-3d.html

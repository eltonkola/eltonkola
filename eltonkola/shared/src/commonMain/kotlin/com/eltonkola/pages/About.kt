package com.eltonkola.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.eltonkola.components.EkCard
import com.eltonkola.components.theme.EKTheme
import com.eltonkola.data.LocalContent
import com.eltonkola.data.URLS
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun About() {
    Row(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(
            modifier = Modifier.fillMaxHeight().weight(0.4f),
            contentAlignment = Alignment.Center
        ) {
            EkCard(Modifier) {
                Image(
                    painter = painterResource(URLS.ABOUT_URL),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.width(320.dp).height(460.dp),
                )
            }
        }

        Column(
            modifier = Modifier.fillMaxHeight().weight(0.6f).padding(top = 32.dp )
        ){

            Text(
                text = LocalContent.current.about.title,
                style = EKTheme.typography().titleLarge
            )
            Spacer(modifier = Modifier.size(20.dp))
            Text(
                style = EKTheme.typography().body,
                text = LocalContent.current.about.body,
            )
        }
    }
}


@Composable
fun AboutMobile() {

    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(26.dp),
    ) {

        item {

            Text(
                text = LocalContent.current.about.title,
                style = EKTheme.typography().titleLarge
            )
            Spacer(modifier = Modifier.size(20.dp))
            Text(
                style = EKTheme.typography().body,
                text = LocalContent.current.about.body,
            )

        }

    }
}
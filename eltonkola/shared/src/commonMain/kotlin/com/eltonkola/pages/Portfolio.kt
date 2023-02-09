package com.eltonkola.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import com.eltonkola.components.EkButton
import com.eltonkola.components.EkCard
import com.eltonkola.components.icons.EKIcon
import com.eltonkola.components.icons.ekicon.Github
import com.eltonkola.components.icons.ekicon.Playstore
import com.eltonkola.components.theme.EKTheme
import com.eltonkola.data.LocalContent
import com.eltonkola.data.URLS
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Portfolio() {
    Row(
        modifier = Modifier.fillMaxSize(),
    ) {


        Column(
            modifier = Modifier.fillMaxHeight().weight(0.6f).padding(26.dp)
        ){

            Text(
                text = LocalContent.current.portfolio.title,
                style = EKTheme.typography().titleLarge
            )
            Spacer(modifier = Modifier.size(20.dp))
            Text(
                style = EKTheme.typography().body,
                text = LocalContent.current.portfolio.body,
            )

            Spacer(modifier = Modifier.fillMaxWidth().weight(1f))
            val uriHandler = LocalUriHandler.current

            Row {
                EkButton(onClick = { uriHandler.openUri(URLS.PROFILE_PLAYSTORE) }, icon = EKIcon.Playstore, text = LocalContent.current.portfolio.playStore)
                Spacer(modifier = Modifier.size(18.dp))
                EkButton(onClick = { uriHandler.openUri(URLS.PROFILE_LINKEDIN) }, icon = EKIcon.Github, text = LocalContent.current.portfolio.github)
            }
        }

        Box(
            modifier = Modifier.fillMaxHeight().weight(0.4f),
            contentAlignment = Alignment.Center
        ) {
            EkCard(Modifier) {
                Image(
                    painter = painterResource(URLS.PORTFOLIO_URL),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.width(320.dp).height(460.dp),
                )
            }
        }




    }
}



@Composable
fun PortfolioMobile() {
    val uriHandler = LocalUriHandler.current

    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(26.dp),
    ) {
        item {
            Text(
                text = LocalContent.current.portfolio.title,
                style = EKTheme.typography().titleLarge
            )
            Spacer(modifier = Modifier.size(20.dp))
            Text(
                style = EKTheme.typography().body,
                text = LocalContent.current.portfolio.body,
            )

            Spacer(modifier = Modifier.fillMaxWidth().height(10.dp))

            Row {
                EkButton(onClick = { uriHandler.openUri(URLS.PROFILE_PLAYSTORE) }, icon = EKIcon.Playstore, text = LocalContent.current.portfolio.playStore)
                Spacer(modifier = Modifier.size(18.dp))
                EkButton(onClick = { uriHandler.openUri(URLS.PROFILE_LINKEDIN) }, icon = EKIcon.Github, text = LocalContent.current.portfolio.github)
            }
        }

    }

}

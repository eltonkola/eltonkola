package com.eltonkola.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import com.eltonkola.components.EkButton
import com.eltonkola.components.EkCard
import com.eltonkola.components.icons.EKIcon
import com.eltonkola.components.icons.ekicon.*
import com.eltonkola.components.theme.EKTheme
import com.eltonkola.data.LocalContent
import com.eltonkola.data.URLS
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Home() {
    Column(
        modifier = Modifier.fillMaxSize().padding(26.dp),
    ) {

        Row(
            modifier = Modifier.fillMaxWidth().weight(1f),
        ) {

            Column(
                modifier = Modifier.fillMaxHeight().weight(0.6f)
            ) {

                Text(
                    text = LocalContent.current.home.title,
                    style = EKTheme.typography().titleLarge
                )
                Spacer(modifier = Modifier.size(14.dp))
                Text(
                    style = EKTheme.typography().body,
                    text = LocalContent.current.home.body
                )

                Spacer(modifier = Modifier.fillMaxWidth().weight(1f))

            }


            Box(
                modifier = Modifier.fillMaxHeight().weight(0.4f),
                contentAlignment = Alignment.Center
            ) {
                EkCard(Modifier) {
                    Image(
                        painter = painterResource(URLS.HOME_URL),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.width(320.dp).height(460.dp),
                    )
                }
            }

        }


        val uriHandler = LocalUriHandler.current
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            EkButton({ uriHandler.openUri(URLS.DOWNLOAD_ANDROID) }, EKIcon.Playstore, "Android")
            EkButton({ uriHandler.openUri(URLS.DOWNLOAD_IPHONE) }, EKIcon.DownloadAppstore, "iPhone")
            EkButton({ uriHandler.openUri(URLS.DOWNLOAD_LINUX) }, EKIcon.DownloadLinux, "Windows")
            EkButton({ uriHandler.openUri(URLS.DOWNLOAD_WINDOWS) }, EKIcon.DownloadMicrosoft, "Windows")
            EkButton({ uriHandler.openUri(URLS.DOWNLOAD_MACOS) }, EKIcon.DownloadApple, "macOs")
            EkButton(
                { uriHandler.openUri(URLS.LINK_WEB_LITE) },
                EKIcon.Home,
                text = LocalContent.current.home.liteVersion
            )
        }

    }

}


@Composable
fun HomeMobile() {
    Column(
        modifier = Modifier.fillMaxSize().padding(26.dp),
    ) {

        val uriHandler = LocalUriHandler.current

        LazyColumn {
            item {
                Text(
                    text = LocalContent.current.home.title,
                    style = EKTheme.typography().titleLarge
                )
                Spacer(modifier = Modifier.size(14.dp))
            }

            item {
                Text(
                    style = EKTheme.typography().body,
                    text = LocalContent.current.home.body
                )

            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(18.dp)
                ) {
                    EkButton({ uriHandler.openUri(URLS.DOWNLOAD_ANDROID) }, EKIcon.Playstore, "Android")
                    EkButton({ uriHandler.openUri(URLS.DOWNLOAD_IPHONE) }, EKIcon.DownloadAppstore, "iPhone")
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(18.dp)
                ) {
                    EkButton({ uriHandler.openUri(URLS.DOWNLOAD_LINUX) }, EKIcon.DownloadLinux, "Windows")
                    EkButton({ uriHandler.openUri(URLS.DOWNLOAD_WINDOWS) }, EKIcon.DownloadMicrosoft, "Windows")
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(18.dp)
                ) {
                    EkButton({ uriHandler.openUri(URLS.DOWNLOAD_MACOS) }, EKIcon.DownloadApple, "macOs")
                    EkButton(
                        { uriHandler.openUri(URLS.LINK_WEB_LITE) },
                        EKIcon.Home,
                        text = LocalContent.current.home.liteVersion
                    )
                }

            }
        }


    }

}
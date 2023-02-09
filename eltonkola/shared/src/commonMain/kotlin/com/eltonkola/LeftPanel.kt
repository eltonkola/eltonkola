package com.eltonkola

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import com.eltonkola.components.SideButton
import com.eltonkola.components.icons.EKIcon
import com.eltonkola.components.icons.ekicon.GithubMono
import com.eltonkola.components.icons.ekicon.LinkedinMono
import com.eltonkola.components.icons.ekicon.PlaystoreMono
import com.eltonkola.data.URLS
import com.eltonkola.model.UiState


@Composable
fun LeftPanel(modifier: Modifier, uiState: UiState, onUpdate: (UiState) -> Unit) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Bottom
    ) {

        val uriHandler = LocalUriHandler.current

        SideButton(
            modifier = Modifier.width(50.dp).height(32.dp),
            selected = false,
            onAction= {
                uriHandler.openUri(URLS.PROFILE_GITHUB)
            },
            isRight = false
        ) {
            Image(
                modifier = Modifier,
                imageVector = EKIcon.GithubMono,
                contentDescription = "Github"
            )
        }
        Spacer(modifier = Modifier.size(4.dp))
        SideButton(
            modifier = Modifier.width(50.dp).height(32.dp),
            selected = false,
            onAction= {
                uriHandler.openUri(URLS.PROFILE_LINKEDIN)
            },
            isRight = false
        ) {
            Image(
                modifier = Modifier,
                imageVector = EKIcon.LinkedinMono,
                contentDescription = "Linked In"
            )
        }
        Spacer(modifier = Modifier.size(4.dp))
        SideButton(
            modifier = Modifier.width(50.dp).height(32.dp),
            selected = false,
            onAction= {
                uriHandler.openUri(URLS.PROFILE_PLAYSTORE)
            },
            isRight = false
        ) {
            Image(
                modifier = Modifier,
                imageVector = EKIcon.PlaystoreMono,
                contentDescription = "Play store"
            )
        }

        Spacer(modifier = Modifier.size(16.dp))
    }
}


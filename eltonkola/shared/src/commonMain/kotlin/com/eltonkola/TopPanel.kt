package com.eltonkola

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.unit.dp
import com.eltonkola.components.MenuButton
import com.eltonkola.components.icons.EKIcon
import com.eltonkola.components.icons.ekicon.LogoLarge
import com.eltonkola.components.theme.EKTheme
import com.eltonkola.data.LocalContent
import com.eltonkola.model.Page
import com.eltonkola.model.UiState

@Composable
fun TopPanel(modifier: Modifier, uiState: UiState, onUpdate: (UiState) -> Unit) {

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            modifier = Modifier.padding(bottom = 4.dp)
                .shadow(
                    elevation = 10.dp,
                    shape = RectangleShape,
                    clip = false,
                    ambientColor = EKTheme.colors().onSecondary,
                    spotColor = EKTheme.colors().onPrimary,
                )
            ,
            imageVector = EKIcon.LogoLarge,
            contentDescription = "logo",
            tint = EKTheme.colors().primary
        )

        Spacer(modifier = Modifier.height(8.dp).weight(1f))
        MenuButton(
            text = LocalContent.current.topMenu.home.title,
            selected = uiState.page == Page.Home,
            onAction = { onUpdate(uiState.copy(page = Page.Home)) }
        )

        Spacer(modifier = Modifier.size(8.dp))
        MenuButton(
            text = LocalContent.current.topMenu.about.title,
            selected = uiState.page == Page.About,
            onAction = { onUpdate(uiState.copy(page = Page.About)) }
        )

        Spacer(modifier = Modifier.size(8.dp))
        MenuButton(
            text = LocalContent.current.topMenu.portfolio.title,
            selected = uiState.page == Page.Portfolio,
            onAction = { onUpdate(uiState.copy(page = Page.Portfolio)) }
        )

        Spacer(modifier = Modifier.size(8.dp))
        MenuButton(
            text = LocalContent.current.topMenu.resume.title,
            selected = uiState.page == Page.Resume,
            onAction = { onUpdate(uiState.copy(page = Page.Resume)) }
        )

        Spacer(modifier = Modifier.size(8.dp))
        MenuButton(
            text = LocalContent.current.topMenu.contact.title,
            selected = uiState.page == Page.Contact,
            onAction = { onUpdate(uiState.copy(page = Page.Contact)) }
        )


        Spacer(modifier = Modifier.size(8.dp))


    }
}

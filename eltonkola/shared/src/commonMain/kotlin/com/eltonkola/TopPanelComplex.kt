package com.eltonkola

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.primarySurface
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.eltonkola.components.MenuButton
import com.eltonkola.components.SideButton
import com.eltonkola.components.icons.EKIcon
import com.eltonkola.components.icons.ekicon.*
import com.eltonkola.components.theme.EKTheme
import com.eltonkola.data.LocalContent
import com.eltonkola.data.TopMenuItem
import com.eltonkola.model.Lang
import com.eltonkola.model.Page
import com.eltonkola.model.UiState

@Composable
fun TopPanelComplex(modifier: Modifier, uiState: UiState, onUpdate: (UiState) -> Unit) {

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            modifier = Modifier.padding(bottom = 4.dp),
            imageVector = EKIcon.LogoComplex,
            contentDescription = "logo",
            tint = EKTheme.colors().primary
        )

        Spacer(modifier = Modifier.height(8.dp).weight(1f))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {


            MenuItems(
                modifier = Modifier,
                uiState = uiState,
                onUpdate = onUpdate
            )
            LanguagesItems(
                modifier = Modifier,
                uiState = uiState,
                onUpdate = onUpdate
            )



        }


    }
}


@Composable
private fun LanguagesItems(modifier : Modifier, uiState: UiState, onUpdate: (UiState) -> Unit){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {

        LanguageButton(
            selected = uiState.language ==  Lang.English,
            onAction= { onUpdate(uiState.copy(language = Lang.English)) },
            icon =  EKIcon.FlagUs
        )
        Spacer(modifier = Modifier.size(2.dp))
        LanguageButton(
            selected = uiState.language ==  Lang.Italian,
            onAction= { onUpdate(uiState.copy(language = Lang.Italian)) },
            icon =  EKIcon.FlagIt
        )
        Spacer(modifier = Modifier.size(2.dp))
        LanguageButton(
            selected = uiState.language ==  Lang.Albanian,
            onAction= { onUpdate(uiState.copy(language = Lang.Albanian)) },
            icon =  EKIcon.FlagAl
        )
    }
}

@Composable
fun LanguageButton(selected: Boolean, onAction: () -> Unit, icon: ImageVector){
    val alpha = animateFloatAsState(
        targetValue = if (selected) {
            1f
        } else {
            0.4f
        },
        animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing),
    )
    Box(
        modifier = Modifier
            .drawBehind {
                val  strokeWidthPx =  1.dp.value
                val width = size.width
                val height = size.height - strokeWidthPx/2

                drawLine(
                    color = Color.White.copy(alpha=0.4f),
                    start = Offset(x = 0f, y = height),
                    end = Offset(x = width , y = height),
                    strokeWidth = strokeWidthPx
                )

                drawLine(
                    color = Color.White.copy(alpha=0.4f),
                    start = Offset(x = 0f, y = 0f),
                    end = Offset(x = width , y = 0f),
                    strokeWidth = strokeWidthPx
                )


                drawLine(
                    color = Color.White.copy(alpha=0.4f),
                    start = Offset(x = width, y = 0f),
                    end = Offset(x = width , y = height),
                    strokeWidth = strokeWidthPx
                )
            }
            .size(36.dp, 24.dp)
            .background(Color.White.copy(alpha = 0.1f))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(color = MaterialTheme.colors.primarySurface),
                enabled = !selected
            ) {
                onAction()
            }
            .alpha(alpha.value)
        ,
        contentAlignment = Alignment.Center
    ){
        Image(
            modifier = Modifier.width(26.dp).height(17.dp),
            imageVector = icon,
            contentDescription = icon.name,
        )
    }
}


@Composable
private fun MenuItems(modifier : Modifier, uiState: UiState, onUpdate: (UiState) -> Unit){
    Row(
        modifier = modifier
            .clip(shape = RoundedCornerShape(8.dp))
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xffFBFBFB).copy(alpha = 0.6f),
                        EKTheme.colors().secondary.copy(alpha = 0.6f)
                    ),
                    tileMode = TileMode.Decal
                )
            )
    ) {

        BigMenuButton(
            item = LocalContent.current.topMenu.home,
            selected = uiState.page == Page.Home,
            onAction = { onUpdate(uiState.copy(page = Page.Home)) }
        )

        BigMenuSeparator()
        BigMenuButton(
            item = LocalContent.current.topMenu.about,
            selected = uiState.page == Page.About,
            onAction = { onUpdate(uiState.copy(page = Page.About)) }
        )

        BigMenuSeparator()
        BigMenuButton(
            item = LocalContent.current.topMenu.portfolio,
            selected = uiState.page == Page.Portfolio,
            onAction = { onUpdate(uiState.copy(page = Page.Portfolio)) }
        )

        BigMenuSeparator()
        BigMenuButton(
            item = LocalContent.current.topMenu.resume,
            selected = uiState.page == Page.Resume,
            onAction = { onUpdate(uiState.copy(page = Page.Resume)) }
        )

        BigMenuSeparator()
        BigMenuButton(
            item = LocalContent.current.topMenu.contact,
            selected = uiState.page == Page.Contact,
            onAction = { onUpdate(uiState.copy(page = Page.Contact)) }
        )

    }
}


@Composable
fun BigMenuButton(item: TopMenuItem, onAction: () -> Unit, selected: Boolean){

    val modifier = if(selected){
        Modifier
            .fillMaxHeight()
            .background(
                Brush.verticalGradient(
                    listOf(
//                        Color.White.copy(alpha = 0.8f),
//                        Color(0xffBFBFBF).copy(alpha = 0.8f),
                        Color.White,
                        Color.White.copy(alpha = 0.4f),
                    ),
                    tileMode = TileMode.Decal
                )
            )
            .clickable { onAction() }
            .padding(8.dp)
    }else{
        Modifier.fillMaxHeight().clickable { onAction() } .padding(8.dp)
    }

    val textColor = animateColorAsState(
        targetValue = if (selected) {
            EKTheme.colors().primary
        } else {
            Color.Black
        },
        animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing),
    )

    Column(
        modifier = modifier.widthIn(120.dp, 180.dp).fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            style = EKTheme.typography().body,
            text = item.title.uppercase(),
            color = textColor.value,
            fontWeight = FontWeight.ExtraBold,
        )
        Text(
            style = EKTheme.typography().bodySmaller,
            text = item.subTitle.uppercase(),
            color = textColor.value,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun BigMenuSeparator(){
    Row(
        modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxHeight().width(1.dp)
                .background(
                    Brush.verticalGradient(
                        listOf(
                            Color.Gray.copy(alpha = 0.1f),
                            Color.Gray.copy(alpha = 0.4f),
                            Color.Gray.copy(alpha = 0.6f),
                            Color.Gray.copy(alpha = 0.6f),
                            Color.Gray.copy(alpha = 0.4f),
                            Color.Gray.copy(alpha = 0.1f),
                        ),
                        tileMode = TileMode.Decal
                    )
                )
        )
        Box(
            modifier = Modifier.fillMaxHeight().width(1.dp).background(Color.White.copy(alpha = 0.4f))
        )
    }
}
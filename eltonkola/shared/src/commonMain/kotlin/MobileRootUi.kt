import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.eltonkola.*
import com.eltonkola.components.RoundButton
import com.eltonkola.components.blurBackground
import com.eltonkola.components.icons.EKIcon
import com.eltonkola.components.icons.ekicon.*
import com.eltonkola.components.theme.EKTheme
import com.eltonkola.components.theme.PRIMARY1
import com.eltonkola.components.theme.RoundColorButton
import com.eltonkola.data.*
import com.eltonkola.model.*
import com.eltonkola.pages.*
import com.eltonkola.wallpapers.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import kotlinx.coroutines.launch
import kotlin.math.absoluteValue


@Composable
internal fun MobileRootUi(uiState: UiState, onUpdate: (UiState) -> Unit) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        var showOptions by remember { mutableStateOf(false) }
        val scope = rememberCoroutineScope()

        blurBackground()

        Scaffold(
            backgroundColor = Color.Transparent,
            drawerBackgroundColor = EKTheme.colors().onPrimary.copy(alpha = 0.5f),
            drawerScrimColor = DrawerDefaults.scrimColor,
            topBar = {
                topBar {
                    scope.launch {
                        showOptions = !showOptions
                    }
                }
            },
            bottomBar = {
                bottomBar(uiState, onUpdate)
            },
        ) { innerPadding ->

            Box(
                modifier = Modifier.padding(innerPadding)
            ) {

                mainContent(
                    modifier = Modifier.fillMaxSize(),
                    uiState = uiState,
                    onUpdate = onUpdate
                )

                AnimatedVisibility(
                    visible = showOptions
                ) {
                    optionsDialog(uiState, {
                        scope.launch {
                            showOptions = false
                        }
                    }, onUpdate)
                }

            }

        }

    }

}

@OptIn(ExperimentalPagerApi::class)
@Composable
private fun mainContent(modifier: Modifier, uiState: UiState, onUpdate: (UiState) -> Unit) {

    val state = rememberPagerState()
    HorizontalPager(
        modifier = modifier,
        state = state,
        count = 5,
        userScrollEnabled = false
    ) { page ->
        Box(
            Modifier
                .graphicsLayer {
                    // Calculate the absolute offset for the current page from the
                    // scroll position. We use the absolute value which allows us to mirror
                    // any effects for both directions
                    val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue

                    // We animate the scaleX + scaleY, between 85% and 100%
                    lerp(
                        start = 0.85f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    ).also { scale ->
                        scaleX = scale
                        scaleY = scale
                    }

                    // We animate the alpha, between 50% and 100%
                    alpha = lerp(
                        start = 0.5f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    )
                }
        ) {


            when (page) {
                0 -> HomeMobile()
                1 -> ResumeMobile()
                2 -> PortfolioMobile()
                3 -> AboutMobile()
                4 -> ContactMobile()
            }
        }
    }
    val scope = rememberCoroutineScope()

    LaunchedEffect(uiState.page) {
        scope.launch {
            when (uiState.page) {
                Page.Home -> state.animateScrollToPage(0)
                Page.Resume -> state.animateScrollToPage(1)
                Page.Portfolio -> state.animateScrollToPage(2)
                Page.About -> state.animateScrollToPage(3)
                Page.Contact -> state.animateScrollToPage(4)
            }
        }
    }

}

@Composable
private fun topBar(onClick: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxWidth().padding(top = 38.dp),
        contentAlignment = Alignment.Center
    ) {

        Icon(
            modifier = Modifier.clickable { onClick() }.padding(bottom = 4.dp),
            imageVector = EKIcon.LogoComplex,
            contentDescription = "logo",
            tint = EKTheme.colors().primary
        )
    }
}

@Composable
private fun optionsDialog(uiState: UiState, close: () -> Unit, onUpdate: (UiState) -> Unit) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(40.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(
                width = 1.dp,
                color = EKTheme.colors().onSecondary.copy(alpha = 0.95f),
                shape = RoundedCornerShape(8.dp)
            )
            .background(EKTheme.colors().onPrimary.copy(alpha = 0.96f))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = LocalContent.current.settings.title,
            style = EKTheme.typography().titleLarge,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.size(20.dp))
        Text(
            text = LocalContent.current.settings.language,
            style = EKTheme.typography().body,
            textAlign = TextAlign.Center
        )

        Row {
            LanguageButton(
                selected = uiState.language == Lang.English,
                onAction = { onUpdate(uiState.copy(language = Lang.English)) },
                icon = EKIcon.FlagUs
            )
            Spacer(modifier = Modifier.size(4.dp))
            LanguageButton(
                selected = uiState.language == Lang.Italian,
                onAction = { onUpdate(uiState.copy(language = Lang.Italian)) },
                icon = EKIcon.FlagIt
            )
            Spacer(modifier = Modifier.size(4.dp))
            LanguageButton(
                selected = uiState.language == Lang.Albanian,
                onAction = { onUpdate(uiState.copy(language = Lang.Albanian)) },
                icon = EKIcon.FlagAl
            )
        }
        Spacer(modifier = Modifier.size(20.dp))

        Text(
            text = LocalContent.current.settings.color,
            style = EKTheme.typography().body,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.size(6.dp))
        Row {
            Spacer(modifier = Modifier.size(18.dp))
            RoundColorButton(
                uiState = uiState,
                onUpdate = onUpdate,
                color = ColorScheme.Red,
                colorValue = Color.Red
            )
            Spacer(modifier = Modifier.size(4.dp))
            RoundColorButton(
                uiState = uiState,
                onUpdate = onUpdate,
                color = ColorScheme.Yellow,
                colorValue = Color.Yellow
            )
            Spacer(modifier = Modifier.size(4.dp))
            RoundColorButton(
                uiState = uiState,
                onUpdate = onUpdate,
                color = ColorScheme.Blue,
                colorValue = Color.Blue
            )
            Spacer(modifier = Modifier.size(4.dp))
            RoundColorButton(
                uiState = uiState,
                onUpdate = onUpdate,
                color = ColorScheme.Green,
                colorValue = Color.Green
            )
            Spacer(modifier = Modifier.size(4.dp))
            RoundColorButton(
                uiState = uiState,
                onUpdate = onUpdate,
                color = ColorScheme.Default,
                colorValue = PRIMARY1
            )
        }
        Spacer(modifier = Modifier.size(20.dp))

        Text(
            text = LocalContent.current.settings.theme,
            style = EKTheme.typography().body,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.size(6.dp))
        RoundButton(
            modifier = Modifier,
            selected = false,
            onAction = { onUpdate(uiState.copy(darkMode = !uiState.darkMode)) },
        ) {
            Image(
                modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 2.dp).width(28.dp)
                    .height(28.dp),
                imageVector = if (uiState.darkMode) EKIcon.Sun else EKIcon.Moon,
                contentDescription = "Light/Night mode"
            )
        }
        Spacer(modifier = Modifier.size(20.dp))
        Text(
            text = LocalContent.current.settings.background,
            style = EKTheme.typography().body,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.size(6.dp))
        Row {
            RoundButton(
                modifier = Modifier,
                selected = false,
                onAction = { onUpdate(uiState.copy(wallpaper = uiState.wallpaper.prev())) },
            ) {
                Image(
                    modifier = Modifier.padding(6.dp).width(34.dp).height(34.dp),
                    imageVector = EKIcon.ArrowLeft,
                    contentDescription = "Previous wallpaper"
                )
            }
            Spacer(modifier = Modifier.size(4.dp))
            RoundButton(
                modifier = Modifier,
                selected = false,
                onAction = { onUpdate(uiState.copy(wallpaper = uiState.wallpaper.next())) },
            ) {
                Image(
                    modifier = Modifier.padding(6.dp).width(34.dp).height(34.dp),
                    imageVector = EKIcon.ArrowRight,
                    contentDescription = "Next wallpaper"
                )
            }
        }
        Spacer(modifier = Modifier.size(20.dp))
        Text(
            text = LocalContent.current.settings.mode,
            style = EKTheme.typography().body,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.size(6.dp))
        RoundButton(
            modifier = Modifier,
            selected = false,
            onAction = { onUpdate(uiState.copy(mobileMode = !uiState.mobileMode)) },
        ) {
            Image(
                modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 2.dp)
                    .width(28.dp)
                    .height(28.dp),
                imageVector = if (uiState.mobileMode) EKIcon.DesktopMode else EKIcon.MobileMode,
                contentDescription = "Desktop/Mobile mode"
            )
        }

        Spacer(modifier = Modifier.size(20.dp))
        Button(onClick = close) {
            Text(
                text = LocalContent.current.settings.close,
                style = EKTheme.typography().bodyButton
            )
        }
    }
}

@Composable
private fun bottomBar(uiState: UiState, onUpdate: (UiState) -> Unit) {
    BottomNavigation(
        modifier = Modifier.fillMaxWidth().padding(bottom = 20.dp),

        backgroundColor = EKTheme.colors().primary.copy(alpha = 0.8f),
        contentColor = EKTheme.colors().onPrimary,
        ) {

        BottomNavigationItem(
            icon = { Icon(imageVector = LocalContent.current.topMenu.home.icon, contentDescription = "") },
            label = { Text(LocalContent.current.topMenu.home.title) },
            selected = uiState.page == Page.Home,
            onClick = { onUpdate(uiState.copy(page = Page.Home)) }
        )

        BottomNavigationItem(
            icon = { Icon(imageVector = LocalContent.current.topMenu.about.icon, contentDescription = "") },
            label = { Text(LocalContent.current.topMenu.about.title) },
            selected = uiState.page == Page.About,
            onClick = { onUpdate(uiState.copy(page = Page.About)) }
        )

        BottomNavigationItem(
            icon = { Icon(imageVector = LocalContent.current.topMenu.portfolio.icon, contentDescription = "") },
            label = { Text(LocalContent.current.topMenu.portfolio.title) },
            selected = uiState.page == Page.Portfolio,
            onClick = { onUpdate(uiState.copy(page = Page.Portfolio)) }
        )


        BottomNavigationItem(
            icon = { Icon(imageVector = LocalContent.current.topMenu.resume.icon, contentDescription = "") },
            label = { Text(LocalContent.current.topMenu.resume.title) },
            selected = uiState.page == Page.Resume,
            onClick = { onUpdate(uiState.copy(page = Page.Resume)) }
        )

        BottomNavigationItem(
            icon = { Icon(imageVector = LocalContent.current.topMenu.contact.icon, contentDescription = "") },
            label = { Text(LocalContent.current.topMenu.contact.title) },
            selected = uiState.page == Page.Contact,
            onClick = { onUpdate(uiState.copy(page = Page.Contact)) }
        )


    }
}

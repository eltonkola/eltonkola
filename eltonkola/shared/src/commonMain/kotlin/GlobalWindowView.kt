
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.eltonkola.components.theme.EKTheme
import com.eltonkola.data.LocalContent
import com.eltonkola.data.albanianContent
import com.eltonkola.data.englishContent
import com.eltonkola.data.italianContent
import com.eltonkola.model.Lang
import com.eltonkola.model.UiState
import com.eltonkola.model.Wallpaper
import com.eltonkola.wallpapers.WallPaper1
import com.eltonkola.wallpapers.WallPaper2
import com.eltonkola.wallpapers.WallPaper3
import com.eltonkola.wallpapers.WallPaper4
import com.eltonkola.wallpapers.WallPaper5

const val TINY_WIDTH = 480
const val TINY_HEIGHT = 900

@Composable
internal fun GlobalWindowView(mobileMode: Boolean) {

    var uiState by remember { mutableStateOf(UiState(mobileMode = mobileMode)) }

    EKTheme(
        uiState = uiState
    ) {
        Surface(modifier = Modifier.fillMaxSize()) {

            val languageContent = when (uiState.language) {
                Lang.English -> englishContent
                Lang.Italian -> italianContent
                Lang.Albanian -> albanianContent
            }

            CompositionLocalProvider(LocalContent provides languageContent) {

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {

                    when (uiState.wallpaper) {
                        Wallpaper.Wallpaper1 -> WallPaper1()
                        Wallpaper.Wallpaper2 -> WallPaper2()
                        Wallpaper.Wallpaper3 -> WallPaper3()
                        Wallpaper.Wallpaper4 -> WallPaper4()
                        Wallpaper.Wallpaper5 -> WallPaper5()
                    }

                    if (uiState.darkMode) {
                        Box(modifier = Modifier.fillMaxSize().background(Color.Black.copy(0.70f)))
                    }

                    AnimatedVisibility(
                        visible = uiState.mobileMode
                    ) {
                        if(mobileMode){
                            MobileRootUi(uiState) {
                                uiState = it
                            }
                        }else{
                            BoxWithConstraints {
                                val boxWithConstraintsScope = this
                                val bodyWidth =
                                    if (boxWithConstraintsScope.maxWidth > TINY_WIDTH.dp) TINY_WIDTH.dp else boxWithConstraintsScope.maxWidth
                                val bodyHeight =
                                    if (boxWithConstraintsScope.maxHeight > TINY_HEIGHT.dp) TINY_HEIGHT.dp else boxWithConstraintsScope.maxHeight

                                Column(
                                    modifier = Modifier.width(bodyWidth).height(bodyHeight),
                                ) {
                                    MobileRootUi(uiState) {
                                        uiState = it
                                    }
                                }
                            }
                        }
                    }

                    AnimatedVisibility(
                        visible = !uiState.mobileMode
                    ) {
                        DesktopRootUi(uiState) {
                            uiState = it
                        }
                    }
                }

            }
        }
    }
}


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eltonkola.*
import com.eltonkola.components.theme.EKTheme
import com.eltonkola.data.*
import com.eltonkola.model.Lang
import com.eltonkola.model.UiState
import com.eltonkola.model.Wallpaper
import com.eltonkola.wallpapers.*


const val APP_WIDTH = 1222
const val APP_HEIGHT = 750

@Composable
internal fun DesktopRootUi(uiState: UiState, onUpdate: (UiState) -> Unit) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        if (isDebugBuild) {
            Text(
                modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp),
                text = "<<<<< Ui State >>>> \n" +
                        "darkMode: ${uiState.darkMode} \n" +
                        "wallpaper: ${uiState.wallpaper::class.simpleName} \n" +
                        "language: ${uiState.language::class.simpleName} \n" +
                        "color: ${uiState.color::class.simpleName} \n" +
                        "page: ${uiState.page::class.simpleName} \n" +
                        "",
                color = Color.White,
                fontSize = 16.sp
            )
        }

        BoxWithConstraints {
            val boxWithConstraintsScope = this
            val bodyWidth =
                if (boxWithConstraintsScope.maxWidth > APP_WIDTH.dp) APP_WIDTH.dp else boxWithConstraintsScope.maxWidth
            val bodyHeight =
                if (boxWithConstraintsScope.maxHeight > APP_HEIGHT.dp) APP_HEIGHT.dp else boxWithConstraintsScope.maxHeight


            Column(
                modifier = Modifier.width(bodyWidth).height(bodyHeight),
            ) {

                TopPanelComplex(
                    modifier = Modifier.fillMaxWidth()
                        .padding(start = 40.dp, end = 4.dp, bottom = 12.dp)
                        .height(86.dp),
                    uiState = uiState,
                    onUpdate = onUpdate
                )

                Spacer(modifier = Modifier.size(6.dp))

                Row(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight()
                ) {

                    LeftPanel(
                        modifier = Modifier.width(40.dp).fillMaxHeight(),
                        uiState = uiState,
                        onUpdate = onUpdate
                    )

                    MainContentPanel(
                        modifier = Modifier.fillMaxWidth().weight(1f),
                        uiState = uiState,
                        onUpdate = onUpdate
                    )

                    RightPanel(
                        modifier = Modifier.width(40.dp).fillMaxHeight(),
                        uiState = uiState,
                        onUpdate = onUpdate
                    )

                }

                Spacer(modifier = Modifier.size(6.dp))
                BottomPanel(
                    modifier = Modifier.fillMaxWidth(),
                    uiState = uiState,
                    onUpdate = onUpdate
                )

            }

        }
    }

}


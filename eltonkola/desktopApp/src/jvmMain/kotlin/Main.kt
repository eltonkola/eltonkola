
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication

fun main() =
    singleWindowApplication(
        title = "Elton Kola - Android, Web and coding dreams",
        state = WindowState(size = DpSize(1600.dp, 880.dp))
    ) {
        MainView()
    }

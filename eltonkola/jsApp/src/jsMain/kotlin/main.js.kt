
import com.eltonkola.data.EK_TITLE
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        BrowserViewportWindow(EK_TITLE) {
            MainView()
        }
    }
}


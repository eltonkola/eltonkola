import androidx.compose.ui.window.Window
import com.eltonkola.data.EK_TITLE
import platform.AppKit.NSApp
import platform.AppKit.NSApplication

fun main() {
    NSApplication.sharedApplication()
    Window(EK_TITLE) {
        GlobalWindowView( mobileMode = false)
    }
    NSApp?.run()
}

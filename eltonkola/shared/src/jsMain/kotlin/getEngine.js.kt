import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap
import androidx.compose.ui.platform.LocalUriHandler
import io.ktor.client.engine.*
import io.ktor.client.engine.js.*
import io.ktor.util.*
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.jetbrains.skiko.currentNanoTime

actual fun getEngine(): HttpClientEngine {
    return Js.create()
}

actual fun ioDispatcher(): CoroutineDispatcher {

    return Dispatchers.Unconfined

}

actual fun getImageFromArray(byteArray: ByteArray): ImageBitmap {
    return org.jetbrains.skia.Image.makeFromEncoded(byteArray).toComposeImageBitmap()
}

actual fun getCurrentNanoTime(): Long {
    return currentNanoTime()
}

actual fun supportsAdvancedAnimations(): Boolean {
    return false
}


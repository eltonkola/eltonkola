import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap
import io.ktor.client.engine.*
import io.ktor.client.engine.cio.*
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import java.awt.Desktop
import java.net.URI
import org.jetbrains.skiko.currentNanoTime

actual fun getEngine(): HttpClientEngine {
    return CIO.create()
}

actual fun ioDispatcher(): CoroutineDispatcher {
    return Dispatchers.IO
}

actual fun getImageFromArray(byteArray: ByteArray): ImageBitmap {
    return org.jetbrains.skia.Image.makeFromEncoded(byteArray).toComposeImageBitmap()
}

actual fun getCurrentNanoTime(): Long {
    return currentNanoTime()
}

actual fun supportsAdvancedAnimations(): Boolean {
    return true
}

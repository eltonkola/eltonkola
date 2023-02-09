import android.graphics.BitmapFactory
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import io.ktor.client.engine.*
import io.ktor.client.engine.cio.*
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual fun getEngine(): HttpClientEngine {
    return CIO.create()
}

actual fun ioDispatcher(): CoroutineDispatcher {
    return Dispatchers.IO
}

actual fun getImageFromArray(byteArray: ByteArray): ImageBitmap {
    return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size).asImageBitmap()
}


actual fun getCurrentNanoTime(): Long {
    return System.nanoTime()
}

actual fun supportsAdvancedAnimations(): Boolean {
    return true
}


import androidx.compose.ui.graphics.ImageBitmap
import io.ktor.client.engine.*
import kotlinx.coroutines.CoroutineDispatcher

expect fun getEngine(): HttpClientEngine

expect fun ioDispatcher(): CoroutineDispatcher

expect fun getImageFromArray(byteArray: ByteArray): ImageBitmap

expect fun getCurrentNanoTime(): Long

expect fun supportsAdvancedAnimations(): Boolean


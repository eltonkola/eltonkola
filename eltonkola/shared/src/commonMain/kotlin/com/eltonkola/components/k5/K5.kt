
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalViewConfiguration
import androidx.compose.ui.unit.IntSize
import com.eltonkola.components.k5.ui.SketchView


@Composable
fun K5(
    modifier: Modifier = Modifier,
    stopLoop: Boolean = false,
    content: @Composable (Size, IntSize) -> Unit,
){
    BoxWithConstraints(
        modifier = modifier
    ) {

        val density = LocalDensity.current
        /**
         * Use this property to get the actual [k5] Playground size in Floats. Subtracting the 56f - which is the toolbar height of the window.
         * When the size of the window is set with `size` param in [k5] builder, it's applied to window and when
         * the canvas is rendered in the window with [Modifier.fillMaxSize] it takes whole window except the toolbar.
         *
         * TODO: Fix the dimensions for a given k5 playground considering density
         */
        val dimensFloat = Size(this.maxWidth.value * density.density, this.maxHeight.value * density.density) // - 56f

        /**
         * Use this property to get the actual [k5] Playground size in Ints
         */
        val dimensInt = IntSize(dimensFloat.width.toInt(), dimensFloat.height.toInt()) // - 56
        content(dimensFloat, dimensInt)
    }
}


    /**
     * Use this property to get the actual [k5] Playground size in Floats. Subtracting the 56f - which is the toolbar height of the window.
     * When the size of the window is set with `size` param in [k5] builder, it's applied to window and when
     * the canvas is rendered in the window with [Modifier.fillMaxSize] it takes whole window except the toolbar.
     *
     * TODO: Fix the dimensions for a given k5 playground considering density
     */
//    val dimensFloat = Size(size.width, size.height - 56f)

    /**
     * Use this property to get the actual [k5] Playground size in Ints
     */
//    val dimensInt = IntSize(size.width.toInt(), size.height.toInt() - 56)

    /**
     * Shows the canvas window and renders it for each frame repetitively.
     * Internally, this starts the Jetpack Compose Window and renders the [sketch] requested by user into the Jetpack Compose
     * [Canvas] Composable. The size of the [Canvas] will be same as the [size] passed in [k5] method by default.
     * One can change the canvas size and window size with the help of modifiers.
     * In order to keep the animation running (rendering canvas continuously), it requests to run the frame of animation in nanos.
     * All the [modifier] will be applied to the [Canvas].
     *
     * @param modifier Jetpack compose [Modifier]
     * @param sketch drawScope - Compose canvas drawscope
     */
    @Composable
    fun show(
        modifier: Modifier = Modifier.fillMaxSize(),
        sketch: (drawScope: DrawScope) -> Unit
    ) {
        render(modifier, sketch)
    }

    /**
     * Shows canvas window as well as controls view side by side.
     * Internally, this starts the Jetpack Compose Window and renders the [sketch] requested by user into the Jetpack Compose
     * [Canvas] Composable. The size of the [Canvas] will be same as the [size] passed in [k5] method by default.
     * One can change the canvas size and window size with the help of modifiers.
     * In order to keep the animation running (rendering canvas continuously), it requests to run the frame of animation in nanos.
     *
     * Also, you can add your controls like sliders, checkboxes, radio-buttons, pickers etc as a control to change/provide
     * inputs to your sketch. This is just simple [Composable] function, so you can add all the [Composable] elements you want.
     * The controls are shown on the right side in the window. You can use Compose States to store/change your input and use it in your sketch.
     */
    @Composable
    fun showWithControls(
        modifier: Modifier = Modifier.background(Color.Transparent),
        controls: (@Composable () -> Unit)? = null,
        sketch: (drawScope: DrawScope) -> Unit
    ) {
        render(modifier, sketch, controls)
    }

    /**
     * Starts the Jetpack Compose Window and renders the [sketch] requested by user into the Jetpack Compose
     * [Canvas] Composable.
     *
     * @param modifier - Jetpack compose [Modifier]. Will be applied to the [Canvas]
     * @param sketch - The content to be drawn on to [Canvas]
     */
    @Composable
    private fun render(
        modifier: Modifier,
        sketch: (drawScope: DrawScope) -> Unit,
        controls: (@Composable () -> Unit)? = null,
        stopLoop: Boolean = false
    ) {
        val areControlsActive = controls != null

        val calculatedWidth = if (areControlsActive) 0.7f else 1f
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .weight(calculatedWidth)
                        .fillMaxHeight()
                        .clipToBounds()
                ) {
                    SketchView(modifier, stopLoop, sketch)
                }
                Box(modifier = Modifier.fillMaxHeight().background(Color.LightGray)) {
                    Column {
                        controls?.let { it() }
                    }
                }
            }
        }
    }

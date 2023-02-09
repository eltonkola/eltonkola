import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.eltonkola.wallpapers.animations.albanianEagle.AlbanianEagle

@Composable
fun MainView() = GlobalWindowView(mobileMode = false)



@Preview
@Composable
fun AppPreview() {
    Box(
        modifier = Modifier.background(Color.Red).padding(40.dp)
    ) {
//        com.eltonkola.components.TransparentCard{
//            Text("Hi There")
//        }

//        TextPreviewsContent()
        AlbanianEagle(
            modifier = Modifier.size(800.dp, 800.dp),
            speed = 1200
        )



    }
}



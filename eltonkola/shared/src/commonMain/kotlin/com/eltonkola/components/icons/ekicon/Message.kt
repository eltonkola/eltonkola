package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.Message: ImageVector
    get() {
        if (_message != null) {
            return _message!!
        }
        _message = Builder(name = "Message", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 14.5f)
                horizontalLineTo(15.5f)
                moveTo(8.5f, 9.5f)
                horizontalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.1706f, 20.8905f)
                curveTo(18.3536f, 20.6125f, 21.6856f, 17.2332f, 21.9598f, 12.9909f)
                curveTo(22.0134f, 12.1607f, 22.0134f, 11.3009f, 21.9598f, 10.4707f)
                curveTo(21.6856f, 6.2284f, 18.3536f, 2.8491f, 14.1706f, 2.5711f)
                curveTo(12.7435f, 2.4762f, 11.2536f, 2.4764f, 9.8294f, 2.5711f)
                curveTo(5.6464f, 2.8491f, 2.3144f, 6.2284f, 2.0402f, 10.4707f)
                curveTo(1.9866f, 11.3009f, 1.9866f, 12.1607f, 2.0402f, 12.9909f)
                curveTo(2.1401f, 14.536f, 2.8234f, 15.9666f, 3.6279f, 17.1746f)
                curveTo(4.095f, 18.0203f, 3.7867f, 19.0758f, 3.3002f, 19.9978f)
                curveTo(2.9494f, 20.6626f, 2.774f, 20.995f, 2.9148f, 21.2351f)
                curveTo(3.0557f, 21.4752f, 3.3703f, 21.4829f, 3.9994f, 21.4982f)
                curveTo(5.2437f, 21.5285f, 6.0827f, 21.1757f, 6.7487f, 20.6846f)
                curveTo(7.1264f, 20.4061f, 7.3153f, 20.2668f, 7.4454f, 20.2508f)
                curveTo(7.5756f, 20.2348f, 7.8318f, 20.3403f, 8.344f, 20.5513f)
                curveTo(8.8044f, 20.7409f, 9.339f, 20.8579f, 9.8294f, 20.8905f)
                curveTo(11.2536f, 20.9852f, 12.7435f, 20.9854f, 14.1706f, 20.8905f)
                close()
            }
        }
        .build()
        return _message!!
    }

private var _message: ImageVector? = null

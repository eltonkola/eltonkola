package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 14.7614f, 14.7614f, 17.0f, 12.0f, 17.0f)
                curveTo(9.2386f, 17.0f, 7.0f, 14.7614f, 7.0f, 12.0f)
                curveTo(7.0f, 9.2386f, 9.2386f, 7.0f, 12.0f, 7.0f)
                curveTo(14.7614f, 7.0f, 17.0f, 9.2386f, 17.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9955f, 3.0f)
                horizontalLineTo(12.0045f)
                moveTo(11.9961f, 21.0f)
                horizontalLineTo(12.0051f)
                moveTo(18.3588f, 5.636f)
                horizontalLineTo(18.3678f)
                moveTo(5.6341f, 18.364f)
                horizontalLineTo(5.6431f)
                moveTo(5.6341f, 5.6365f)
                horizontalLineTo(5.6431f)
                moveTo(18.3582f, 18.3645f)
                horizontalLineTo(18.3672f)
                moveTo(20.991f, 12.0006f)
                horizontalLineTo(21.0f)
                moveTo(3.0f, 12.0006f)
                horizontalLineTo(3.009f)
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null

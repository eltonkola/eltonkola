package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9995f, 22.0f)
                lineTo(8.7488f, 18.4911f)
                curveTo(8.6141f, 16.6046f, 10.1082f, 15.0f, 11.9995f, 15.0f)
                curveTo(13.8908f, 15.0f, 15.3849f, 16.6046f, 15.2501f, 18.4911f)
                lineTo(14.9995f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.3516f, 13.2135f)
                curveTo(1.9985f, 10.9162f, 1.822f, 9.7676f, 2.2563f, 8.7494f)
                curveTo(2.6906f, 7.7311f, 3.6542f, 7.0344f, 5.5813f, 5.6411f)
                lineTo(7.0212f, 4.6f)
                curveTo(9.4185f, 2.8667f, 10.6171f, 2.0f, 12.0002f, 2.0f)
                curveTo(13.3832f, 2.0f, 14.5819f, 2.8667f, 16.9792f, 4.6f)
                lineTo(18.419f, 5.6411f)
                curveTo(20.3461f, 7.0344f, 21.3097f, 7.7311f, 21.744f, 8.7494f)
                curveTo(22.1783f, 9.7676f, 22.0018f, 10.9162f, 21.6488f, 13.2135f)
                lineTo(21.3477f, 15.1724f)
                curveTo(20.8473f, 18.4289f, 20.5971f, 20.0572f, 19.4292f, 21.0286f)
                curveTo(18.2612f, 22.0f, 16.5538f, 22.0f, 13.139f, 22.0f)
                horizontalLineTo(10.8613f)
                curveTo(7.4465f, 22.0f, 5.7391f, 22.0f, 4.5712f, 21.0286f)
                curveTo(3.4032f, 20.0572f, 3.153f, 18.4289f, 2.6526f, 15.1724f)
                lineTo(2.3516f, 13.2135f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null

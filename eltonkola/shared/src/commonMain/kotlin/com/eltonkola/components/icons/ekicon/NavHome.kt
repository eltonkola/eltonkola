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

public val EKIcon.NavHome: ImageVector
    get() {
        if (_navHome != null) {
            return _navHome!!
        }
        _navHome = Builder(name = "NavHome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF222222)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 12.7596f)
                curveTo(5.0f, 11.4019f, 5.0f, 10.723f, 5.2745f, 10.1262f)
                curveTo(5.5489f, 9.5295f, 6.0644f, 9.0877f, 7.0953f, 8.2041f)
                lineTo(8.0953f, 7.3469f)
                curveTo(9.9586f, 5.7498f, 10.8902f, 4.9512f, 12.0f, 4.9512f)
                curveTo(13.1098f, 4.9512f, 14.0414f, 5.7498f, 15.9047f, 7.3469f)
                lineTo(16.9047f, 8.2041f)
                curveTo(17.9356f, 9.0877f, 18.4511f, 9.5295f, 18.7255f, 10.1262f)
                curveTo(19.0f, 10.723f, 19.0f, 11.4019f, 19.0f, 12.7596f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 18.8856f, 19.0f, 19.8284f, 18.4142f, 20.4142f)
                curveTo(17.8284f, 21.0f, 16.8856f, 21.0f, 15.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(7.1144f, 21.0f, 6.1716f, 21.0f, 5.5858f, 20.4142f)
                curveTo(5.0f, 19.8284f, 5.0f, 18.8856f, 5.0f, 17.0f)
                verticalLineTo(12.7596f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF222222)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 21.0f)
                verticalLineTo(16.0f)
                curveTo(14.5f, 15.4477f, 14.0523f, 15.0f, 13.5f, 15.0f)
                horizontalLineTo(10.5f)
                curveTo(9.9477f, 15.0f, 9.5f, 15.4477f, 9.5f, 16.0f)
                verticalLineTo(21.0f)
            }
        }
        .build()
        return _navHome!!
    }

private var _navHome: ImageVector? = null

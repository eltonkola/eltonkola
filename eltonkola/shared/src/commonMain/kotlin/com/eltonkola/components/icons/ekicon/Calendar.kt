package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                verticalLineTo(4.0f)
                moveTo(6.0f, 2.0f)
                verticalLineTo(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 12.2432f)
                curveTo(2.5f, 7.8859f, 2.5f, 5.7073f, 3.7521f, 4.3536f)
                curveTo(5.0042f, 3.0f, 7.0195f, 3.0f, 11.05f, 3.0f)
                horizontalLineTo(12.95f)
                curveTo(16.9805f, 3.0f, 18.9958f, 3.0f, 20.2479f, 4.3536f)
                curveTo(21.5f, 5.7073f, 21.5f, 7.8859f, 21.5f, 12.2432f)
                verticalLineTo(12.7568f)
                curveTo(21.5f, 17.1141f, 21.5f, 19.2927f, 20.2479f, 20.6464f)
                curveTo(18.9958f, 22.0f, 16.9805f, 22.0f, 12.95f, 22.0f)
                horizontalLineTo(11.05f)
                curveTo(7.0195f, 22.0f, 5.0042f, 22.0f, 3.7521f, 20.6464f)
                curveTo(2.5f, 19.2927f, 2.5f, 17.1141f, 2.5f, 12.7568f)
                verticalLineTo(12.2432f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 8.0f)
                horizontalLineTo(21.0f)
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null

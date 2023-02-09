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

public val EKIcon.Sent: ImageVector
    get() {
        if (_sent != null) {
            return _sent!!
        }
        _sent = Builder(name = "Sent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0477f, 3.0529f)
                curveTo(18.8697f, 0.7074f, 2.4865f, 6.4532f, 2.5f, 8.551f)
                curveTo(2.5154f, 10.9299f, 8.8981f, 11.6617f, 10.6672f, 12.1581f)
                curveTo(11.7311f, 12.4565f, 12.016f, 12.7625f, 12.2613f, 13.8781f)
                curveTo(13.3723f, 18.9305f, 13.9301f, 21.4435f, 15.2014f, 21.4996f)
                curveTo(17.2278f, 21.5892f, 23.1733f, 5.342f, 21.0477f, 3.0529f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 12.5f)
                lineTo(15.0f, 9.0f)
            }
        }
        .build()
        return _sent!!
    }

private var _sent: ImageVector? = null

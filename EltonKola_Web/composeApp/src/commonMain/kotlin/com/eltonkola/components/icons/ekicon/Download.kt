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

public val EKIcon.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.5f)
                lineTo(12.0f, 4.5f)
                moveTo(12.0f, 14.5f)
                curveTo(11.2998f, 14.5f, 9.9915f, 12.5057f, 9.5f, 12.0f)
                moveTo(12.0f, 14.5f)
                curveTo(12.7002f, 14.5f, 14.0085f, 12.5057f, 14.5f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 16.5f)
                curveTo(20.0f, 18.982f, 19.482f, 19.5f, 17.0f, 19.5f)
                horizontalLineTo(7.0f)
                curveTo(4.518f, 19.5f, 4.0f, 18.982f, 4.0f, 16.5f)
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null

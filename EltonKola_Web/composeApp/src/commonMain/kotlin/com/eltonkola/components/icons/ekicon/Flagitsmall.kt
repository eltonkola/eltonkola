package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.Flagitsmall: ImageVector
    get() {
        if (_flagitsmall != null) {
            return _flagitsmall!!
        }
        _flagitsmall = Builder(name = "Flagitsmall", defaultWidth = 26.0.dp, defaultHeight =
                18.0.dp, viewportWidth = 26.0f, viewportHeight = 18.0f).apply {
            path(fill = SolidColor(Color(0xFFFF4B55)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.5517f, 17.0345f)
                horizontalLineTo(17.3334f)
                verticalLineTo(0.0f)
                horizontalLineTo(25.5517f)
                curveTo(25.7993f, 0.0f, 26.0f, 0.2008f, 26.0f, 0.4483f)
                verticalLineTo(16.5863f)
                curveTo(26.0f, 16.8339f, 25.7993f, 17.0345f, 25.5517f, 17.0345f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF5F5F5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.3337f, 3.0E-4f)
                horizontalLineTo(8.6669f)
                verticalLineTo(17.0348f)
                horizontalLineTo(17.3337f)
                verticalLineTo(3.0E-4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF73AF00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6667f, 17.0345f)
                horizontalLineTo(0.4483f)
                curveTo(0.2007f, 17.0345f, 0.0f, 16.8338f, 0.0f, 16.5862f)
                verticalLineTo(0.4483f)
                curveTo(0.0f, 0.2007f, 0.2007f, 0.0f, 0.4483f, 0.0f)
                horizontalLineTo(8.6667f)
                verticalLineTo(17.0345f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.1f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0003f, 1.5175f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
                    strokeAlpha = 0.1f, strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin
                    = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.5003f, 2.0175f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-23.0f)
                close()
            }
        }
        .build()
        return _flagitsmall!!
    }

private var _flagitsmall: ImageVector? = null

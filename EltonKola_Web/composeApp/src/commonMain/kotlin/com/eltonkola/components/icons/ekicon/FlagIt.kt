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

public val EKIcon.FlagIt: ImageVector
    get() {
        if (_flagIt != null) {
            return _flagIt!!
        }
        _flagIt = Builder(name = "FlagIt", defaultWidth = 50.0.dp, defaultHeight = 34.0.dp,
                viewportWidth = 50.0f, viewportHeight = 34.0f).apply {
            path(fill = SolidColor(Color(0xFF73AF00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.666f, 33.3789f)
                horizontalLineTo(0.8614f)
                curveTo(0.3854f, 33.3789f, -7.0E-4f, 32.9929f, -7.0E-4f, 32.5168f)
                verticalLineTo(1.4823f)
                curveTo(-7.0E-4f, 1.0063f, 0.3854f, 0.6202f, 0.8614f, 0.6202f)
                horizontalLineTo(16.666f)
                verticalLineTo(33.3789f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF5F5F5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(33.3334f, 0.6207f)
                horizontalLineTo(16.6664f)
                verticalLineTo(33.3795f)
                horizontalLineTo(33.3334f)
                verticalLineTo(0.6207f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF4B55)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(49.1373f, 33.3789f)
                horizontalLineTo(33.3327f)
                verticalLineTo(0.6203f)
                horizontalLineTo(49.1373f)
                curveTo(49.6134f, 0.6203f, 49.9994f, 1.0064f, 49.9994f, 1.4825f)
                verticalLineTo(32.5169f)
                curveTo(49.9994f, 32.9931f, 49.6134f, 33.3789f, 49.1373f, 33.3789f)
                close()
            }
        }
        .build()
        return _flagIt!!
    }

private var _flagIt: ImageVector? = null

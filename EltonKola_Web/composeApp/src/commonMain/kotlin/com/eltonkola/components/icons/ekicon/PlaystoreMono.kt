package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.PlaystoreMono: ImageVector
    get() {
        if (_playstoreMono != null) {
            return _playstoreMono!!
        }
        _playstoreMono = Builder(name = "PlaystoreMono", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0181f, 13.298f)
                lineTo(18.0991f, 15.516f)
                lineTo(14.5841f, 12.023f)
                lineTo(18.1271f, 8.502f)
                lineTo(22.0181f, 10.704f)
                curveTo(22.2477f, 10.8339f, 22.4388f, 11.0223f, 22.5717f, 11.2502f)
                curveTo(22.7046f, 11.4781f, 22.7747f, 11.7372f, 22.7747f, 12.001f)
                curveTo(22.7747f, 12.2648f, 22.7046f, 12.5239f, 22.5717f, 12.7518f)
                curveTo(22.4388f, 12.9796f, 22.2477f, 13.1681f, 22.0181f, 13.298f)
                close()
                moveTo(1.3371f, 0.924f)
                curveTo(1.2629f, 1.1042f, 1.2248f, 1.2972f, 1.2251f, 1.492f)
                verticalLineTo(22.509f)
                curveTo(1.2251f, 22.726f, 1.2701f, 22.928f, 1.3491f, 23.109f)
                lineTo(12.5041f, 12.022f)
                lineTo(1.3371f, 0.924f)
                close()
                moveTo(13.5441f, 10.989f)
                lineTo(16.8021f, 7.751f)
                lineTo(3.4501f, 0.195f)
                curveTo(3.1639f, 0.0305f, 2.8306f, -0.0325f, 2.5041f, 0.016f)
                lineTo(13.5441f, 10.989f)
                verticalLineTo(10.989f)
                close()
                moveTo(13.5441f, 13.056f)
                lineTo(2.5441f, 23.989f)
                curveTo(2.8421f, 24.025f, 3.1561f, 23.973f, 3.4501f, 23.806f)
                lineTo(16.7741f, 16.266f)
                lineTo(13.5441f, 13.056f)
                verticalLineTo(13.056f)
                close()
            }
        }
        .build()
        return _playstoreMono!!
    }

private var _playstoreMono: ImageVector? = null

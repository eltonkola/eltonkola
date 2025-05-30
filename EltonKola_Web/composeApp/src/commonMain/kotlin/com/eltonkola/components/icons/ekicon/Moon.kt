package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.5f, 14.0784f)
                curveTo(20.3003f, 14.7189f, 18.9301f, 15.0821f, 17.4751f, 15.0821f)
                curveTo(12.7491f, 15.0821f, 8.9179f, 11.2509f, 8.9179f, 6.5248f)
                curveTo(8.9179f, 5.0699f, 9.281f, 3.6997f, 9.9216f, 2.5f)
                curveTo(5.6677f, 3.497f, 2.5f, 7.3151f, 2.5f, 11.8731f)
                curveTo(2.5f, 17.1899f, 6.8101f, 21.5f, 12.1269f, 21.5f)
                curveTo(16.6849f, 21.5f, 20.503f, 18.3324f, 21.5f, 14.0784f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null

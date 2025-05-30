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

public val EKIcon.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5776f, 15.4816f)
                curveTo(5.1628f, 16.324f, 1.4534f, 18.0441f, 3.7127f, 20.1966f)
                curveTo(4.8163f, 21.248f, 6.0455f, 22.0f, 7.5909f, 22.0f)
                horizontalLineTo(16.4091f)
                curveTo(17.9545f, 22.0f, 19.1837f, 21.248f, 20.2873f, 20.1966f)
                curveTo(22.5466f, 18.0441f, 18.8372f, 16.324f, 17.4224f, 15.4816f)
                curveTo(14.1048f, 13.5061f, 9.8952f, 13.5061f, 6.5776f, 15.4816f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF2A353D)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 6.5f)
                curveTo(16.5f, 8.9853f, 14.4853f, 11.0f, 12.0f, 11.0f)
                curveTo(9.5147f, 11.0f, 7.5f, 8.9853f, 7.5f, 6.5f)
                curveTo(7.5f, 4.0147f, 9.5147f, 2.0f, 12.0f, 2.0f)
                curveTo(14.4853f, 2.0f, 16.5f, 4.0147f, 16.5f, 6.5f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null

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

public val EKIcon.DesktopMode: ImageVector
    get() {
        if (_desktopMode != null) {
            return _desktopMode!!
        }
        _desktopMode = Builder(name = "DesktopMode", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF222222)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 4.5f)
                horizontalLineTo(17.0f)
                curveTo(17.9569f, 4.5f, 18.6244f, 4.5011f, 19.1279f, 4.5688f)
                curveTo(19.6171f, 4.6345f, 19.8762f, 4.7548f, 20.0607f, 4.9393f)
                curveTo(20.2452f, 5.1238f, 20.3655f, 5.3829f, 20.4312f, 5.8721f)
                curveTo(20.4989f, 6.3756f, 20.5f, 7.0431f, 20.5f, 8.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(8.0f)
                curveTo(3.5f, 7.0431f, 3.5011f, 6.3756f, 3.5688f, 5.8721f)
                curveTo(3.6345f, 5.3829f, 3.7548f, 5.1238f, 3.9393f, 4.9393f)
                curveTo(4.1238f, 4.7548f, 4.3829f, 4.6345f, 4.8721f, 4.5688f)
                curveTo(5.3756f, 4.5011f, 6.0431f, 4.5f, 7.0f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF222222)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.3333f, 16.5f)
                horizontalLineTo(3.6667f)
                curveTo(3.0223f, 16.5f, 2.5f, 17.0223f, 2.5f, 17.6667f)
                curveTo(2.5f, 18.6792f, 3.3208f, 19.5f, 4.3333f, 19.5f)
                horizontalLineTo(19.6667f)
                curveTo(20.6792f, 19.5f, 21.5f, 18.6792f, 21.5f, 17.6667f)
                curveTo(21.5f, 17.0223f, 20.9777f, 16.5f, 20.3333f, 16.5f)
                close()
            }
        }
        .build()
        return _desktopMode!!
    }

private var _desktopMode: ImageVector? = null

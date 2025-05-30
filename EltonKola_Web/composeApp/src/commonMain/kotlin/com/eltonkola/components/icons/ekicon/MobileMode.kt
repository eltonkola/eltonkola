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

public val EKIcon.MobileMode: ImageVector
    get() {
        if (_mobileMode != null) {
            return _mobileMode!!
        }
        _mobileMode = Builder(name = "MobileMode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF222222)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 3.0f)
                verticalLineTo(2.5f)
                horizontalLineTo(14.0f)
                horizontalLineTo(10.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(3.0f)
                curveTo(9.5f, 3.0091f, 9.5f, 3.0182f, 9.5f, 3.0272f)
                curveTo(9.5f, 3.2392f, 9.4999f, 3.4453f, 9.5228f, 3.6153f)
                curveTo(9.5485f, 3.8069f, 9.6113f, 4.0255f, 9.7929f, 4.2071f)
                curveTo(9.9745f, 4.3887f, 10.1931f, 4.4515f, 10.3847f, 4.4772f)
                curveTo(10.5547f, 4.5001f, 10.7608f, 4.5001f, 10.9728f, 4.5f)
                curveTo(10.9819f, 4.5f, 10.9909f, 4.5f, 11.0f, 4.5f)
                horizontalLineTo(13.0f)
                curveTo(13.0091f, 4.5f, 13.0181f, 4.5f, 13.0272f, 4.5f)
                curveTo(13.2392f, 4.5001f, 13.4453f, 4.5001f, 13.6153f, 4.4772f)
                curveTo(13.8069f, 4.4515f, 14.0255f, 4.3887f, 14.2071f, 4.2071f)
                curveTo(14.3887f, 4.0255f, 14.4515f, 3.8069f, 14.4772f, 3.6153f)
                curveTo(14.5001f, 3.4453f, 14.5f, 3.2392f, 14.5f, 3.0272f)
                curveTo(14.5f, 3.0182f, 14.5f, 3.0091f, 14.5f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF222222)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 2.5f)
                lineTo(16.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 4.0f)
                lineTo(17.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 21.5f)
                lineTo(8.0f, 21.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 20.0f)
                lineTo(6.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF222222)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
        .build()
        return _mobileMode!!
    }

private var _mobileMode: ImageVector? = null

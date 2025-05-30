package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.LinkedinMono: ImageVector
    get() {
        if (_linkedinMono != null) {
            return _linkedinMono!!
        }
        _linkedinMono = Builder(name = "LinkedinMono", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.3721f, 24.0f)
                    horizontalLineTo(0.3964f)
                    verticalLineTo(7.9764f)
                    horizontalLineTo(5.3721f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(2.8816f, 5.7907f)
                    curveTo(1.2905f, 5.7907f, 0.0f, 4.4728f, 0.0f, 2.8817f)
                    curveTo(0.0f, 2.1174f, 0.3036f, 1.3844f, 0.844f, 0.844f)
                    curveTo(1.3844f, 0.3036f, 2.1174f, 0.0f, 2.8816f, 0.0f)
                    curveTo(3.6459f, 0.0f, 4.3788f, 0.3036f, 4.9192f, 0.844f)
                    curveTo(5.4596f, 1.3844f, 5.7632f, 2.1174f, 5.7632f, 2.8817f)
                    curveTo(5.7632f, 4.4728f, 4.4721f, 5.7907f, 2.8816f, 5.7907f)
                    close()
                    moveTo(23.9946f, 24.0f)
                    horizontalLineTo(19.0296f)
                    verticalLineTo(16.1998f)
                    curveTo(19.0296f, 14.3409f, 18.9921f, 11.9569f, 16.4427f, 11.9569f)
                    curveTo(13.8557f, 11.9569f, 13.4593f, 13.9766f, 13.4593f, 16.0659f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(8.4889f)
                    verticalLineTo(7.9764f)
                    horizontalLineTo(13.2611f)
                    verticalLineTo(10.1622f)
                    horizontalLineTo(13.3307f)
                    curveTo(13.995f, 8.9032f, 15.6177f, 7.5746f, 18.0386f, 7.5746f)
                    curveTo(23.0743f, 7.5746f, 24.0f, 10.8908f, 24.0f, 15.198f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(23.9946f)
                    close()
                }
            }
        }
        .build()
        return _linkedinMono!!
    }

private var _linkedinMono: ImageVector? = null

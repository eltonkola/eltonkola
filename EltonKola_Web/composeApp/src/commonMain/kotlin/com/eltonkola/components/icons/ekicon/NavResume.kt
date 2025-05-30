package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.NavResume: ImageVector
    get() {
        if (_navResume != null) {
            return _navResume!!
        }
        _navResume = Builder(name = "NavResume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF222222)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 12.5f)
                lineTo(15.5f, 12.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF222222)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 15.5f)
                lineTo(12.5f, 15.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF222222)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 5.9f)
                curveTo(5.5f, 5.0599f, 5.5f, 4.6399f, 5.6635f, 4.319f)
                curveTo(5.8073f, 4.0368f, 6.0368f, 3.8073f, 6.319f, 3.6635f)
                curveTo(6.6399f, 3.5f, 7.0599f, 3.5f, 7.9f, 3.5f)
                horizontalLineTo(12.5059f)
                curveTo(12.8728f, 3.5f, 13.0562f, 3.5f, 13.2288f, 3.5415f)
                curveTo(13.3819f, 3.5782f, 13.5282f, 3.6388f, 13.6624f, 3.721f)
                curveTo(13.8138f, 3.8138f, 13.9435f, 3.9435f, 14.2029f, 4.2029f)
                lineTo(17.7971f, 7.7971f)
                curveTo(18.0565f, 8.0565f, 18.1862f, 8.1862f, 18.279f, 8.3376f)
                curveTo(18.3612f, 8.4718f, 18.4218f, 8.6181f, 18.4586f, 8.7711f)
                curveTo(18.5f, 8.9438f, 18.5f, 9.1272f, 18.5f, 9.4941f)
                verticalLineTo(18.1f)
                curveTo(18.5f, 18.9401f, 18.5f, 19.3601f, 18.3365f, 19.681f)
                curveTo(18.1927f, 19.9632f, 17.9632f, 20.1927f, 17.681f, 20.3365f)
                curveTo(17.3601f, 20.5f, 16.9401f, 20.5f, 16.1f, 20.5f)
                horizontalLineTo(7.9f)
                curveTo(7.0599f, 20.5f, 6.6399f, 20.5f, 6.319f, 20.3365f)
                curveTo(6.0368f, 20.1927f, 5.8073f, 19.9632f, 5.6635f, 19.681f)
                curveTo(5.5f, 19.3601f, 5.5f, 18.9401f, 5.5f, 18.1f)
                verticalLineTo(5.9f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF222222)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 3.5f)
                verticalLineTo(7.1f)
                curveTo(12.5f, 7.9401f, 12.5f, 8.3601f, 12.6635f, 8.681f)
                curveTo(12.8073f, 8.9632f, 13.0368f, 9.1927f, 13.319f, 9.3365f)
                curveTo(13.6399f, 9.5f, 14.0599f, 9.5f, 14.9f, 9.5f)
                horizontalLineTo(18.5f)
            }
        }
        .build()
        return _navResume!!
    }

private var _navResume: ImageVector? = null

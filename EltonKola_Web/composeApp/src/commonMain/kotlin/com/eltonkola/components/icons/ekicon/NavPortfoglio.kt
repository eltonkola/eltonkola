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

public val EKIcon.NavPortfoglio: ImageVector
    get() {
        if (_navPortfoglio != null) {
            return _navPortfoglio!!
        }
        _navPortfoglio = Builder(name = "NavPortfoglio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF222222)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 15.0f)
                verticalLineTo(6.9f)
                curveTo(3.5f, 6.0599f, 3.5f, 5.6399f, 3.6635f, 5.319f)
                curveTo(3.8073f, 5.0368f, 4.0368f, 4.8073f, 4.319f, 4.6635f)
                curveTo(4.6399f, 4.5f, 5.0599f, 4.5f, 5.9f, 4.5f)
                horizontalLineTo(8.4724f)
                curveTo(8.8481f, 4.5f, 9.0359f, 4.5f, 9.2065f, 4.5518f)
                curveTo(9.3574f, 4.5976f, 9.4979f, 4.6728f, 9.6197f, 4.773f)
                curveTo(9.7574f, 4.8861f, 9.8616f, 5.0424f, 10.07f, 5.3551f)
                lineTo(10.93f, 6.6453f)
                curveTo(11.1384f, 6.958f, 11.2426f, 7.1143f, 11.3803f, 7.2274f)
                curveTo(11.5022f, 7.3276f, 11.6426f, 7.4028f, 11.7935f, 7.4486f)
                curveTo(11.9641f, 7.5004f, 12.1519f, 7.5004f, 12.5276f, 7.5004f)
                horizontalLineTo(16.5004f)
                curveTo(16.965f, 7.5004f, 17.1973f, 7.5004f, 17.3879f, 7.5514f)
                curveTo(17.9058f, 7.6901f, 18.3103f, 8.0946f, 18.449f, 8.6125f)
                curveTo(18.5f, 8.8031f, 18.5f, 9.0354f, 18.5f, 9.5f)
                verticalLineTo(9.5f)
                moveTo(10.5f, 13.5f)
                horizontalLineTo(16.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF222222)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 18.5f)
                lineTo(16.7701f, 18.5004f)
                curveTo(17.3922f, 18.5004f, 17.7032f, 18.5004f, 17.9679f, 18.3963f)
                curveTo(18.2016f, 18.3044f, 18.4084f, 18.1553f, 18.5695f, 17.9626f)
                curveTo(18.752f, 17.7445f, 18.8503f, 17.4494f, 19.047f, 16.8593f)
                lineTo(20.4471f, 12.6592f)
                curveTo(20.8026f, 11.5927f, 20.9803f, 11.0595f, 20.8737f, 10.635f)
                curveTo(20.7804f, 10.2635f, 20.5485f, 9.9417f, 20.2255f, 9.7357f)
                curveTo(19.8566f, 9.5003f, 19.2945f, 9.5003f, 18.1703f, 9.5003f)
                lineTo(10.2299f, 9.5f)
                curveTo(9.6078f, 9.5f, 9.2968f, 9.5f, 9.0322f, 9.6041f)
                curveTo(8.7985f, 9.696f, 8.5916f, 9.8451f, 8.4305f, 10.0378f)
                curveTo(8.248f, 10.2559f, 8.1497f, 10.551f, 7.953f, 11.1411f)
                lineTo(5.7649f, 17.7057f)
                curveTo(5.6067f, 18.1803f, 5.1625f, 18.5004f, 4.6623f, 18.5004f)
                verticalLineTo(18.5004f)
                curveTo(4.0204f, 18.5004f, 3.5f, 17.98f, 3.5f, 17.3381f)
                verticalLineTo(14.5f)
            }
        }
        .build()
        return _navPortfoglio!!
    }

private var _navPortfoglio: ImageVector? = null

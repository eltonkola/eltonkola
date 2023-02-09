package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.Playstore: ImageVector
    get() {
        if (_playstore != null) {
            return _playstore!!
        }
        _playstore = Builder(name = "Playstore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF00A0FF), 0.00657f to Color(0xFF00A1FF),
                    0.2601f to Color(0xFF00BEFF), 0.5122f to Color(0xFF00D2FF), 0.7604f to
                    Color(0xFF00DFFF), 1.0f to Color(0xFF00E3FF), start = Offset(12.0313f,1.45796f),
                    end = Offset(-6.48738f,6.39233f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.4259f, 0.3635f)
                curveTo(1.1559f, 0.6543f, 1.0f, 1.0988f, 1.0f, 1.6806f)
                verticalLineTo(22.3147f)
                curveTo(1.0f, 22.8964f, 1.1559f, 23.3409f, 1.4352f, 23.6202f)
                lineTo(1.5073f, 23.683f)
                lineTo(13.0683f, 12.1221f)
                verticalLineTo(11.8638f)
                lineTo(1.498f, 0.3006f)
                lineTo(1.4259f, 0.3635f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE000), 0.4087f to Color(0xFFFFBD00),
                    0.7754f to Color(0xFFFFA500), 1.0f to Color(0xFFFF9C00), start =
                    Offset(23.2621f,11.9965f), end = Offset(0.682906f,11.9965f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(16.9149f, 15.9874f)
                lineTo(13.059f, 12.1315f)
                verticalLineTo(11.8615f)
                lineTo(16.9149f, 8.0056f)
                lineTo(16.9987f, 8.0568f)
                lineTo(21.5597f, 10.6491f)
                curveTo(22.8651f, 11.3845f, 22.8651f, 12.5992f, 21.5597f, 13.3439f)
                lineTo(16.9987f, 15.9362f)
                lineTo(16.9149f, 15.9874f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFF3A44), 1.0f to Color(0xFFC31162), start =
                    Offset(14.8561f,14.1403f), end = Offset(-0.0104655f,39.162f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(16.9984f, 15.9362f)
                lineTo(13.0587f, 11.9965f)
                lineTo(1.4256f, 23.6295f)
                curveTo(1.8515f, 24.0856f, 2.5659f, 24.1368f, 3.3641f, 23.6923f)
                lineTo(16.9984f, 15.9362f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF32A071), 0.0685f to Color(0xFF2DA771),
                    0.4762f to Color(0xFF15CF74), 0.8009f to Color(0xFF06E775), 1.0f to
                    Color(0xFF00F076), start = Offset(-1.50368f,-6.49976f), end =
                    Offset(5.1289f,4.67532f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                    = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                    EvenOdd) {
                moveTo(16.9984f, 8.0568f)
                lineTo(3.3641f, 0.3123f)
                curveTo(2.5659f, -0.1438f, 1.8492f, -0.081f, 1.4256f, 0.3751f)
                lineTo(13.0587f, 11.9965f)
                lineTo(16.9984f, 8.0568f)
                close()
            }
        }
        .build()
        return _playstore!!
    }

private var _playstore: ImageVector? = null

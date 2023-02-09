package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.AlbanianEagle10: ImageVector
    get() {
        if (_albanianEagle10 != null) {
            return _albanianEagle10!!
        }
        _albanianEagle10 = Builder(name = "AlbanianEagle10", defaultWidth = 360.0.dp, defaultHeight
                = 510.0.dp, viewportWidth = 360.0f, viewportHeight = 510.0f).apply {
            path(fill = SolidColor(Color(0xFF596475)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(51.0f, 288.38f)
                curveTo(64.33f, 283.04f, 86.33f, 279.04f, 117.0f, 276.38f)
                curveTo(117.0f, 276.38f, 135.44f, 266.43f, 172.0f, 261.38f)
                curveTo(173.04f, 261.23f, 179.5f, 253.38f, 208.0f, 248.38f)
                curveTo(224.0f, 248.38f, 229.0f, 244.5f, 238.0f, 253.38f)
                curveTo(241.53f, 239.85f, 257.13f, 236.8f, 267.0f, 238.38f)
                curveTo(273.9f, 239.48f, 278.3f, 244.31f, 279.0f, 246.38f)
                curveTo(283.0f, 258.38f, 300.0f, 251.38f, 309.0f, 258.38f)
                curveTo(286.0f, 264.38f, 286.0f, 265.38f, 277.0f, 269.38f)
                curveTo(261.0f, 283.38f, 246.0f, 300.38f, 230.0f, 300.38f)
                curveTo(214.0f, 304.38f, 197.17f, 305.71f, 179.5f, 304.38f)
                curveTo(178.5f, 308.38f, 176.0f, 311.04f, 172.0f, 312.38f)
                curveTo(166.0f, 314.38f, 171.0f, 303.38f, 168.0f, 300.38f)
                curveTo(165.0f, 297.38f, 165.0f, 310.38f, 151.0f, 318.38f)
                curveTo(150.0f, 304.38f, 146.0f, 308.38f, 146.0f, 300.38f)
                curveTo(146.0f, 292.38f, 150.0f, 313.38f, 129.0f, 318.38f)
                curveTo(115.0f, 321.71f, 97.33f, 322.38f, 76.0f, 320.38f)
                curveTo(102.0f, 311.71f, 117.33f, 304.04f, 122.0f, 297.38f)
                curveTo(117.0f, 297.38f, 104.0f, 296.38f, 101.0f, 288.38f)
                curveTo(87.0f, 283.88f, 70.33f, 283.88f, 51.0f, 288.38f)
                close()
            }
        }
        .build()
        return _albanianEagle10!!
    }

private var _albanianEagle10: ImageVector? = null

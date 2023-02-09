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

public val EKIcon.DownloadMicrosoft: ImageVector
    get() {
        if (_downloadMicrosoft != null) {
            return _downloadMicrosoft!!
        }
        _downloadMicrosoft = Builder(name = "DownloadMicrosoft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFFEBA08)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF05A6F0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.9096f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF80BC06)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF25325)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _downloadMicrosoft!!
    }

private var _downloadMicrosoft: ImageVector? = null

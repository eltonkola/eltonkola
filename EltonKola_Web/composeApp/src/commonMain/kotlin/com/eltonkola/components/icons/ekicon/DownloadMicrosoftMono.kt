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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.DownloadMicrosoftMono: ImageVector
    get() {
        if (_downloadMicrosoftMono != null) {
            return _downloadMicrosoftMono!!
        }
        _downloadMicrosoftMono = Builder(name = "DownloadMicrosoftMono", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF687076)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0905f, 13.0912f)
                    horizontalLineToRelative(10.9096f)
                    verticalLineToRelative(10.9096f)
                    horizontalLineToRelative(-10.9096f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF687076)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 13.0912f)
                    horizontalLineToRelative(10.9096f)
                    verticalLineToRelative(10.9096f)
                    horizontalLineToRelative(-10.9096f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF687076)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0905f, 0.0f)
                    horizontalLineToRelative(10.9096f)
                    verticalLineToRelative(10.9096f)
                    horizontalLineToRelative(-10.9096f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF687076)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(10.9096f)
                    verticalLineToRelative(10.9096f)
                    horizontalLineToRelative(-10.9096f)
                    close()
                }
            }
        }
        .build()
        return _downloadMicrosoftMono!!
    }

private var _downloadMicrosoftMono: ImageVector? = null

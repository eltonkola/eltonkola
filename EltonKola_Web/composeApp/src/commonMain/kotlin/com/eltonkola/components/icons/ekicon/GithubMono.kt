package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.GithubMono: ImageVector
    get() {
        if (_githubMono != null) {
            return _githubMono!!
        }
        _githubMono = Builder(name = "GithubMono", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0f, 0.0f)
                    curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                    curveTo(0.0f, 18.6274f, 5.3726f, 24.0f, 12.0f, 24.0f)
                    curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                    curveTo(24.0f, 5.3726f, 18.6274f, 0.0f, 12.0f, 0.0f)
                    close()
                    moveTo(2.0f, 12.0f)
                    curveTo(2.0f, 6.4775f, 6.475f, 2.0f, 12.0f, 2.0f)
                    curveTo(17.5225f, 2.0f, 22.0f, 6.4775f, 22.0f, 12.0f)
                    curveTo(22.0f, 16.4125f, 19.1375f, 20.1625f, 15.1367f, 21.4742f)
                    curveTo(14.6242f, 21.5742f, 14.4492f, 21.2617f, 14.4492f, 20.9992f)
                    curveTo(14.4492f, 20.8919f, 14.4505f, 20.7029f, 14.4524f, 20.4496f)
                    curveTo(14.4561f, 19.9357f, 14.4617f, 19.1574f, 14.4617f, 18.2608f)
                    curveTo(14.4617f, 17.3242f, 14.1367f, 16.7108f, 13.7867f, 16.4108f)
                    curveTo(16.0117f, 16.165f, 18.3492f, 15.3192f, 18.3492f, 11.4775f)
                    curveTo(18.3492f, 10.3858f, 17.9617f, 9.4942f, 17.3242f, 8.7942f)
                    curveTo(17.4242f, 8.5417f, 17.7617f, 7.525f, 17.2242f, 6.1475f)
                    curveTo(17.2242f, 6.1475f, 16.3867f, 5.8792f, 14.4867f, 7.1725f)
                    curveTo(13.6867f, 6.95f, 12.8367f, 6.84f, 11.9867f, 6.835f)
                    curveTo(11.1367f, 6.84f, 10.2867f, 6.95f, 9.4867f, 7.1725f)
                    curveTo(7.5742f, 5.8792f, 6.7367f, 6.1475f, 6.7367f, 6.1475f)
                    curveTo(6.1992f, 7.525f, 6.5367f, 8.5417f, 6.6492f, 8.7942f)
                    curveTo(6.0075f, 9.4942f, 5.62f, 10.3858f, 5.62f, 11.4775f)
                    curveTo(5.62f, 15.3092f, 7.9542f, 16.1692f, 10.175f, 16.4192f)
                    curveTo(9.8892f, 16.6692f, 9.6317f, 17.11f, 9.5417f, 17.7567f)
                    curveTo(8.97f, 18.0125f, 7.5208f, 18.4542f, 6.6292f, 16.925f)
                    curveTo(6.6292f, 16.925f, 6.1017f, 15.965f, 5.0975f, 15.895f)
                    curveTo(5.0975f, 15.895f, 4.1217f, 15.8825f, 5.0275f, 16.5025f)
                    curveTo(5.0275f, 16.5025f, 5.685f, 16.8108f, 6.14f, 17.965f)
                    curveTo(6.14f, 17.965f, 6.7267f, 19.91f, 9.5083f, 19.3067f)
                    curveTo(9.5106f, 19.7695f, 9.5142f, 20.1693f, 9.517f, 20.474f)
                    curveTo(9.5192f, 20.718f, 9.5208f, 20.9011f, 9.5208f, 21.0067f)
                    curveTo(9.5208f, 21.2725f, 9.3375f, 21.5817f, 8.8375f, 21.4875f)
                    curveTo(4.865f, 20.1667f, 2.0f, 16.4192f, 2.0f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _githubMono!!
    }

private var _githubMono: ImageVector? = null

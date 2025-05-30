package com.eltonkola.components.icons.ekicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.eltonkola.components.icons.EKIcon

public val EKIcon.DownloadAppleMono: ImageVector
    get() {
        if (_downloadAppleMono != null) {
            return _downloadAppleMono!!
        }
        _downloadAppleMono = Builder(name = "DownloadAppleMono", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF687076)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.792f, 18.7033f)
                curveTo(21.429f, 19.5418f, 20.9994f, 20.3136f, 20.5016f, 21.0232f)
                curveTo(19.8231f, 21.9906f, 19.2676f, 22.6602f, 18.8395f, 23.032f)
                curveTo(18.1758f, 23.6424f, 17.4647f, 23.955f, 16.7032f, 23.9728f)
                curveTo(16.1566f, 23.9728f, 15.4973f, 23.8172f, 14.73f, 23.5017f)
                curveTo(13.9601f, 23.1876f, 13.2525f, 23.032f, 12.6056f, 23.032f)
                curveTo(11.9271f, 23.032f, 11.1994f, 23.1876f, 10.4211f, 23.5017f)
                curveTo(9.6415f, 23.8172f, 9.0135f, 23.9816f, 8.5334f, 23.9979f)
                curveTo(7.8032f, 24.0291f, 7.0754f, 23.7076f, 6.3489f, 23.032f)
                curveTo(5.8852f, 22.6276f, 5.3052f, 21.9343f, 4.6104f, 20.9521f)
                curveTo(3.865f, 19.9033f, 3.2521f, 18.687f, 2.772f, 17.3004f)
                curveTo(2.2578f, 15.8026f, 2.0f, 14.3523f, 2.0f, 12.9482f)
                curveTo(2.0f, 11.3398f, 2.3475f, 9.9526f, 3.0437f, 8.7901f)
                curveTo(3.5908f, 7.8564f, 4.3186f, 7.1198f, 5.2295f, 6.5791f)
                curveTo(6.1405f, 6.0383f, 7.1247f, 5.7628f, 8.1847f, 5.7452f)
                curveTo(8.7647f, 5.7452f, 9.5252f, 5.9246f, 10.4704f, 6.2772f)
                curveTo(11.4129f, 6.6309f, 12.018f, 6.8103f, 12.2834f, 6.8103f)
                curveTo(12.4817f, 6.8103f, 13.154f, 6.6005f, 14.2937f, 6.1823f)
                curveTo(15.3714f, 5.7945f, 16.281f, 5.6339f, 17.0262f, 5.6972f)
                curveTo(19.0454f, 5.8601f, 20.5624f, 6.6561f, 21.5712f, 8.0901f)
                curveTo(19.7654f, 9.1843f, 18.872f, 10.7169f, 18.8898f, 12.6829f)
                curveTo(18.9061f, 14.2142f, 19.4617f, 15.4886f, 20.5535f, 16.5004f)
                curveTo(21.0483f, 16.97f, 21.6009f, 17.333f, 22.2156f, 17.5907f)
                curveTo(22.0823f, 17.9774f, 21.9416f, 18.3477f, 21.792f, 18.7033f)
                close()
                moveTo(17.161f, 0.4801f)
                curveTo(17.161f, 1.6804f, 16.7225f, 2.8011f, 15.8484f, 3.8384f)
                curveTo(14.7937f, 5.0715f, 13.5179f, 5.7841f, 12.1343f, 5.6717f)
                curveTo(12.1167f, 5.5277f, 12.1065f, 5.3761f, 12.1065f, 5.2169f)
                curveTo(12.1065f, 4.0646f, 12.6081f, 2.8315f, 13.4989f, 1.8232f)
                curveTo(13.9436f, 1.3127f, 14.5092f, 0.8882f, 15.1951f, 0.5496f)
                curveTo(15.8796f, 0.2161f, 16.5269f, 0.0316f, 17.1358f, 0.0f)
                curveTo(17.1536f, 0.1605f, 17.161f, 0.3209f, 17.161f, 0.4801f)
                close()
            }
        }
        .build()
        return _downloadAppleMono!!
    }

private var _downloadAppleMono: ImageVector? = null

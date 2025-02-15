package com.shibler.neumorphism

import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Modifier.neumorphic(color: Color = Color(0xFFE0E0E0), // Couleur de fond
                        shadowBlur: Dp = 10.dp,           // Flou de l'ombre
                        lightColor: Color = Color.White,  // Ombre claire
                        darkColor: Color = Color(0xFFB0B0B0), // Ombre foncée
                        cornerRadius: Dp = 12.dp): Modifier = composed {

    this
        .blur(16.dp,edgeTreatment = BlurredEdgeTreatment.Unbounded)
        .drawBehind {
            drawRoundRect(
                color = Color.White,
                topLeft = Offset(-30f, -30f),
                size = Size(this.size.width, this.size.height),
                cornerRadius = CornerRadius(20f, 20f),
                alpha = 1f
            )
            drawRoundRect(
                color = Color.Black,
                topLeft = Offset(30f, 30f),
                size = Size(this.size.width, this.size.height),
                cornerRadius = CornerRadius(20f, 20f),
                alpha = 1f
            )
        }

}
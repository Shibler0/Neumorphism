package com.shibler.neumorphism.shapes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

class InnerBottomRightRounded(val widthmarker: Float = 8f) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {

        val rect = Rect(Offset(size.width* 0.75f - 4f, size.height * 0.75f - 4f), Size(size.width/4, size.height/4))

        val path = Path().apply {
            moveTo(0f, size.height - widthmarker)
            lineTo(size.width * 0.75f, size.height - widthmarker)
            arcTo(rect, 90f, -90f, false)
            lineTo(size.width - widthmarker, 0f)
            lineTo(size.width + 20f, 0f)
            lineTo(size.width + 20f, size.height+ 20f)
            lineTo(0f, size.height+ 20f)

        }

        return Outline.Generic(path)
    }
}

@Preview
@Composable
fun preview() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.Black)
            .drawBehind {
                val path = Path()

                val oval = Rect(50f, 50f, size.width - 50f, size.height - 50f)

                path.addArc(oval, 180f, 90f)

                drawPath(
                    path = path,
                    color = Color.White,
                    style = Stroke(width = 4f)
                )
            },
        contentAlignment = Alignment.Center
    ) {
    }
}
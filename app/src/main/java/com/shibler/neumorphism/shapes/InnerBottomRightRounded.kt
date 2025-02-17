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

class InnerBottomRightRounded(val widthmarker: Float = 8f, val cornerSizeX : Float, val cornerSizeY : Float, val cornerRadius : Float = 0f) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {


        val path = Path().apply {
            moveTo(0f, size.height)
            lineTo(cornerSizeX, size.height - widthmarker)

            quadraticBezierTo(size.width + 15f, size.height + 15f,  size.width - widthmarker, cornerSizeY)

            lineTo(size.width - widthmarker, 0f)
            lineTo(size.width + 20f, - 20f)
            lineTo(size.width + 20f, size.height+ 20f)
            lineTo(0f, size.height+ 20f)
            close()

        }

        return Outline.Generic(path)
    }
}
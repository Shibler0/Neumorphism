package com.shibler.neumorphism.shapes

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class InnerTopLeft(val widthmarker: Float = 1f) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {

        val path = Path().apply {
            moveTo(widthmarker , size.height) // |
            lineTo(widthmarker,  widthmarker)//  .
            lineTo(size.width,  widthmarker)//   _
            //return
            lineTo(size.width, -20f)// |
            lineTo(- 20f, -20f)// .
            lineTo(-20f, size.height)
            close()
        }

        return Outline.Generic(path)
    }
}
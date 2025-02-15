package com.shibler.neumorphism.shapes

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class InnerBottomRight(val widthmarker: Float = 1f) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {

        val path = Path().apply {
            moveTo(0f, size.height - widthmarker)
            lineTo(size.width - widthmarker, size.height - widthmarker)
            lineTo(size.width - widthmarker, 0f)
            //return
            lineTo(size.width + 20f, 0f)
            lineTo(size.width + 20f, size.height + 20f)
            lineTo(0f, size.height + 20f)
        }

        return Outline.Generic(path)
    }
}
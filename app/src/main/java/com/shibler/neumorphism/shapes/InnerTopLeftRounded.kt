package com.shibler.neumorphism.shapes

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class InnerTopLeftRounded(val cornerRadius : Float = 0f, val cornerSizeX : Float, val cornerSizeY : Float) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {

        val path = Path().apply {
            moveTo(10f, size.height)
            lineTo(10f, cornerSizeY)

            quadraticBezierTo(cornerRadius, cornerRadius,  cornerSizeX, 10f)

            lineTo(size.width, 0f)
            lineTo(size.width + 20f, - 20f)
            lineTo(-20f, -20f)
            lineTo(- 20f, size.height)
            close()
        }

        return Outline.Generic(path)
    }
}
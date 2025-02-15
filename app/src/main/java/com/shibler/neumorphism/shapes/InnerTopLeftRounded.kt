package com.shibler.neumorphism.shapes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class InnerTopLeftRounded(val widthmarker: Float = 1f, val cornerRadius: Float = 10f) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {

        val rect = Rect(Offset(10f, 10f), Size(size.width/4, size.height/4))
        //val semiRect = Rect(Offset(size.width, 0f), Size(size.width/4, size.height/4))

        val path = Path().apply {
            moveTo(10f, size.height)
            lineTo(10f, size.height/4)

            arcTo(rect, 180f, 90f, false)
            lineTo(size.width, 10f)
            lineTo(size.width + 20f, - 20f)
            lineTo(-20f, -20f)
            lineTo(- 20f, size.height)
            close()
        }

        return Outline.Generic(path)
    }
}
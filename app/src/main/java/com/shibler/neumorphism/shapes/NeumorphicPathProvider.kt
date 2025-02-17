package com.shibler.neumorphism.shapes

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path

class NeumorphicPathProvider(private val cornerRadius: Float) {

    fun getPath(size: Size): Path {
        val path = Path().apply {

            val thickness = 5f

            moveTo(thickness, size.height)
            lineTo(thickness, size.height/2)

            //arcTo(rect, 180f, 90f, false)
            quadraticBezierTo(0f, 0f, cornerRadius + 10f, 10f)

            lineTo(size.width, 10f)
            lineTo(size.width + 20f, - 20f)
            lineTo(-20f, -20f)
            lineTo(- 20f, size.height)
            close()
        }
        return path
    }
}

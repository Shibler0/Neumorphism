package com.shibler.neumorphism

import android.annotation.SuppressLint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shibler.neumorphism.shapes.InnerBottomRight
import com.shibler.neumorphism.shapes.InnerBottomRightRounded
import com.shibler.neumorphism.shapes.InnerTopLeft
import com.shibler.neumorphism.shapes.InnerTopLeftRounded
import com.shibler.neumorphism.shapes.NeumorphicPathProvider
import com.shibler.neumorphism.shapes.Triangle
import com.shibler.neumorphism.shapes.Triangle2

val backgroundColor = Color(53, 57, 60)

@SuppressLint("SuspiciousIndentation")
@Preview
@Composable
fun ShadowOutterButton(innerColor : Color = backgroundColor, picture : Int = R.drawable.baseline_favorite_24) {


    val white = Color(255, 255, 255, 122)
    val black = Color(0, 0, 0, 255)

    Box(
        modifier = Modifier
            .size(100.dp)
    ) {
        Box(
            modifier = Modifier
                .size(104.dp)
                .blur(10.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
                .clip(RoundedCornerShape(20.dp))
                .background(black, Triangle2())
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .blur(10.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
                .clip(RoundedCornerShape(20.dp))
                .background(white, Triangle())
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(innerColor, RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.Center
        ) {

            Image(painter = painterResource(id = picture), contentDescription = "", modifier = Modifier.size(30.dp))

        }
    }



}

@SuppressLint("SuspiciousIndentation")
@Preview
@Composable
fun ShadowInnerButton(picture : Int = R.drawable.baseline_favorite_24) {

    //val backgroundColor = Color(53, 57, 60)
    val white = Color(255, 255, 255, 255)
    val black = Color(0, 0, 0, 255)

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Transparent)
                .clip(RoundedCornerShape(0.dp)),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .blur(7.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
                    .background(white, InnerBottomRight(8f))
            )

            Box(
                modifier = Modifier
                    .size(100.dp)
                    .blur(6.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
                    .background( black, InnerTopLeft(15f))
            )

            Image(painter = painterResource(id = picture), contentDescription = "", modifier = Modifier.size(40.dp))
        }
}


@Preview
@Composable
fun ShadowInnerRounded() {

    val backgroundColor = Color(53, 57, 60)
    val white = Color(255, 255, 255, 255)
    val black = Color(0, 0, 0, 255)

    val cornerRadius = 40.dp

    val width = LocalConfiguration.current.screenWidthDp.dp
    val density = LocalDensity.current

    val cornerRadiusInPx = with(density) { cornerRadius.toPx() }

    Box(
        modifier = Modifier
            .size(200.dp)
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(cornerRadius)),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .blur(7.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
                    .background( white, InnerBottomRightRounded(7f, cornerRadiusInPx , cornerRadiusInPx))
            )

            Canvas(
                modifier = Modifier
                    .size(100.dp)
                    .blur(6.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
                    .background(Color.Black, InnerTopLeftRounded(10f, cornerRadiusInPx , cornerRadiusInPx))
            ) {
            }

            Image(painter = painterResource(id = R.drawable.baseline_favorite_24), contentDescription = "", modifier = Modifier.size(40.dp))
        }

    }

}
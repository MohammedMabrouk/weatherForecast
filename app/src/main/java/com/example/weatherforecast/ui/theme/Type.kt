package com.example.weatherforecast.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.weatherforecast.R

val mainFont = FontFamily(
    Font(R.font.circular_std)
)

val Typography = Typography(
    titleLarge = TextStyle(
        fontSize = 120.sp,
        fontFamily = mainFont,
        fontWeight = FontWeight(450),
        color = Color.White,
        textAlign = TextAlign.Center
    ),
    titleMedium = TextStyle(
        fontSize = 32.sp,
        fontFamily = mainFont,
        fontWeight = FontWeight(450),
        color = Color.White,
        textAlign = TextAlign.Center
    ),
    labelSmall = TextStyle(
        fontSize = 12.sp,
        fontFamily = mainFont,
        fontWeight = FontWeight(450),
        color = Color.White,
        textAlign = TextAlign.Center
    ),
    labelMedium = TextStyle(
        fontSize = 18.sp,
        fontFamily = mainFont,
        fontWeight = FontWeight(450),
        color = Color.White,
        textAlign = TextAlign.Center
    )
)
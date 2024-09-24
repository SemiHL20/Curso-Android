package com.example.yoga30days.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.yoga30days.R

val ShadowFont = FontFamily(
    Font(R.font.shadowsintolight_regular)
)
// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        fontFamily = ShadowFont
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 25.sp,
        fontFamily = ShadowFont
    ),
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp,
        fontFamily = ShadowFont
    ),
    bodyMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        fontFamily = ShadowFont
    )

)
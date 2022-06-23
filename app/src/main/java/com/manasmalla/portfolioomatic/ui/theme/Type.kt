package com.manasmalla.portfolioomatic.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.manasmalla.portfolioomatic.R


val ProductSansFontFamily = FontFamily(
    listOf(
        Font(R.font.product_sans_light, weight = FontWeight.Light),
        Font(R.font.product_sans_thin, weight = FontWeight.Thin),
        Font(R.font.product_sans_regular),
        Font(R.font.product_sans_medium, weight = FontWeight.Medium),
        Font(R.font.product_sans_bold, weight = FontWeight.Bold),
        Font(R.font.product_sans_black, weight = FontWeight.Black),
        Font(R.font.product_sans_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),
        Font(R.font.product_sans_thin_italic, weight = FontWeight.Thin, style = FontStyle.Italic),
        Font(R.font.product_sans_italic, style = FontStyle.Italic),
        Font(R.font.product_sans_medium_italic,  weight = FontWeight.Medium, style = FontStyle.Italic),
        Font(R.font.product_sans_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),
        Font(R.font.product_sans_black_italic, weight = FontWeight.Black, style = FontStyle.Italic)
    )
)


// Set of Material typography styles to start with
val PortfolioOMaticTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = 0.sp
    ),
    displayMedium = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        lineHeight = 45.sp,
        letterSpacing = 0.sp
    ),
    displaySmall = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    titleSmall = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),
    labelLarge = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    labelMedium = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = ProductSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)

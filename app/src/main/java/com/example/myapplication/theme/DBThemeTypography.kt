package com.example.myapplication.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.text.font.FontWeight

data class BodyTypography(
    val lineHeight3xs: TextUnit,
    val fontSize3xs: TextUnit,
    val lineHeight2xs: TextUnit,
    val fontSize2xs: TextUnit,
    val lineHeightXs: TextUnit,
    val fontSizeXs: TextUnit,
    val lineHeightSm: TextUnit,
    val fontSizeSm: TextUnit,
    val lineHeightMd: TextUnit,
    val fontSizeMd: TextUnit,
    val lineHeightLg: TextUnit,
    val fontSizeLg: TextUnit,
    val lineHeightXl: TextUnit,
    val fontSizeXl: TextUnit,
    val lineHeight2xl: TextUnit,
    val fontSize2xl: TextUnit,
    val lineHeight3xl: TextUnit,
    val fontSize3xl: TextUnit,
)

data class HeadlineTypography(
    val lineHeight3xs: TextUnit,
    val fontSize3xs: TextUnit,
    val lineHeight2xs: TextUnit,
    val fontSize2xs: TextUnit,
    val lineHeightXs: TextUnit,
    val fontSizeXs: TextUnit,
    val lineHeightSm: TextUnit,
    val fontSizeSm: TextUnit,
    val lineHeightMd: TextUnit,
    val fontSizeMd: TextUnit,
    val lineHeightLg: TextUnit,
    val fontSizeLg: TextUnit,
    val lineHeightXl: TextUnit,
    val fontSizeXl: TextUnit,
    val lineHeight2xl: TextUnit,
    val fontSize2xl: TextUnit,
    val lineHeight3xl: TextUnit,
    val fontSize3xl: TextUnit,
)

data class DBThemeTypography(
    val body: BodyTypography,
    val headline: HeadlineTypography,
)

val bodyTypographyFunctionalMobile = BodyTypography(
    Typography.bodyLineHeightFunctionalMobile3xs,
    Typography.bodyLineHeightFunctionalMobile2xs,
    Typography.bodyLineHeightFunctionalMobileXs,
    Typography.bodyLineHeightFunctionalMobileSm,
    Typography.bodyLineHeightFunctionalMobileMd,
    Typography.bodyLineHeightFunctionalMobileLg,
    Typography.bodyLineHeightFunctionalMobileXl,
    Typography.bodyLineHeightFunctionalMobile2xl,
    Typography.bodyLineHeightFunctionalMobile3xl,
    Typography.bodyFontSizeFunctionalMobile3xs,
    Typography.bodyFontSizeFunctionalMobile2xs,
    Typography.bodyFontSizeFunctionalMobileXs,
    Typography.bodyFontSizeFunctionalMobileSm,
    Typography.bodyFontSizeFunctionalMobileMd,
    Typography.bodyFontSizeFunctionalMobileLg,
    Typography.bodyFontSizeFunctionalMobileXl,
    Typography.bodyFontSizeFunctionalMobile2xl,
    Typography.bodyFontSizeFunctionalMobile3xl,
)
val headlineTypographyFunctionalMobile = HeadlineTypography(
    Typography.headlineLineHeightFunctionalMobile3xs,
    Typography.headlineLineHeightFunctionalMobile2xs,
    Typography.headlineLineHeightFunctionalMobileXs,
    Typography.headlineLineHeightFunctionalMobileSm,
    Typography.headlineLineHeightFunctionalMobileMd,
    Typography.headlineLineHeightFunctionalMobileLg,
    Typography.headlineLineHeightFunctionalMobileXl,
    Typography.headlineLineHeightFunctionalMobile2xl,
    Typography.headlineLineHeightFunctionalMobile3xl,
    Typography.headlineFontSizeFunctionalMobile3xs,
    Typography.headlineFontSizeFunctionalMobile2xs,
    Typography.headlineFontSizeFunctionalMobileXs,
    Typography.headlineFontSizeFunctionalMobileSm,
    Typography.headlineFontSizeFunctionalMobileMd,
    Typography.headlineFontSizeFunctionalMobileLg,
    Typography.headlineFontSizeFunctionalMobileXl,
    Typography.headlineFontSizeFunctionalMobile2xl,
    Typography.headlineFontSizeFunctionalMobile3xl,
)

fun getTypographyFunctionalMobile(
    body: BodyTypography = bodyTypographyFunctionalMobile,
    headline: HeadlineTypography = headlineTypographyFunctionalMobile,

    ): DBThemeTypography = DBThemeTypography(
    body = body,
    headline = headline,
)

val bodyTypographyFunctionalTablet = BodyTypography(
    Typography.bodyLineHeightFunctionalTablet3xs,
    Typography.bodyLineHeightFunctionalTablet2xs,
    Typography.bodyLineHeightFunctionalTabletXs,
    Typography.bodyLineHeightFunctionalTabletSm,
    Typography.bodyLineHeightFunctionalTabletMd,
    Typography.bodyLineHeightFunctionalTabletLg,
    Typography.bodyLineHeightFunctionalTabletXl,
    Typography.bodyLineHeightFunctionalTablet2xl,
    Typography.bodyLineHeightFunctionalTablet3xl,
    Typography.bodyFontSizeFunctionalTablet3xs,
    Typography.bodyFontSizeFunctionalTablet2xs,
    Typography.bodyFontSizeFunctionalTabletXs,
    Typography.bodyFontSizeFunctionalTabletSm,
    Typography.bodyFontSizeFunctionalTabletMd,
    Typography.bodyFontSizeFunctionalTabletLg,
    Typography.bodyFontSizeFunctionalTabletXl,
    Typography.bodyFontSizeFunctionalTablet2xl,
    Typography.bodyFontSizeFunctionalTablet3xl,
)
val headlineTypographyFunctionalTablet = HeadlineTypography(
    Typography.headlineLineHeightFunctionalTablet3xs,
    Typography.headlineLineHeightFunctionalTablet2xs,
    Typography.headlineLineHeightFunctionalTabletXs,
    Typography.headlineLineHeightFunctionalTabletSm,
    Typography.headlineLineHeightFunctionalTabletMd,
    Typography.headlineLineHeightFunctionalTabletLg,
    Typography.headlineLineHeightFunctionalTabletXl,
    Typography.headlineLineHeightFunctionalTablet2xl,
    Typography.headlineLineHeightFunctionalTablet3xl,
    Typography.headlineFontSizeFunctionalTablet3xs,
    Typography.headlineFontSizeFunctionalTablet2xs,
    Typography.headlineFontSizeFunctionalTabletXs,
    Typography.headlineFontSizeFunctionalTabletSm,
    Typography.headlineFontSizeFunctionalTabletMd,
    Typography.headlineFontSizeFunctionalTabletLg,
    Typography.headlineFontSizeFunctionalTabletXl,
    Typography.headlineFontSizeFunctionalTablet2xl,
    Typography.headlineFontSizeFunctionalTablet3xl,
)

fun getTypographyFunctionalTablet(
    body: BodyTypography = bodyTypographyFunctionalTablet,
    headline: HeadlineTypography = headlineTypographyFunctionalTablet,

    ): DBThemeTypography = DBThemeTypography(
    body = body,
    headline = headline,
)

val bodyTypographyRegularMobile = BodyTypography(
    Typography.bodyLineHeightRegularMobile3xs,
    Typography.bodyLineHeightRegularMobile2xs,
    Typography.bodyLineHeightRegularMobileXs,
    Typography.bodyLineHeightRegularMobileSm,
    Typography.bodyLineHeightRegularMobileMd,
    Typography.bodyLineHeightRegularMobileLg,
    Typography.bodyLineHeightRegularMobileXl,
    Typography.bodyLineHeightRegularMobile2xl,
    Typography.bodyLineHeightRegularMobile3xl,
    Typography.bodyFontSizeRegularMobile3xs,
    Typography.bodyFontSizeRegularMobile2xs,
    Typography.bodyFontSizeRegularMobileXs,
    Typography.bodyFontSizeRegularMobileSm,
    Typography.bodyFontSizeRegularMobileMd,
    Typography.bodyFontSizeRegularMobileLg,
    Typography.bodyFontSizeRegularMobileXl,
    Typography.bodyFontSizeRegularMobile2xl,
    Typography.bodyFontSizeRegularMobile3xl,
)
val headlineTypographyRegularMobile = HeadlineTypography(
    Typography.headlineLineHeightRegularMobile3xs,
    Typography.headlineLineHeightRegularMobile2xs,
    Typography.headlineLineHeightRegularMobileXs,
    Typography.headlineLineHeightRegularMobileSm,
    Typography.headlineLineHeightRegularMobileMd,
    Typography.headlineLineHeightRegularMobileLg,
    Typography.headlineLineHeightRegularMobileXl,
    Typography.headlineLineHeightRegularMobile2xl,
    Typography.headlineLineHeightRegularMobile3xl,
    Typography.headlineFontSizeRegularMobile3xs,
    Typography.headlineFontSizeRegularMobile2xs,
    Typography.headlineFontSizeRegularMobileXs,
    Typography.headlineFontSizeRegularMobileSm,
    Typography.headlineFontSizeRegularMobileMd,
    Typography.headlineFontSizeRegularMobileLg,
    Typography.headlineFontSizeRegularMobileXl,
    Typography.headlineFontSizeRegularMobile2xl,
    Typography.headlineFontSizeRegularMobile3xl,
)

fun getTypographyRegularMobile(
    body: BodyTypography = bodyTypographyRegularMobile,
    headline: HeadlineTypography = headlineTypographyRegularMobile,

    ): DBThemeTypography = DBThemeTypography(
    body = body,
    headline = headline,
)

val bodyTypographyRegularTablet = BodyTypography(
    Typography.bodyLineHeightRegularTablet3xs,
    Typography.bodyLineHeightRegularTablet2xs,
    Typography.bodyLineHeightRegularTabletXs,
    Typography.bodyLineHeightRegularTabletSm,
    Typography.bodyLineHeightRegularTabletMd,
    Typography.bodyLineHeightRegularTabletLg,
    Typography.bodyLineHeightRegularTabletXl,
    Typography.bodyLineHeightRegularTablet2xl,
    Typography.bodyLineHeightRegularTablet3xl,
    Typography.bodyFontSizeRegularTablet3xs,
    Typography.bodyFontSizeRegularTablet2xs,
    Typography.bodyFontSizeRegularTabletXs,
    Typography.bodyFontSizeRegularTabletSm,
    Typography.bodyFontSizeRegularTabletMd,
    Typography.bodyFontSizeRegularTabletLg,
    Typography.bodyFontSizeRegularTabletXl,
    Typography.bodyFontSizeRegularTablet2xl,
    Typography.bodyFontSizeRegularTablet3xl,
)
val headlineTypographyRegularTablet = HeadlineTypography(
    Typography.headlineLineHeightRegularTablet3xs,
    Typography.headlineLineHeightRegularTablet2xs,
    Typography.headlineLineHeightRegularTabletXs,
    Typography.headlineLineHeightRegularTabletSm,
    Typography.headlineLineHeightRegularTabletMd,
    Typography.headlineLineHeightRegularTabletLg,
    Typography.headlineLineHeightRegularTabletXl,
    Typography.headlineLineHeightRegularTablet2xl,
    Typography.headlineLineHeightRegularTablet3xl,
    Typography.headlineFontSizeRegularTablet3xs,
    Typography.headlineFontSizeRegularTablet2xs,
    Typography.headlineFontSizeRegularTabletXs,
    Typography.headlineFontSizeRegularTabletSm,
    Typography.headlineFontSizeRegularTabletMd,
    Typography.headlineFontSizeRegularTabletLg,
    Typography.headlineFontSizeRegularTabletXl,
    Typography.headlineFontSizeRegularTablet2xl,
    Typography.headlineFontSizeRegularTablet3xl,
)

fun getTypographyRegularTablet(
    body: BodyTypography = bodyTypographyRegularTablet,
    headline: HeadlineTypography = headlineTypographyRegularTablet,

    ): DBThemeTypography = DBThemeTypography(
    body = body,
    headline = headline,
)

val bodyTypographyExpressiveMobile = BodyTypography(
    Typography.bodyLineHeightExpressiveMobile3xs,
    Typography.bodyLineHeightExpressiveMobile2xs,
    Typography.bodyLineHeightExpressiveMobileXs,
    Typography.bodyLineHeightExpressiveMobileSm,
    Typography.bodyLineHeightExpressiveMobileMd,
    Typography.bodyLineHeightExpressiveMobileLg,
    Typography.bodyLineHeightExpressiveMobileXl,
    Typography.bodyLineHeightExpressiveMobile2xl,
    Typography.bodyLineHeightExpressiveMobile3xl,
    Typography.bodyFontSizeExpressiveMobile3xs,
    Typography.bodyFontSizeExpressiveMobile2xs,
    Typography.bodyFontSizeExpressiveMobileXs,
    Typography.bodyFontSizeExpressiveMobileSm,
    Typography.bodyFontSizeExpressiveMobileMd,
    Typography.bodyFontSizeExpressiveMobileLg,
    Typography.bodyFontSizeExpressiveMobileXl,
    Typography.bodyFontSizeExpressiveMobile2xl,
    Typography.bodyFontSizeExpressiveMobile3xl,
)
val headlineTypographyExpressiveMobile = HeadlineTypography(
    Typography.headlineLineHeightExpressiveMobile3xs,
    Typography.headlineLineHeightExpressiveMobile2xs,
    Typography.headlineLineHeightExpressiveMobileXs,
    Typography.headlineLineHeightExpressiveMobileSm,
    Typography.headlineLineHeightExpressiveMobileMd,
    Typography.headlineLineHeightExpressiveMobileLg,
    Typography.headlineLineHeightExpressiveMobileXl,
    Typography.headlineLineHeightExpressiveMobile2xl,
    Typography.headlineLineHeightExpressiveMobile3xl,
    Typography.headlineFontSizeExpressiveMobile3xs,
    Typography.headlineFontSizeExpressiveMobile2xs,
    Typography.headlineFontSizeExpressiveMobileXs,
    Typography.headlineFontSizeExpressiveMobileSm,
    Typography.headlineFontSizeExpressiveMobileMd,
    Typography.headlineFontSizeExpressiveMobileLg,
    Typography.headlineFontSizeExpressiveMobileXl,
    Typography.headlineFontSizeExpressiveMobile2xl,
    Typography.headlineFontSizeExpressiveMobile3xl,
)

fun getTypographyExpressiveMobile(
    body: BodyTypography = bodyTypographyExpressiveMobile,
    headline: HeadlineTypography = headlineTypographyExpressiveMobile,

    ): DBThemeTypography = DBThemeTypography(
    body = body,
    headline = headline,
)

val bodyTypographyExpressiveTablet = BodyTypography(
    Typography.bodyLineHeightExpressiveTablet3xs,
    Typography.bodyLineHeightExpressiveTablet2xs,
    Typography.bodyLineHeightExpressiveTabletXs,
    Typography.bodyLineHeightExpressiveTabletSm,
    Typography.bodyLineHeightExpressiveTabletMd,
    Typography.bodyLineHeightExpressiveTabletLg,
    Typography.bodyLineHeightExpressiveTabletXl,
    Typography.bodyLineHeightExpressiveTablet2xl,
    Typography.bodyLineHeightExpressiveTablet3xl,
    Typography.bodyFontSizeExpressiveTablet3xs,
    Typography.bodyFontSizeExpressiveTablet2xs,
    Typography.bodyFontSizeExpressiveTabletXs,
    Typography.bodyFontSizeExpressiveTabletSm,
    Typography.bodyFontSizeExpressiveTabletMd,
    Typography.bodyFontSizeExpressiveTabletLg,
    Typography.bodyFontSizeExpressiveTabletXl,
    Typography.bodyFontSizeExpressiveTablet2xl,
    Typography.bodyFontSizeExpressiveTablet3xl,
)
val headlineTypographyExpressiveTablet = HeadlineTypography(
    Typography.headlineLineHeightExpressiveTablet3xs,
    Typography.headlineLineHeightExpressiveTablet2xs,
    Typography.headlineLineHeightExpressiveTabletXs,
    Typography.headlineLineHeightExpressiveTabletSm,
    Typography.headlineLineHeightExpressiveTabletMd,
    Typography.headlineLineHeightExpressiveTabletLg,
    Typography.headlineLineHeightExpressiveTabletXl,
    Typography.headlineLineHeightExpressiveTablet2xl,
    Typography.headlineLineHeightExpressiveTablet3xl,
    Typography.headlineFontSizeExpressiveTablet3xs,
    Typography.headlineFontSizeExpressiveTablet2xs,
    Typography.headlineFontSizeExpressiveTabletXs,
    Typography.headlineFontSizeExpressiveTabletSm,
    Typography.headlineFontSizeExpressiveTabletMd,
    Typography.headlineFontSizeExpressiveTabletLg,
    Typography.headlineFontSizeExpressiveTabletXl,
    Typography.headlineFontSizeExpressiveTablet2xl,
    Typography.headlineFontSizeExpressiveTablet3xl,
)

fun getTypographyExpressiveTablet(
    body: BodyTypography = bodyTypographyExpressiveTablet,
    headline: HeadlineTypography = headlineTypographyExpressiveTablet,

    ): DBThemeTypography = DBThemeTypography(
    body = body,
    headline = headline,
)

data class DBThemeTextStyles(
    val h1: TextStyle,
    val h2: TextStyle,
    val h3: TextStyle,
    val h4: TextStyle,
    val h5: TextStyle,
    val h6: TextStyle,
    val body: TextStyle,
    val body3xl: TextStyle,
    val body2xl: TextStyle,
    val bodyXl: TextStyle,
    val bodyLg: TextStyle,
    val bodyMd: TextStyle,
    val bodySm: TextStyle,
    val bodyXs: TextStyle,
    val body2xs: TextStyle,
    val body3xs: TextStyle,
)

fun getTextStyles(typo: DBThemeTypography): DBThemeTextStyles = DBThemeTextStyles(
    TextStyle(
        fontFamily = Fonts.headBlack,
        fontWeight = FontWeight.Black,
        fontSize = typo.headline.fontSizeXl,
        lineHeight = typo.headline.lineHeightXl
    ),
    TextStyle(
        fontFamily = Fonts.headBlack,
        fontWeight = FontWeight.Black,
        fontSize = typo.headline.fontSizeLg,
        lineHeight = typo.headline.lineHeightLg
    ),
    TextStyle(
        fontFamily = Fonts.headBlack,
        fontWeight = FontWeight.Black,
        fontSize = typo.headline.fontSizeMd,
        lineHeight = typo.headline.lineHeightMd
    ),
    TextStyle(
        fontFamily = Fonts.headBlack,
        fontWeight = FontWeight.Black,
        fontSize = typo.headline.fontSizeSm,
        lineHeight = typo.headline.lineHeightSm
    ),
    TextStyle(
        fontFamily = Fonts.headBlack,
        fontWeight = FontWeight.Black,
        fontSize = typo.headline.fontSizeXs,
        lineHeight = typo.headline.lineHeightXs
    ),
    TextStyle(
        fontFamily = Fonts.headBlack,
        fontWeight = FontWeight.Black,
        fontSize = typo.headline.fontSize2xs,
        lineHeight = typo.headline.lineHeight2xs
    ),
    TextStyle(
        fontFamily = Fonts.sansRegular,
        fontWeight = FontWeight.Normal,
        fontSize = typo.body.fontSizeMd,
        lineHeight = typo.body.lineHeightMd
    ),
    TextStyle(
        fontFamily = Fonts.sansRegular,
        fontWeight = FontWeight.Normal,
        fontSize = typo.body.fontSize3xl,
        lineHeight = typo.body.lineHeight3xl
    ),
    TextStyle(
        fontFamily = Fonts.sansRegular,
        fontWeight = FontWeight.Normal,
        fontSize = typo.body.fontSize2xl,
        lineHeight = typo.body.lineHeight2xl
    ),
    TextStyle(
        fontFamily = Fonts.sansRegular,
        fontWeight = FontWeight.Normal,
        fontSize = typo.body.fontSizeXl,
        lineHeight = typo.body.lineHeightXl
    ),
    TextStyle(
        fontFamily = Fonts.sansRegular,
        fontWeight = FontWeight.Normal,
        fontSize = typo.body.fontSizeLg,
        lineHeight = typo.body.lineHeightLg
    ),
    TextStyle(
        fontFamily = Fonts.sansRegular,
        fontWeight = FontWeight.Normal,
        fontSize = typo.body.fontSizeMd,
        lineHeight = typo.body.lineHeightMd
    ),
    TextStyle(
        fontFamily = Fonts.sansRegular,
        fontWeight = FontWeight.Normal,
        fontSize = typo.body.fontSizeSm,
        lineHeight = typo.body.lineHeightSm
    ),
    TextStyle(
        fontFamily = Fonts.sansRegular,
        fontWeight = FontWeight.Normal,
        fontSize = typo.body.fontSizeXs,
        lineHeight = typo.body.lineHeightXs
    ),
    TextStyle(
        fontFamily = Fonts.sansRegular,
        fontWeight = FontWeight.Normal,
        fontSize = typo.body.fontSize2xs,
        lineHeight = typo.body.lineHeight2xs
    ),
    TextStyle(
        fontFamily = Fonts.sansRegular,
        fontWeight = FontWeight.Normal,
        fontSize = typo.body.fontSize3xs,
        lineHeight = typo.body.lineHeight3xs
    ),
)

val LocalTypography = staticCompositionLocalOf { getTextStyles(getTypographyRegularMobile()) }

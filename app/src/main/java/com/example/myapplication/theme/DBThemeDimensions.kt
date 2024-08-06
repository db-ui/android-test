package com.example.myapplication.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp

data class SpacingDimensions(
    val responsive3xs: Dp,
    val responsive2xs: Dp,
    val responsiveXs: Dp,
    val responsiveSm: Dp,
    val responsiveMd: Dp,
    val responsiveLg: Dp,
    val responsiveXl: Dp,
    val responsive2xl: Dp,
    val responsive3xl: Dp,
    val fixed3xs: Dp,
    val fixed2xs: Dp,
    val fixedXs: Dp,
    val fixedSm: Dp,
    val fixedMd: Dp,
    val fixedLg: Dp,
    val fixedXl: Dp,
    val fixed2xl: Dp,
    val fixed3xl: Dp,
)

data class SizingDimensions(
    val base3xs: Dp,
    val base2xs: Dp,
    val baseXs: Dp,
    val baseSm: Dp,
    val baseMd: Dp,
    val baseLg: Dp,
    val baseXl: Dp,
    val base2xl: Dp,
    val base3xl: Dp,
)

data class BorderDimensions(
    val height3xs: Dp,
    val height2xs: Dp,
    val heightXs: Dp,
    val heightSm: Dp,
    val heightMd: Dp,
    val heightLg: Dp,
    val heightXl: Dp,
    val height2xl: Dp,
    val height3xl: Dp,
    val radius3xs: Dp,
    val radius2xs: Dp,
    val radiusXs: Dp,
    val radiusSm: Dp,
    val radiusMd: Dp,
    val radiusLg: Dp,
    val radiusXl: Dp,
    val radius2xl: Dp,
    val radius3xl: Dp,
)

data class DBThemeDimensions(
    val spacing: SpacingDimensions,
    val sizing: SizingDimensions,
    val border: BorderDimensions,
)

val spacingDimensionsFunctionalMobile = SpacingDimensions(
    Dimensions.spacingResponsiveFunctionalMobile3xs,
    Dimensions.spacingResponsiveFunctionalMobile2xs,
    Dimensions.spacingResponsiveFunctionalMobileXs,
    Dimensions.spacingResponsiveFunctionalMobileSm,
    Dimensions.spacingResponsiveFunctionalMobileMd,
    Dimensions.spacingResponsiveFunctionalMobileLg,
    Dimensions.spacingResponsiveFunctionalMobileXl,
    Dimensions.spacingResponsiveFunctionalMobile2xl,
    Dimensions.spacingResponsiveFunctionalMobile3xl,
    Dimensions.spacingFixedFunctional3xs,
    Dimensions.spacingFixedFunctional2xs,
    Dimensions.spacingFixedFunctionalXs,
    Dimensions.spacingFixedFunctionalSm,
    Dimensions.spacingFixedFunctionalMd,
    Dimensions.spacingFixedFunctionalLg,
    Dimensions.spacingFixedFunctionalXl,
    Dimensions.spacingFixedFunctional2xl,
    Dimensions.spacingFixedFunctional3xl,
)
val sizingDimensionsFunctionalMobile = SizingDimensions(
    Dimensions.sizingFunctional3xs,
    Dimensions.sizingFunctional2xs,
    Dimensions.sizingFunctionalXs,
    Dimensions.sizingFunctionalSm,
    Dimensions.sizingFunctionalMd,
    Dimensions.sizingFunctionalLg,
    Dimensions.sizingFunctionalXl,
    Dimensions.sizingFunctional2xl,
    Dimensions.sizingFunctional3xl,
)
val borderDimensionsFunctionalMobile = BorderDimensions(
    Dimensions.borderHeight3xs,
    Dimensions.borderHeight2xs,
    Dimensions.borderHeightXs,
    Dimensions.borderHeightSm,
    Dimensions.borderHeightMd,
    Dimensions.borderHeightLg,
    Dimensions.borderHeightXl,
    Dimensions.borderHeight2xl,
    Dimensions.borderHeight3xl,
    Dimensions.borderRadius3xs,
    Dimensions.borderRadius2xs,
    Dimensions.borderRadiusXs,
    Dimensions.borderRadiusSm,
    Dimensions.borderRadiusMd,
    Dimensions.borderRadiusLg,
    Dimensions.borderRadiusXl,
    Dimensions.borderRadius2xl,
    Dimensions.borderRadius3xl,
)

fun getDimensionsFunctionalMobile(
    spacing: SpacingDimensions = spacingDimensionsFunctionalMobile,
    sizing: SizingDimensions = sizingDimensionsFunctionalMobile,
    border: BorderDimensions = borderDimensionsFunctionalMobile,

    ): DBThemeDimensions = DBThemeDimensions(
    spacing = spacing,
    sizing = sizing,
    border = border,
)

val spacingDimensionsFunctionalTablet = SpacingDimensions(
    Dimensions.spacingResponsiveFunctionalTablet3xs,
    Dimensions.spacingResponsiveFunctionalTablet2xs,
    Dimensions.spacingResponsiveFunctionalTabletXs,
    Dimensions.spacingResponsiveFunctionalTabletSm,
    Dimensions.spacingResponsiveFunctionalTabletMd,
    Dimensions.spacingResponsiveFunctionalTabletLg,
    Dimensions.spacingResponsiveFunctionalTabletXl,
    Dimensions.spacingResponsiveFunctionalTablet2xl,
    Dimensions.spacingResponsiveFunctionalTablet3xl,
    Dimensions.spacingFixedFunctional3xs,
    Dimensions.spacingFixedFunctional2xs,
    Dimensions.spacingFixedFunctionalXs,
    Dimensions.spacingFixedFunctionalSm,
    Dimensions.spacingFixedFunctionalMd,
    Dimensions.spacingFixedFunctionalLg,
    Dimensions.spacingFixedFunctionalXl,
    Dimensions.spacingFixedFunctional2xl,
    Dimensions.spacingFixedFunctional3xl,
)
val sizingDimensionsFunctionalTablet = SizingDimensions(
    Dimensions.sizingFunctional3xs,
    Dimensions.sizingFunctional2xs,
    Dimensions.sizingFunctionalXs,
    Dimensions.sizingFunctionalSm,
    Dimensions.sizingFunctionalMd,
    Dimensions.sizingFunctionalLg,
    Dimensions.sizingFunctionalXl,
    Dimensions.sizingFunctional2xl,
    Dimensions.sizingFunctional3xl,
)
val borderDimensionsFunctionalTablet = BorderDimensions(
    Dimensions.borderHeight3xs,
    Dimensions.borderHeight2xs,
    Dimensions.borderHeightXs,
    Dimensions.borderHeightSm,
    Dimensions.borderHeightMd,
    Dimensions.borderHeightLg,
    Dimensions.borderHeightXl,
    Dimensions.borderHeight2xl,
    Dimensions.borderHeight3xl,
    Dimensions.borderRadius3xs,
    Dimensions.borderRadius2xs,
    Dimensions.borderRadiusXs,
    Dimensions.borderRadiusSm,
    Dimensions.borderRadiusMd,
    Dimensions.borderRadiusLg,
    Dimensions.borderRadiusXl,
    Dimensions.borderRadius2xl,
    Dimensions.borderRadius3xl,
)

fun getDimensionsFunctionalTablet(
    spacing: SpacingDimensions = spacingDimensionsFunctionalTablet,
    sizing: SizingDimensions = sizingDimensionsFunctionalTablet,
    border: BorderDimensions = borderDimensionsFunctionalTablet,

    ): DBThemeDimensions = DBThemeDimensions(
    spacing = spacing,
    sizing = sizing,
    border = border,
)

val spacingDimensionsRegularMobile = SpacingDimensions(
    Dimensions.spacingResponsiveRegularMobile3xs,
    Dimensions.spacingResponsiveRegularMobile2xs,
    Dimensions.spacingResponsiveRegularMobileXs,
    Dimensions.spacingResponsiveRegularMobileSm,
    Dimensions.spacingResponsiveRegularMobileMd,
    Dimensions.spacingResponsiveRegularMobileLg,
    Dimensions.spacingResponsiveRegularMobileXl,
    Dimensions.spacingResponsiveRegularMobile2xl,
    Dimensions.spacingResponsiveRegularMobile3xl,
    Dimensions.spacingFixedRegular3xs,
    Dimensions.spacingFixedRegular2xs,
    Dimensions.spacingFixedRegularXs,
    Dimensions.spacingFixedRegularSm,
    Dimensions.spacingFixedRegularMd,
    Dimensions.spacingFixedRegularLg,
    Dimensions.spacingFixedRegularXl,
    Dimensions.spacingFixedRegular2xl,
    Dimensions.spacingFixedRegular3xl,
)
val sizingDimensionsRegularMobile = SizingDimensions(
    Dimensions.sizingRegular3xs,
    Dimensions.sizingRegular2xs,
    Dimensions.sizingRegularXs,
    Dimensions.sizingRegularSm,
    Dimensions.sizingRegularMd,
    Dimensions.sizingRegularLg,
    Dimensions.sizingRegularXl,
    Dimensions.sizingRegular2xl,
    Dimensions.sizingRegular3xl,
)
val borderDimensionsRegularMobile = BorderDimensions(
    Dimensions.borderHeight3xs,
    Dimensions.borderHeight2xs,
    Dimensions.borderHeightXs,
    Dimensions.borderHeightSm,
    Dimensions.borderHeightMd,
    Dimensions.borderHeightLg,
    Dimensions.borderHeightXl,
    Dimensions.borderHeight2xl,
    Dimensions.borderHeight3xl,
    Dimensions.borderRadius3xs,
    Dimensions.borderRadius2xs,
    Dimensions.borderRadiusXs,
    Dimensions.borderRadiusSm,
    Dimensions.borderRadiusMd,
    Dimensions.borderRadiusLg,
    Dimensions.borderRadiusXl,
    Dimensions.borderRadius2xl,
    Dimensions.borderRadius3xl,
)

fun getDimensionsRegularMobile(
    spacing: SpacingDimensions = spacingDimensionsRegularMobile,
    sizing: SizingDimensions = sizingDimensionsRegularMobile,
    border: BorderDimensions = borderDimensionsRegularMobile,

    ): DBThemeDimensions = DBThemeDimensions(
    spacing = spacing,
    sizing = sizing,
    border = border,
)

val spacingDimensionsRegularTablet = SpacingDimensions(
    Dimensions.spacingResponsiveRegularTablet3xs,
    Dimensions.spacingResponsiveRegularTablet2xs,
    Dimensions.spacingResponsiveRegularTabletXs,
    Dimensions.spacingResponsiveRegularTabletSm,
    Dimensions.spacingResponsiveRegularTabletMd,
    Dimensions.spacingResponsiveRegularTabletLg,
    Dimensions.spacingResponsiveRegularTabletXl,
    Dimensions.spacingResponsiveRegularTablet2xl,
    Dimensions.spacingResponsiveRegularTablet3xl,
    Dimensions.spacingFixedRegular3xs,
    Dimensions.spacingFixedRegular2xs,
    Dimensions.spacingFixedRegularXs,
    Dimensions.spacingFixedRegularSm,
    Dimensions.spacingFixedRegularMd,
    Dimensions.spacingFixedRegularLg,
    Dimensions.spacingFixedRegularXl,
    Dimensions.spacingFixedRegular2xl,
    Dimensions.spacingFixedRegular3xl,
)
val sizingDimensionsRegularTablet = SizingDimensions(
    Dimensions.sizingRegular3xs,
    Dimensions.sizingRegular2xs,
    Dimensions.sizingRegularXs,
    Dimensions.sizingRegularSm,
    Dimensions.sizingRegularMd,
    Dimensions.sizingRegularLg,
    Dimensions.sizingRegularXl,
    Dimensions.sizingRegular2xl,
    Dimensions.sizingRegular3xl,
)
val borderDimensionsRegularTablet = BorderDimensions(
    Dimensions.borderHeight3xs,
    Dimensions.borderHeight2xs,
    Dimensions.borderHeightXs,
    Dimensions.borderHeightSm,
    Dimensions.borderHeightMd,
    Dimensions.borderHeightLg,
    Dimensions.borderHeightXl,
    Dimensions.borderHeight2xl,
    Dimensions.borderHeight3xl,
    Dimensions.borderRadius3xs,
    Dimensions.borderRadius2xs,
    Dimensions.borderRadiusXs,
    Dimensions.borderRadiusSm,
    Dimensions.borderRadiusMd,
    Dimensions.borderRadiusLg,
    Dimensions.borderRadiusXl,
    Dimensions.borderRadius2xl,
    Dimensions.borderRadius3xl,
)

fun getDimensionsRegularTablet(
    spacing: SpacingDimensions = spacingDimensionsRegularTablet,
    sizing: SizingDimensions = sizingDimensionsRegularTablet,
    border: BorderDimensions = borderDimensionsRegularTablet,

    ): DBThemeDimensions = DBThemeDimensions(
    spacing = spacing,
    sizing = sizing,
    border = border,
)

val spacingDimensionsExpressiveMobile = SpacingDimensions(
    Dimensions.spacingResponsiveExpressiveMobile3xs,
    Dimensions.spacingResponsiveExpressiveMobile2xs,
    Dimensions.spacingResponsiveExpressiveMobileXs,
    Dimensions.spacingResponsiveExpressiveMobileSm,
    Dimensions.spacingResponsiveExpressiveMobileMd,
    Dimensions.spacingResponsiveExpressiveMobileLg,
    Dimensions.spacingResponsiveExpressiveMobileXl,
    Dimensions.spacingResponsiveExpressiveMobile2xl,
    Dimensions.spacingResponsiveExpressiveMobile3xl,
    Dimensions.spacingFixedExpressive3xs,
    Dimensions.spacingFixedExpressive2xs,
    Dimensions.spacingFixedExpressiveXs,
    Dimensions.spacingFixedExpressiveSm,
    Dimensions.spacingFixedExpressiveMd,
    Dimensions.spacingFixedExpressiveLg,
    Dimensions.spacingFixedExpressiveXl,
    Dimensions.spacingFixedExpressive2xl,
    Dimensions.spacingFixedExpressive3xl,
)
val sizingDimensionsExpressiveMobile = SizingDimensions(
    Dimensions.sizingExpressive3xs,
    Dimensions.sizingExpressive2xs,
    Dimensions.sizingExpressiveXs,
    Dimensions.sizingExpressiveSm,
    Dimensions.sizingExpressiveMd,
    Dimensions.sizingExpressiveLg,
    Dimensions.sizingExpressiveXl,
    Dimensions.sizingExpressive2xl,
    Dimensions.sizingExpressive3xl,
)
val borderDimensionsExpressiveMobile = BorderDimensions(
    Dimensions.borderHeight3xs,
    Dimensions.borderHeight2xs,
    Dimensions.borderHeightXs,
    Dimensions.borderHeightSm,
    Dimensions.borderHeightMd,
    Dimensions.borderHeightLg,
    Dimensions.borderHeightXl,
    Dimensions.borderHeight2xl,
    Dimensions.borderHeight3xl,
    Dimensions.borderRadius3xs,
    Dimensions.borderRadius2xs,
    Dimensions.borderRadiusXs,
    Dimensions.borderRadiusSm,
    Dimensions.borderRadiusMd,
    Dimensions.borderRadiusLg,
    Dimensions.borderRadiusXl,
    Dimensions.borderRadius2xl,
    Dimensions.borderRadius3xl,
)

fun getDimensionsExpressiveMobile(
    spacing: SpacingDimensions = spacingDimensionsExpressiveMobile,
    sizing: SizingDimensions = sizingDimensionsExpressiveMobile,
    border: BorderDimensions = borderDimensionsExpressiveMobile,

    ): DBThemeDimensions = DBThemeDimensions(
    spacing = spacing,
    sizing = sizing,
    border = border,
)

val spacingDimensionsExpressiveTablet = SpacingDimensions(
    Dimensions.spacingResponsiveExpressiveTablet3xs,
    Dimensions.spacingResponsiveExpressiveTablet2xs,
    Dimensions.spacingResponsiveExpressiveTabletXs,
    Dimensions.spacingResponsiveExpressiveTabletSm,
    Dimensions.spacingResponsiveExpressiveTabletMd,
    Dimensions.spacingResponsiveExpressiveTabletLg,
    Dimensions.spacingResponsiveExpressiveTabletXl,
    Dimensions.spacingResponsiveExpressiveTablet2xl,
    Dimensions.spacingResponsiveExpressiveTablet3xl,
    Dimensions.spacingFixedExpressive3xs,
    Dimensions.spacingFixedExpressive2xs,
    Dimensions.spacingFixedExpressiveXs,
    Dimensions.spacingFixedExpressiveSm,
    Dimensions.spacingFixedExpressiveMd,
    Dimensions.spacingFixedExpressiveLg,
    Dimensions.spacingFixedExpressiveXl,
    Dimensions.spacingFixedExpressive2xl,
    Dimensions.spacingFixedExpressive3xl,
)
val sizingDimensionsExpressiveTablet = SizingDimensions(
    Dimensions.sizingExpressive3xs,
    Dimensions.sizingExpressive2xs,
    Dimensions.sizingExpressiveXs,
    Dimensions.sizingExpressiveSm,
    Dimensions.sizingExpressiveMd,
    Dimensions.sizingExpressiveLg,
    Dimensions.sizingExpressiveXl,
    Dimensions.sizingExpressive2xl,
    Dimensions.sizingExpressive3xl,
)
val borderDimensionsExpressiveTablet = BorderDimensions(
    Dimensions.borderHeight3xs,
    Dimensions.borderHeight2xs,
    Dimensions.borderHeightXs,
    Dimensions.borderHeightSm,
    Dimensions.borderHeightMd,
    Dimensions.borderHeightLg,
    Dimensions.borderHeightXl,
    Dimensions.borderHeight2xl,
    Dimensions.borderHeight3xl,
    Dimensions.borderRadius3xs,
    Dimensions.borderRadius2xs,
    Dimensions.borderRadiusXs,
    Dimensions.borderRadiusSm,
    Dimensions.borderRadiusMd,
    Dimensions.borderRadiusLg,
    Dimensions.borderRadiusXl,
    Dimensions.borderRadius2xl,
    Dimensions.borderRadius3xl,
)

fun getDimensionsExpressiveTablet(
    spacing: SpacingDimensions = spacingDimensionsExpressiveTablet,
    sizing: SizingDimensions = sizingDimensionsExpressiveTablet,
    border: BorderDimensions = borderDimensionsExpressiveTablet,

    ): DBThemeDimensions = DBThemeDimensions(
    spacing = spacing,
    sizing = sizing,
    border = border,
)

val LocalDimensions = staticCompositionLocalOf { getDimensionsRegularMobile() }

package com.example.myapplication.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.runtime.staticCompositionLocalOf

import androidx.compose.ui.graphics.Color

class NeutralColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class BrandColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class InformationalColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class WarningColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class SuccessfulColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class CriticalColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class YellowColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class OrangeColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class RedColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class PinkColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class VioletColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class BlueColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class CyanColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class TurquoiseColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class GreenColors(
    bgBasicLevel1Default: Color,
    bgBasicLevel1Hovered: Color,
    bgBasicLevel1Pressed: Color,
    bgBasicLevel2Default: Color,
    bgBasicLevel2Hovered: Color,
    bgBasicLevel2Pressed: Color,
    bgBasicLevel3Default: Color,
    bgBasicLevel3Hovered: Color,
    bgBasicLevel3Pressed: Color,
    bgBasicTransparentFullDefault: Color,
    bgBasicTransparentSemiDefault: Color,
    bgBasicTransparentHovered: Color,
    bgBasicTransparentPressed: Color,
    onBgBasicEmphasis100Default: Color,
    onBgBasicEmphasis100Hovered: Color,
    onBgBasicEmphasis100Pressed: Color,
    onBgBasicEmphasis90Default: Color,
    onBgBasicEmphasis90Hovered: Color,
    onBgBasicEmphasis90Pressed: Color,
    onBgBasicEmphasis80Default: Color,
    onBgBasicEmphasis80Hovered: Color,
    onBgBasicEmphasis80Pressed: Color,
    onBgBasicEmphasis70Default: Color,
    onBgBasicEmphasis70Hovered: Color,
    onBgBasicEmphasis70Pressed: Color,
    onBgBasicEmphasis60Default: Color,
    onBgBasicEmphasis60Hovered: Color,
    onBgBasicEmphasis60Pressed: Color,
    onBgBasicEmphasis50Default: Color,
    onBgBasicEmphasis50Hovered: Color,
    onBgBasicEmphasis50Pressed: Color,
    bgInvertedContrastMaxDefault: Color,
    bgInvertedContrastMaxHovered: Color,
    bgInvertedContrastMaxPressed: Color,
    bgInvertedContrastHighDefault: Color,
    bgInvertedContrastHighHovered: Color,
    bgInvertedContrastHighPressed: Color,
    bgInvertedContrastLowDefault: Color,
    bgInvertedContrastLowHovered: Color,
    bgInvertedContrastLowPressed: Color,
    onBgInvertedDefault: Color,
    onBgInvertedHovered: Color,
    onBgInvertedPressed: Color,
    onOriginDefault: Color,
    onOriginHovered: Color,
    onOriginPressed: Color,
    originDefault: Color,
    originHovered: Color,
    originPressed: Color,
) {
    var bgBasicLevel1Default by mutableStateOf(bgBasicLevel1Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Hovered by mutableStateOf(bgBasicLevel1Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel1Pressed by mutableStateOf(bgBasicLevel1Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Default by mutableStateOf(bgBasicLevel2Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Hovered by mutableStateOf(bgBasicLevel2Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel2Pressed by mutableStateOf(bgBasicLevel2Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Default by mutableStateOf(bgBasicLevel3Default, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Hovered by mutableStateOf(bgBasicLevel3Hovered, structuralEqualityPolicy())
        internal set
    var bgBasicLevel3Pressed by mutableStateOf(bgBasicLevel3Pressed, structuralEqualityPolicy())
        internal set
    var bgBasicTransparentFullDefault by mutableStateOf(
        bgBasicTransparentFullDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentSemiDefault by mutableStateOf(
        bgBasicTransparentSemiDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentHovered by mutableStateOf(
        bgBasicTransparentHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgBasicTransparentPressed by mutableStateOf(
        bgBasicTransparentPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Default by mutableStateOf(
        onBgBasicEmphasis100Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Hovered by mutableStateOf(
        onBgBasicEmphasis100Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis100Pressed by mutableStateOf(
        onBgBasicEmphasis100Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Default by mutableStateOf(
        onBgBasicEmphasis90Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Hovered by mutableStateOf(
        onBgBasicEmphasis90Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis90Pressed by mutableStateOf(
        onBgBasicEmphasis90Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Default by mutableStateOf(
        onBgBasicEmphasis80Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Hovered by mutableStateOf(
        onBgBasicEmphasis80Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis80Pressed by mutableStateOf(
        onBgBasicEmphasis80Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Default by mutableStateOf(
        onBgBasicEmphasis70Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Hovered by mutableStateOf(
        onBgBasicEmphasis70Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis70Pressed by mutableStateOf(
        onBgBasicEmphasis70Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Default by mutableStateOf(
        onBgBasicEmphasis60Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Hovered by mutableStateOf(
        onBgBasicEmphasis60Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis60Pressed by mutableStateOf(
        onBgBasicEmphasis60Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Default by mutableStateOf(
        onBgBasicEmphasis50Default,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Hovered by mutableStateOf(
        onBgBasicEmphasis50Hovered,
        structuralEqualityPolicy()
    )
        internal set
    var onBgBasicEmphasis50Pressed by mutableStateOf(
        onBgBasicEmphasis50Pressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxDefault by mutableStateOf(
        bgInvertedContrastMaxDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxHovered by mutableStateOf(
        bgInvertedContrastMaxHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastMaxPressed by mutableStateOf(
        bgInvertedContrastMaxPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighDefault by mutableStateOf(
        bgInvertedContrastHighDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighHovered by mutableStateOf(
        bgInvertedContrastHighHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastHighPressed by mutableStateOf(
        bgInvertedContrastHighPressed,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowDefault by mutableStateOf(
        bgInvertedContrastLowDefault,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowHovered by mutableStateOf(
        bgInvertedContrastLowHovered,
        structuralEqualityPolicy()
    )
        internal set
    var bgInvertedContrastLowPressed by mutableStateOf(
        bgInvertedContrastLowPressed,
        structuralEqualityPolicy()
    )
        internal set
    var onBgInvertedDefault by mutableStateOf(onBgInvertedDefault, structuralEqualityPolicy())
        internal set
    var onBgInvertedHovered by mutableStateOf(onBgInvertedHovered, structuralEqualityPolicy())
        internal set
    var onBgInvertedPressed by mutableStateOf(onBgInvertedPressed, structuralEqualityPolicy())
        internal set
    var onOriginDefault by mutableStateOf(onOriginDefault, structuralEqualityPolicy())
        internal set
    var onOriginHovered by mutableStateOf(onOriginHovered, structuralEqualityPolicy())
        internal set
    var onOriginPressed by mutableStateOf(onOriginPressed, structuralEqualityPolicy())
        internal set
    var originDefault by mutableStateOf(originDefault, structuralEqualityPolicy())
        internal set
    var originHovered by mutableStateOf(originHovered, structuralEqualityPolicy())
        internal set
    var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
        internal set
}

class DBThemeColorScheme(
    neutral: NeutralColors,
    brand: BrandColors,
    informational: InformationalColors,
    warning: WarningColors,
    successful: SuccessfulColors,
    critical: CriticalColors,
    yellow: YellowColors,
    orange: OrangeColors,
    red: RedColors,
    pink: PinkColors,
    violet: VioletColors,
    blue: BlueColors,
    cyan: CyanColors,
    turquoise: TurquoiseColors,
    green: GreenColors,
) {
    var neutral by mutableStateOf(neutral, structuralEqualityPolicy())
        internal set
    var brand by mutableStateOf(brand, structuralEqualityPolicy())
        internal set
    var informational by mutableStateOf(informational, structuralEqualityPolicy())
        internal set
    var warning by mutableStateOf(warning, structuralEqualityPolicy())
        internal set
    var successful by mutableStateOf(successful, structuralEqualityPolicy())
        internal set
    var critical by mutableStateOf(critical, structuralEqualityPolicy())
        internal set
    var yellow by mutableStateOf(yellow, structuralEqualityPolicy())
        internal set
    var orange by mutableStateOf(orange, structuralEqualityPolicy())
        internal set
    var red by mutableStateOf(red, structuralEqualityPolicy())
        internal set
    var pink by mutableStateOf(pink, structuralEqualityPolicy())
        internal set
    var violet by mutableStateOf(violet, structuralEqualityPolicy())
        internal set
    var blue by mutableStateOf(blue, structuralEqualityPolicy())
        internal set
    var cyan by mutableStateOf(cyan, structuralEqualityPolicy())
        internal set
    var turquoise by mutableStateOf(turquoise, structuralEqualityPolicy())
        internal set
    var green by mutableStateOf(green, structuralEqualityPolicy())
        internal set
}

val NeutralColorsDark = NeutralColors(
    Colors.neutral3,
    Colors.neutral4,
    Colors.neutral5,
    Colors.neutral2,
    Colors.neutral3,
    Colors.neutral4,
    Colors.neutral1,
    Colors.neutral2,
    Colors.neutral3,
    Colors.neutral9.copy(1f),
    Colors.neutral9.copy(0.84f),
    Colors.neutral9.copy(0.76f),
    Colors.neutral9.copy(0.68f),
    Colors.neutral12,
    Colors.neutral11,
    Colors.neutral10,
    Colors.neutral10,
    Colors.neutral9,
    Colors.neutral8,
    Colors.neutral9,
    Colors.neutral8,
    Colors.neutral7,
    Colors.neutral8,
    Colors.neutral7,
    Colors.neutral6,
    Colors.neutral6,
    Colors.neutral5,
    Colors.neutral4,
    Colors.neutral5,
    Colors.neutral4,
    Colors.neutral3,
    Colors.neutral12,
    Colors.neutral11,
    Colors.neutral10,
    Colors.neutral9,
    Colors.neutral8,
    Colors.neutral7,
    Colors.neutral8,
    Colors.neutral7,
    Colors.neutral6,
    Colors.neutral3,
    Colors.neutral4,
    Colors.neutral5,
    Colors.neutralOnOriginDefaultDark,
    Colors.neutralOnOriginHoveredDark,
    Colors.neutralOnOriginPressedDark,
    Colors.neutralOriginDefaultDark,
    Colors.neutralOriginHoveredDark,
    Colors.neutralOriginPressedDark,
)
val BrandColorsDark = BrandColors(
    Colors.brand3,
    Colors.brand4,
    Colors.brand5,
    Colors.brand2,
    Colors.brand3,
    Colors.brand4,
    Colors.brand1,
    Colors.brand2,
    Colors.brand3,
    Colors.brand9.copy(1f),
    Colors.brand9.copy(0.84f),
    Colors.brand9.copy(0.76f),
    Colors.brand9.copy(0.68f),
    Colors.brand12,
    Colors.brand11,
    Colors.brand10,
    Colors.brand10,
    Colors.brand9,
    Colors.brand8,
    Colors.brand9,
    Colors.brand8,
    Colors.brand7,
    Colors.brand8,
    Colors.brand7,
    Colors.brand6,
    Colors.brand6,
    Colors.brand5,
    Colors.brand4,
    Colors.brand5,
    Colors.brand4,
    Colors.brand3,
    Colors.brand12,
    Colors.brand11,
    Colors.brand10,
    Colors.brand9,
    Colors.brand8,
    Colors.brand7,
    Colors.brand8,
    Colors.brand7,
    Colors.brand6,
    Colors.brand3,
    Colors.brand4,
    Colors.brand5,
    Colors.brandOnOriginDefaultDark,
    Colors.brandOnOriginHoveredDark,
    Colors.brandOnOriginPressedDark,
    Colors.brandOriginDefaultDark,
    Colors.brandOriginHoveredDark,
    Colors.brandOriginPressedDark,
)
val InformationalColorsDark = InformationalColors(
    Colors.informational3,
    Colors.informational4,
    Colors.informational5,
    Colors.informational2,
    Colors.informational3,
    Colors.informational4,
    Colors.informational1,
    Colors.informational2,
    Colors.informational3,
    Colors.informational9.copy(1f),
    Colors.informational9.copy(0.84f),
    Colors.informational9.copy(0.76f),
    Colors.informational9.copy(0.68f),
    Colors.informational12,
    Colors.informational11,
    Colors.informational10,
    Colors.informational10,
    Colors.informational9,
    Colors.informational8,
    Colors.informational9,
    Colors.informational8,
    Colors.informational7,
    Colors.informational8,
    Colors.informational7,
    Colors.informational6,
    Colors.informational6,
    Colors.informational5,
    Colors.informational4,
    Colors.informational5,
    Colors.informational4,
    Colors.informational3,
    Colors.informational12,
    Colors.informational11,
    Colors.informational10,
    Colors.informational9,
    Colors.informational8,
    Colors.informational7,
    Colors.informational8,
    Colors.informational7,
    Colors.informational6,
    Colors.informational3,
    Colors.informational4,
    Colors.informational5,
    Colors.informationalOnOriginDefaultDark,
    Colors.informationalOnOriginHoveredDark,
    Colors.informationalOnOriginPressedDark,
    Colors.informationalOriginDefaultDark,
    Colors.informationalOriginHoveredDark,
    Colors.informationalOriginPressedDark,
)
val WarningColorsDark = WarningColors(
    Colors.warning3,
    Colors.warning4,
    Colors.warning5,
    Colors.warning2,
    Colors.warning3,
    Colors.warning4,
    Colors.warning1,
    Colors.warning2,
    Colors.warning3,
    Colors.warning9.copy(1f),
    Colors.warning9.copy(0.84f),
    Colors.warning9.copy(0.76f),
    Colors.warning9.copy(0.68f),
    Colors.warning12,
    Colors.warning11,
    Colors.warning10,
    Colors.warning10,
    Colors.warning9,
    Colors.warning8,
    Colors.warning9,
    Colors.warning8,
    Colors.warning7,
    Colors.warning8,
    Colors.warning7,
    Colors.warning6,
    Colors.warning6,
    Colors.warning5,
    Colors.warning4,
    Colors.warning5,
    Colors.warning4,
    Colors.warning3,
    Colors.warning12,
    Colors.warning11,
    Colors.warning10,
    Colors.warning9,
    Colors.warning8,
    Colors.warning7,
    Colors.warning8,
    Colors.warning7,
    Colors.warning6,
    Colors.warning3,
    Colors.warning4,
    Colors.warning5,
    Colors.warningOnOriginDefaultDark,
    Colors.warningOnOriginHoveredDark,
    Colors.warningOnOriginPressedDark,
    Colors.warningOriginDefaultDark,
    Colors.warningOriginHoveredDark,
    Colors.warningOriginPressedDark,
)
val SuccessfulColorsDark = SuccessfulColors(
    Colors.successful3,
    Colors.successful4,
    Colors.successful5,
    Colors.successful2,
    Colors.successful3,
    Colors.successful4,
    Colors.successful1,
    Colors.successful2,
    Colors.successful3,
    Colors.successful9.copy(1f),
    Colors.successful9.copy(0.84f),
    Colors.successful9.copy(0.76f),
    Colors.successful9.copy(0.68f),
    Colors.successful12,
    Colors.successful11,
    Colors.successful10,
    Colors.successful10,
    Colors.successful9,
    Colors.successful8,
    Colors.successful9,
    Colors.successful8,
    Colors.successful7,
    Colors.successful8,
    Colors.successful7,
    Colors.successful6,
    Colors.successful6,
    Colors.successful5,
    Colors.successful4,
    Colors.successful5,
    Colors.successful4,
    Colors.successful3,
    Colors.successful12,
    Colors.successful11,
    Colors.successful10,
    Colors.successful9,
    Colors.successful8,
    Colors.successful7,
    Colors.successful8,
    Colors.successful7,
    Colors.successful6,
    Colors.successful3,
    Colors.successful4,
    Colors.successful5,
    Colors.successfulOnOriginDefaultDark,
    Colors.successfulOnOriginHoveredDark,
    Colors.successfulOnOriginPressedDark,
    Colors.successfulOriginDefaultDark,
    Colors.successfulOriginHoveredDark,
    Colors.successfulOriginPressedDark,
)
val CriticalColorsDark = CriticalColors(
    Colors.critical3,
    Colors.critical4,
    Colors.critical5,
    Colors.critical2,
    Colors.critical3,
    Colors.critical4,
    Colors.critical1,
    Colors.critical2,
    Colors.critical3,
    Colors.critical9.copy(1f),
    Colors.critical9.copy(0.84f),
    Colors.critical9.copy(0.76f),
    Colors.critical9.copy(0.68f),
    Colors.critical12,
    Colors.critical11,
    Colors.critical10,
    Colors.critical10,
    Colors.critical9,
    Colors.critical8,
    Colors.critical9,
    Colors.critical8,
    Colors.critical7,
    Colors.critical8,
    Colors.critical7,
    Colors.critical6,
    Colors.critical6,
    Colors.critical5,
    Colors.critical4,
    Colors.critical5,
    Colors.critical4,
    Colors.critical3,
    Colors.critical12,
    Colors.critical11,
    Colors.critical10,
    Colors.critical9,
    Colors.critical8,
    Colors.critical7,
    Colors.critical8,
    Colors.critical7,
    Colors.critical6,
    Colors.critical3,
    Colors.critical4,
    Colors.critical5,
    Colors.criticalOnOriginDefaultDark,
    Colors.criticalOnOriginHoveredDark,
    Colors.criticalOnOriginPressedDark,
    Colors.criticalOriginDefaultDark,
    Colors.criticalOriginHoveredDark,
    Colors.criticalOriginPressedDark,
)
val YellowColorsDark = YellowColors(
    Colors.yellow3,
    Colors.yellow4,
    Colors.yellow5,
    Colors.yellow2,
    Colors.yellow3,
    Colors.yellow4,
    Colors.yellow1,
    Colors.yellow2,
    Colors.yellow3,
    Colors.yellow9.copy(1f),
    Colors.yellow9.copy(0.84f),
    Colors.yellow9.copy(0.76f),
    Colors.yellow9.copy(0.68f),
    Colors.yellow12,
    Colors.yellow11,
    Colors.yellow10,
    Colors.yellow10,
    Colors.yellow9,
    Colors.yellow8,
    Colors.yellow9,
    Colors.yellow8,
    Colors.yellow7,
    Colors.yellow8,
    Colors.yellow7,
    Colors.yellow6,
    Colors.yellow6,
    Colors.yellow5,
    Colors.yellow4,
    Colors.yellow5,
    Colors.yellow4,
    Colors.yellow3,
    Colors.yellow12,
    Colors.yellow11,
    Colors.yellow10,
    Colors.yellow9,
    Colors.yellow8,
    Colors.yellow7,
    Colors.yellow8,
    Colors.yellow7,
    Colors.yellow6,
    Colors.yellow3,
    Colors.yellow4,
    Colors.yellow5,
    Colors.yellowOnOriginDefaultDark,
    Colors.yellowOnOriginHoveredDark,
    Colors.yellowOnOriginPressedDark,
    Colors.yellowOriginDefaultDark,
    Colors.yellowOriginHoveredDark,
    Colors.yellowOriginPressedDark,
)
val OrangeColorsDark = OrangeColors(
    Colors.orange3,
    Colors.orange4,
    Colors.orange5,
    Colors.orange2,
    Colors.orange3,
    Colors.orange4,
    Colors.orange1,
    Colors.orange2,
    Colors.orange3,
    Colors.orange9.copy(1f),
    Colors.orange9.copy(0.84f),
    Colors.orange9.copy(0.76f),
    Colors.orange9.copy(0.68f),
    Colors.orange12,
    Colors.orange11,
    Colors.orange10,
    Colors.orange10,
    Colors.orange9,
    Colors.orange8,
    Colors.orange9,
    Colors.orange8,
    Colors.orange7,
    Colors.orange8,
    Colors.orange7,
    Colors.orange6,
    Colors.orange6,
    Colors.orange5,
    Colors.orange4,
    Colors.orange5,
    Colors.orange4,
    Colors.orange3,
    Colors.orange12,
    Colors.orange11,
    Colors.orange10,
    Colors.orange9,
    Colors.orange8,
    Colors.orange7,
    Colors.orange8,
    Colors.orange7,
    Colors.orange6,
    Colors.orange3,
    Colors.orange4,
    Colors.orange5,
    Colors.orangeOnOriginDefaultDark,
    Colors.orangeOnOriginHoveredDark,
    Colors.orangeOnOriginPressedDark,
    Colors.orangeOriginDefaultDark,
    Colors.orangeOriginHoveredDark,
    Colors.orangeOriginPressedDark,
)
val RedColorsDark = RedColors(
    Colors.red3,
    Colors.red4,
    Colors.red5,
    Colors.red2,
    Colors.red3,
    Colors.red4,
    Colors.red1,
    Colors.red2,
    Colors.red3,
    Colors.red9.copy(1f),
    Colors.red9.copy(0.84f),
    Colors.red9.copy(0.76f),
    Colors.red9.copy(0.68f),
    Colors.red12,
    Colors.red11,
    Colors.red10,
    Colors.red10,
    Colors.red9,
    Colors.red8,
    Colors.red9,
    Colors.red8,
    Colors.red7,
    Colors.red8,
    Colors.red7,
    Colors.red6,
    Colors.red6,
    Colors.red5,
    Colors.red4,
    Colors.red5,
    Colors.red4,
    Colors.red3,
    Colors.red12,
    Colors.red11,
    Colors.red10,
    Colors.red9,
    Colors.red8,
    Colors.red7,
    Colors.red8,
    Colors.red7,
    Colors.red6,
    Colors.red3,
    Colors.red4,
    Colors.red5,
    Colors.redOnOriginDefaultDark,
    Colors.redOnOriginHoveredDark,
    Colors.redOnOriginPressedDark,
    Colors.redOriginDefaultDark,
    Colors.redOriginHoveredDark,
    Colors.redOriginPressedDark,
)
val PinkColorsDark = PinkColors(
    Colors.pink3,
    Colors.pink4,
    Colors.pink5,
    Colors.pink2,
    Colors.pink3,
    Colors.pink4,
    Colors.pink1,
    Colors.pink2,
    Colors.pink3,
    Colors.pink9.copy(1f),
    Colors.pink9.copy(0.84f),
    Colors.pink9.copy(0.76f),
    Colors.pink9.copy(0.68f),
    Colors.pink12,
    Colors.pink11,
    Colors.pink10,
    Colors.pink10,
    Colors.pink9,
    Colors.pink8,
    Colors.pink9,
    Colors.pink8,
    Colors.pink7,
    Colors.pink8,
    Colors.pink7,
    Colors.pink6,
    Colors.pink6,
    Colors.pink5,
    Colors.pink4,
    Colors.pink5,
    Colors.pink4,
    Colors.pink3,
    Colors.pink12,
    Colors.pink11,
    Colors.pink10,
    Colors.pink9,
    Colors.pink8,
    Colors.pink7,
    Colors.pink8,
    Colors.pink7,
    Colors.pink6,
    Colors.pink3,
    Colors.pink4,
    Colors.pink5,
    Colors.pinkOnOriginDefaultDark,
    Colors.pinkOnOriginHoveredDark,
    Colors.pinkOnOriginPressedDark,
    Colors.pinkOriginDefaultDark,
    Colors.pinkOriginHoveredDark,
    Colors.pinkOriginPressedDark,
)
val VioletColorsDark = VioletColors(
    Colors.violet3,
    Colors.violet4,
    Colors.violet5,
    Colors.violet2,
    Colors.violet3,
    Colors.violet4,
    Colors.violet1,
    Colors.violet2,
    Colors.violet3,
    Colors.violet9.copy(1f),
    Colors.violet9.copy(0.84f),
    Colors.violet9.copy(0.76f),
    Colors.violet9.copy(0.68f),
    Colors.violet12,
    Colors.violet11,
    Colors.violet10,
    Colors.violet10,
    Colors.violet9,
    Colors.violet8,
    Colors.violet9,
    Colors.violet8,
    Colors.violet7,
    Colors.violet8,
    Colors.violet7,
    Colors.violet6,
    Colors.violet6,
    Colors.violet5,
    Colors.violet4,
    Colors.violet5,
    Colors.violet4,
    Colors.violet3,
    Colors.violet12,
    Colors.violet11,
    Colors.violet10,
    Colors.violet9,
    Colors.violet8,
    Colors.violet7,
    Colors.violet8,
    Colors.violet7,
    Colors.violet6,
    Colors.violet3,
    Colors.violet4,
    Colors.violet5,
    Colors.violetOnOriginDefaultDark,
    Colors.violetOnOriginHoveredDark,
    Colors.violetOnOriginPressedDark,
    Colors.violetOriginDefaultDark,
    Colors.violetOriginHoveredDark,
    Colors.violetOriginPressedDark,
)
val BlueColorsDark = BlueColors(
    Colors.blue3,
    Colors.blue4,
    Colors.blue5,
    Colors.blue2,
    Colors.blue3,
    Colors.blue4,
    Colors.blue1,
    Colors.blue2,
    Colors.blue3,
    Colors.blue9.copy(1f),
    Colors.blue9.copy(0.84f),
    Colors.blue9.copy(0.76f),
    Colors.blue9.copy(0.68f),
    Colors.blue12,
    Colors.blue11,
    Colors.blue10,
    Colors.blue10,
    Colors.blue9,
    Colors.blue8,
    Colors.blue9,
    Colors.blue8,
    Colors.blue7,
    Colors.blue8,
    Colors.blue7,
    Colors.blue6,
    Colors.blue6,
    Colors.blue5,
    Colors.blue4,
    Colors.blue5,
    Colors.blue4,
    Colors.blue3,
    Colors.blue12,
    Colors.blue11,
    Colors.blue10,
    Colors.blue9,
    Colors.blue8,
    Colors.blue7,
    Colors.blue8,
    Colors.blue7,
    Colors.blue6,
    Colors.blue3,
    Colors.blue4,
    Colors.blue5,
    Colors.blueOnOriginDefaultDark,
    Colors.blueOnOriginHoveredDark,
    Colors.blueOnOriginPressedDark,
    Colors.blueOriginDefaultDark,
    Colors.blueOriginHoveredDark,
    Colors.blueOriginPressedDark,
)
val CyanColorsDark = CyanColors(
    Colors.cyan3,
    Colors.cyan4,
    Colors.cyan5,
    Colors.cyan2,
    Colors.cyan3,
    Colors.cyan4,
    Colors.cyan1,
    Colors.cyan2,
    Colors.cyan3,
    Colors.cyan9.copy(1f),
    Colors.cyan9.copy(0.84f),
    Colors.cyan9.copy(0.76f),
    Colors.cyan9.copy(0.68f),
    Colors.cyan12,
    Colors.cyan11,
    Colors.cyan10,
    Colors.cyan10,
    Colors.cyan9,
    Colors.cyan8,
    Colors.cyan9,
    Colors.cyan8,
    Colors.cyan7,
    Colors.cyan8,
    Colors.cyan7,
    Colors.cyan6,
    Colors.cyan6,
    Colors.cyan5,
    Colors.cyan4,
    Colors.cyan5,
    Colors.cyan4,
    Colors.cyan3,
    Colors.cyan12,
    Colors.cyan11,
    Colors.cyan10,
    Colors.cyan9,
    Colors.cyan8,
    Colors.cyan7,
    Colors.cyan8,
    Colors.cyan7,
    Colors.cyan6,
    Colors.cyan3,
    Colors.cyan4,
    Colors.cyan5,
    Colors.cyanOnOriginDefaultDark,
    Colors.cyanOnOriginHoveredDark,
    Colors.cyanOnOriginPressedDark,
    Colors.cyanOriginDefaultDark,
    Colors.cyanOriginHoveredDark,
    Colors.cyanOriginPressedDark,
)
val TurquoiseColorsDark = TurquoiseColors(
    Colors.turquoise3,
    Colors.turquoise4,
    Colors.turquoise5,
    Colors.turquoise2,
    Colors.turquoise3,
    Colors.turquoise4,
    Colors.turquoise1,
    Colors.turquoise2,
    Colors.turquoise3,
    Colors.turquoise9.copy(1f),
    Colors.turquoise9.copy(0.84f),
    Colors.turquoise9.copy(0.76f),
    Colors.turquoise9.copy(0.68f),
    Colors.turquoise12,
    Colors.turquoise11,
    Colors.turquoise10,
    Colors.turquoise10,
    Colors.turquoise9,
    Colors.turquoise8,
    Colors.turquoise9,
    Colors.turquoise8,
    Colors.turquoise7,
    Colors.turquoise8,
    Colors.turquoise7,
    Colors.turquoise6,
    Colors.turquoise6,
    Colors.turquoise5,
    Colors.turquoise4,
    Colors.turquoise5,
    Colors.turquoise4,
    Colors.turquoise3,
    Colors.turquoise12,
    Colors.turquoise11,
    Colors.turquoise10,
    Colors.turquoise9,
    Colors.turquoise8,
    Colors.turquoise7,
    Colors.turquoise8,
    Colors.turquoise7,
    Colors.turquoise6,
    Colors.turquoise3,
    Colors.turquoise4,
    Colors.turquoise5,
    Colors.turquoiseOnOriginDefaultDark,
    Colors.turquoiseOnOriginHoveredDark,
    Colors.turquoiseOnOriginPressedDark,
    Colors.turquoiseOriginDefaultDark,
    Colors.turquoiseOriginHoveredDark,
    Colors.turquoiseOriginPressedDark,
)
val GreenColorsDark = GreenColors(
    Colors.green3,
    Colors.green4,
    Colors.green5,
    Colors.green2,
    Colors.green3,
    Colors.green4,
    Colors.green1,
    Colors.green2,
    Colors.green3,
    Colors.green9.copy(1f),
    Colors.green9.copy(0.84f),
    Colors.green9.copy(0.76f),
    Colors.green9.copy(0.68f),
    Colors.green12,
    Colors.green11,
    Colors.green10,
    Colors.green10,
    Colors.green9,
    Colors.green8,
    Colors.green9,
    Colors.green8,
    Colors.green7,
    Colors.green8,
    Colors.green7,
    Colors.green6,
    Colors.green6,
    Colors.green5,
    Colors.green4,
    Colors.green5,
    Colors.green4,
    Colors.green3,
    Colors.green12,
    Colors.green11,
    Colors.green10,
    Colors.green9,
    Colors.green8,
    Colors.green7,
    Colors.green8,
    Colors.green7,
    Colors.green6,
    Colors.green3,
    Colors.green4,
    Colors.green5,
    Colors.greenOnOriginDefaultDark,
    Colors.greenOnOriginHoveredDark,
    Colors.greenOnOriginPressedDark,
    Colors.greenOriginDefaultDark,
    Colors.greenOriginHoveredDark,
    Colors.greenOriginPressedDark,
)

fun getColorSchemeDark(
    neutral: NeutralColors = NeutralColorsDark,
    brand: BrandColors = BrandColorsDark,
    informational: InformationalColors = InformationalColorsDark,
    warning: WarningColors = WarningColorsDark,
    successful: SuccessfulColors = SuccessfulColorsDark,
    critical: CriticalColors = CriticalColorsDark,
    yellow: YellowColors = YellowColorsDark,
    orange: OrangeColors = OrangeColorsDark,
    red: RedColors = RedColorsDark,
    pink: PinkColors = PinkColorsDark,
    violet: VioletColors = VioletColorsDark,
    blue: BlueColors = BlueColorsDark,
    cyan: CyanColors = CyanColorsDark,
    turquoise: TurquoiseColors = TurquoiseColorsDark,
    green: GreenColors = GreenColorsDark,

    ): DBThemeColorScheme = DBThemeColorScheme(
    neutral = neutral,
    brand = brand,
    informational = informational,
    warning = warning,
    successful = successful,
    critical = critical,
    yellow = yellow,
    orange = orange,
    red = red,
    pink = pink,
    violet = violet,
    blue = blue,
    cyan = cyan,
    turquoise = turquoise,
    green = green,
)

val NeutralColorsLight = NeutralColors(
    Colors.neutral14,
    Colors.neutral13,
    Colors.neutral12,
    Colors.neutral13,
    Colors.neutral12,
    Colors.neutral11,
    Colors.neutral12,
    Colors.neutral11,
    Colors.neutral10,
    Colors.neutral6.copy(1f),
    Colors.neutral6.copy(0.84f),
    Colors.neutral6.copy(0.76f),
    Colors.neutral6.copy(0.68f),
    Colors.neutral3,
    Colors.neutral4,
    Colors.neutral5,
    Colors.neutral5,
    Colors.neutral6,
    Colors.neutral7,
    Colors.neutral6,
    Colors.neutral5,
    Colors.neutral4,
    Colors.neutral7,
    Colors.neutral6,
    Colors.neutral5,
    Colors.neutral10,
    Colors.neutral9,
    Colors.neutral8,
    Colors.neutral9,
    Colors.neutral8,
    Colors.neutral7,
    Colors.neutral3,
    Colors.neutral4,
    Colors.neutral5,
    Colors.neutral6,
    Colors.neutral5,
    Colors.neutral4,
    Colors.neutral7,
    Colors.neutral6,
    Colors.neutral5,
    Colors.neutral14,
    Colors.neutral13,
    Colors.neutral12,
    Colors.neutralOnOriginDefaultLight,
    Colors.neutralOnOriginHoveredLight,
    Colors.neutralOnOriginPressedLight,
    Colors.neutralOriginDefaultLight,
    Colors.neutralOriginHoveredLight,
    Colors.neutralOriginPressedLight,
)
val BrandColorsLight = BrandColors(
    Colors.brand14,
    Colors.brand13,
    Colors.brand12,
    Colors.brand13,
    Colors.brand12,
    Colors.brand11,
    Colors.brand12,
    Colors.brand11,
    Colors.brand10,
    Colors.brand6.copy(1f),
    Colors.brand6.copy(0.84f),
    Colors.brand6.copy(0.76f),
    Colors.brand6.copy(0.68f),
    Colors.brand3,
    Colors.brand4,
    Colors.brand5,
    Colors.brand5,
    Colors.brand6,
    Colors.brand7,
    Colors.brand6,
    Colors.brand5,
    Colors.brand4,
    Colors.brand7,
    Colors.brand6,
    Colors.brand5,
    Colors.brand10,
    Colors.brand9,
    Colors.brand8,
    Colors.brand9,
    Colors.brand8,
    Colors.brand7,
    Colors.brand3,
    Colors.brand4,
    Colors.brand5,
    Colors.brand6,
    Colors.brand5,
    Colors.brand4,
    Colors.brand7,
    Colors.brand6,
    Colors.brand5,
    Colors.brand14,
    Colors.brand13,
    Colors.brand12,
    Colors.brandOnOriginDefaultLight,
    Colors.brandOnOriginHoveredLight,
    Colors.brandOnOriginPressedLight,
    Colors.brandOriginDefaultLight,
    Colors.brandOriginHoveredLight,
    Colors.brandOriginPressedLight,
)
val InformationalColorsLight = InformationalColors(
    Colors.informational14,
    Colors.informational13,
    Colors.informational12,
    Colors.informational13,
    Colors.informational12,
    Colors.informational11,
    Colors.informational12,
    Colors.informational11,
    Colors.informational10,
    Colors.informational6.copy(1f),
    Colors.informational6.copy(0.84f),
    Colors.informational6.copy(0.76f),
    Colors.informational6.copy(0.68f),
    Colors.informational3,
    Colors.informational4,
    Colors.informational5,
    Colors.informational5,
    Colors.informational6,
    Colors.informational7,
    Colors.informational6,
    Colors.informational5,
    Colors.informational4,
    Colors.informational7,
    Colors.informational6,
    Colors.informational5,
    Colors.informational10,
    Colors.informational9,
    Colors.informational8,
    Colors.informational9,
    Colors.informational8,
    Colors.informational7,
    Colors.informational3,
    Colors.informational4,
    Colors.informational5,
    Colors.informational6,
    Colors.informational5,
    Colors.informational4,
    Colors.informational7,
    Colors.informational6,
    Colors.informational5,
    Colors.informational14,
    Colors.informational13,
    Colors.informational12,
    Colors.informationalOnOriginDefaultLight,
    Colors.informationalOnOriginHoveredLight,
    Colors.informationalOnOriginPressedLight,
    Colors.informationalOriginDefaultLight,
    Colors.informationalOriginHoveredLight,
    Colors.informationalOriginPressedLight,
)
val WarningColorsLight = WarningColors(
    Colors.warning14,
    Colors.warning13,
    Colors.warning12,
    Colors.warning13,
    Colors.warning12,
    Colors.warning11,
    Colors.warning12,
    Colors.warning11,
    Colors.warning10,
    Colors.warning6.copy(1f),
    Colors.warning6.copy(0.84f),
    Colors.warning6.copy(0.76f),
    Colors.warning6.copy(0.68f),
    Colors.warning3,
    Colors.warning4,
    Colors.warning5,
    Colors.warning5,
    Colors.warning6,
    Colors.warning7,
    Colors.warning6,
    Colors.warning5,
    Colors.warning4,
    Colors.warning7,
    Colors.warning6,
    Colors.warning5,
    Colors.warning10,
    Colors.warning9,
    Colors.warning8,
    Colors.warning9,
    Colors.warning8,
    Colors.warning7,
    Colors.warning3,
    Colors.warning4,
    Colors.warning5,
    Colors.warning6,
    Colors.warning5,
    Colors.warning4,
    Colors.warning7,
    Colors.warning6,
    Colors.warning5,
    Colors.warning14,
    Colors.warning13,
    Colors.warning12,
    Colors.warningOnOriginDefaultLight,
    Colors.warningOnOriginHoveredLight,
    Colors.warningOnOriginPressedLight,
    Colors.warningOriginDefaultLight,
    Colors.warningOriginHoveredLight,
    Colors.warningOriginPressedLight,
)
val SuccessfulColorsLight = SuccessfulColors(
    Colors.successful14,
    Colors.successful13,
    Colors.successful12,
    Colors.successful13,
    Colors.successful12,
    Colors.successful11,
    Colors.successful12,
    Colors.successful11,
    Colors.successful10,
    Colors.successful6.copy(1f),
    Colors.successful6.copy(0.84f),
    Colors.successful6.copy(0.76f),
    Colors.successful6.copy(0.68f),
    Colors.successful3,
    Colors.successful4,
    Colors.successful5,
    Colors.successful5,
    Colors.successful6,
    Colors.successful7,
    Colors.successful6,
    Colors.successful5,
    Colors.successful4,
    Colors.successful7,
    Colors.successful6,
    Colors.successful5,
    Colors.successful10,
    Colors.successful9,
    Colors.successful8,
    Colors.successful9,
    Colors.successful8,
    Colors.successful7,
    Colors.successful3,
    Colors.successful4,
    Colors.successful5,
    Colors.successful6,
    Colors.successful5,
    Colors.successful4,
    Colors.successful7,
    Colors.successful6,
    Colors.successful5,
    Colors.successful14,
    Colors.successful13,
    Colors.successful12,
    Colors.successfulOnOriginDefaultLight,
    Colors.successfulOnOriginHoveredLight,
    Colors.successfulOnOriginPressedLight,
    Colors.successfulOriginDefaultLight,
    Colors.successfulOriginHoveredLight,
    Colors.successfulOriginPressedLight,
)
val CriticalColorsLight = CriticalColors(
    Colors.critical14,
    Colors.critical13,
    Colors.critical12,
    Colors.critical13,
    Colors.critical12,
    Colors.critical11,
    Colors.critical12,
    Colors.critical11,
    Colors.critical10,
    Colors.critical6.copy(1f),
    Colors.critical6.copy(0.84f),
    Colors.critical6.copy(0.76f),
    Colors.critical6.copy(0.68f),
    Colors.critical3,
    Colors.critical4,
    Colors.critical5,
    Colors.critical5,
    Colors.critical6,
    Colors.critical7,
    Colors.critical6,
    Colors.critical5,
    Colors.critical4,
    Colors.critical7,
    Colors.critical6,
    Colors.critical5,
    Colors.critical10,
    Colors.critical9,
    Colors.critical8,
    Colors.critical9,
    Colors.critical8,
    Colors.critical7,
    Colors.critical3,
    Colors.critical4,
    Colors.critical5,
    Colors.critical6,
    Colors.critical5,
    Colors.critical4,
    Colors.critical7,
    Colors.critical6,
    Colors.critical5,
    Colors.critical14,
    Colors.critical13,
    Colors.critical12,
    Colors.criticalOnOriginDefaultLight,
    Colors.criticalOnOriginHoveredLight,
    Colors.criticalOnOriginPressedLight,
    Colors.criticalOriginDefaultLight,
    Colors.criticalOriginHoveredLight,
    Colors.criticalOriginPressedLight,
)
val YellowColorsLight = YellowColors(
    Colors.yellow14,
    Colors.yellow13,
    Colors.yellow12,
    Colors.yellow13,
    Colors.yellow12,
    Colors.yellow11,
    Colors.yellow12,
    Colors.yellow11,
    Colors.yellow10,
    Colors.yellow6.copy(1f),
    Colors.yellow6.copy(0.84f),
    Colors.yellow6.copy(0.76f),
    Colors.yellow6.copy(0.68f),
    Colors.yellow3,
    Colors.yellow4,
    Colors.yellow5,
    Colors.yellow5,
    Colors.yellow6,
    Colors.yellow7,
    Colors.yellow6,
    Colors.yellow5,
    Colors.yellow4,
    Colors.yellow7,
    Colors.yellow6,
    Colors.yellow5,
    Colors.yellow10,
    Colors.yellow9,
    Colors.yellow8,
    Colors.yellow9,
    Colors.yellow8,
    Colors.yellow7,
    Colors.yellow3,
    Colors.yellow4,
    Colors.yellow5,
    Colors.yellow6,
    Colors.yellow5,
    Colors.yellow4,
    Colors.yellow7,
    Colors.yellow6,
    Colors.yellow5,
    Colors.yellow14,
    Colors.yellow13,
    Colors.yellow12,
    Colors.yellowOnOriginDefaultLight,
    Colors.yellowOnOriginHoveredLight,
    Colors.yellowOnOriginPressedLight,
    Colors.yellowOriginDefaultLight,
    Colors.yellowOriginHoveredLight,
    Colors.yellowOriginPressedLight,
)
val OrangeColorsLight = OrangeColors(
    Colors.orange14,
    Colors.orange13,
    Colors.orange12,
    Colors.orange13,
    Colors.orange12,
    Colors.orange11,
    Colors.orange12,
    Colors.orange11,
    Colors.orange10,
    Colors.orange6.copy(1f),
    Colors.orange6.copy(0.84f),
    Colors.orange6.copy(0.76f),
    Colors.orange6.copy(0.68f),
    Colors.orange3,
    Colors.orange4,
    Colors.orange5,
    Colors.orange5,
    Colors.orange6,
    Colors.orange7,
    Colors.orange6,
    Colors.orange5,
    Colors.orange4,
    Colors.orange7,
    Colors.orange6,
    Colors.orange5,
    Colors.orange10,
    Colors.orange9,
    Colors.orange8,
    Colors.orange9,
    Colors.orange8,
    Colors.orange7,
    Colors.orange3,
    Colors.orange4,
    Colors.orange5,
    Colors.orange6,
    Colors.orange5,
    Colors.orange4,
    Colors.orange7,
    Colors.orange6,
    Colors.orange5,
    Colors.orange14,
    Colors.orange13,
    Colors.orange12,
    Colors.orangeOnOriginDefaultLight,
    Colors.orangeOnOriginHoveredLight,
    Colors.orangeOnOriginPressedLight,
    Colors.orangeOriginDefaultLight,
    Colors.orangeOriginHoveredLight,
    Colors.orangeOriginPressedLight,
)
val RedColorsLight = RedColors(
    Colors.red14,
    Colors.red13,
    Colors.red12,
    Colors.red13,
    Colors.red12,
    Colors.red11,
    Colors.red12,
    Colors.red11,
    Colors.red10,
    Colors.red6.copy(1f),
    Colors.red6.copy(0.84f),
    Colors.red6.copy(0.76f),
    Colors.red6.copy(0.68f),
    Colors.red3,
    Colors.red4,
    Colors.red5,
    Colors.red5,
    Colors.red6,
    Colors.red7,
    Colors.red6,
    Colors.red5,
    Colors.red4,
    Colors.red7,
    Colors.red6,
    Colors.red5,
    Colors.red10,
    Colors.red9,
    Colors.red8,
    Colors.red9,
    Colors.red8,
    Colors.red7,
    Colors.red3,
    Colors.red4,
    Colors.red5,
    Colors.red6,
    Colors.red5,
    Colors.red4,
    Colors.red7,
    Colors.red6,
    Colors.red5,
    Colors.red14,
    Colors.red13,
    Colors.red12,
    Colors.redOnOriginDefaultLight,
    Colors.redOnOriginHoveredLight,
    Colors.redOnOriginPressedLight,
    Colors.redOriginDefaultLight,
    Colors.redOriginHoveredLight,
    Colors.redOriginPressedLight,
)
val PinkColorsLight = PinkColors(
    Colors.pink14,
    Colors.pink13,
    Colors.pink12,
    Colors.pink13,
    Colors.pink12,
    Colors.pink11,
    Colors.pink12,
    Colors.pink11,
    Colors.pink10,
    Colors.pink6.copy(1f),
    Colors.pink6.copy(0.84f),
    Colors.pink6.copy(0.76f),
    Colors.pink6.copy(0.68f),
    Colors.pink3,
    Colors.pink4,
    Colors.pink5,
    Colors.pink5,
    Colors.pink6,
    Colors.pink7,
    Colors.pink6,
    Colors.pink5,
    Colors.pink4,
    Colors.pink7,
    Colors.pink6,
    Colors.pink5,
    Colors.pink10,
    Colors.pink9,
    Colors.pink8,
    Colors.pink9,
    Colors.pink8,
    Colors.pink7,
    Colors.pink3,
    Colors.pink4,
    Colors.pink5,
    Colors.pink6,
    Colors.pink5,
    Colors.pink4,
    Colors.pink7,
    Colors.pink6,
    Colors.pink5,
    Colors.pink14,
    Colors.pink13,
    Colors.pink12,
    Colors.pinkOnOriginDefaultLight,
    Colors.pinkOnOriginHoveredLight,
    Colors.pinkOnOriginPressedLight,
    Colors.pinkOriginDefaultLight,
    Colors.pinkOriginHoveredLight,
    Colors.pinkOriginPressedLight,
)
val VioletColorsLight = VioletColors(
    Colors.violet14,
    Colors.violet13,
    Colors.violet12,
    Colors.violet13,
    Colors.violet12,
    Colors.violet11,
    Colors.violet12,
    Colors.violet11,
    Colors.violet10,
    Colors.violet6.copy(1f),
    Colors.violet6.copy(0.84f),
    Colors.violet6.copy(0.76f),
    Colors.violet6.copy(0.68f),
    Colors.violet3,
    Colors.violet4,
    Colors.violet5,
    Colors.violet5,
    Colors.violet6,
    Colors.violet7,
    Colors.violet6,
    Colors.violet5,
    Colors.violet4,
    Colors.violet7,
    Colors.violet6,
    Colors.violet5,
    Colors.violet10,
    Colors.violet9,
    Colors.violet8,
    Colors.violet9,
    Colors.violet8,
    Colors.violet7,
    Colors.violet3,
    Colors.violet4,
    Colors.violet5,
    Colors.violet6,
    Colors.violet5,
    Colors.violet4,
    Colors.violet7,
    Colors.violet6,
    Colors.violet5,
    Colors.violet14,
    Colors.violet13,
    Colors.violet12,
    Colors.violetOnOriginDefaultLight,
    Colors.violetOnOriginHoveredLight,
    Colors.violetOnOriginPressedLight,
    Colors.violetOriginDefaultLight,
    Colors.violetOriginHoveredLight,
    Colors.violetOriginPressedLight,
)
val BlueColorsLight = BlueColors(
    Colors.blue14,
    Colors.blue13,
    Colors.blue12,
    Colors.blue13,
    Colors.blue12,
    Colors.blue11,
    Colors.blue12,
    Colors.blue11,
    Colors.blue10,
    Colors.blue6.copy(1f),
    Colors.blue6.copy(0.84f),
    Colors.blue6.copy(0.76f),
    Colors.blue6.copy(0.68f),
    Colors.blue3,
    Colors.blue4,
    Colors.blue5,
    Colors.blue5,
    Colors.blue6,
    Colors.blue7,
    Colors.blue6,
    Colors.blue5,
    Colors.blue4,
    Colors.blue7,
    Colors.blue6,
    Colors.blue5,
    Colors.blue10,
    Colors.blue9,
    Colors.blue8,
    Colors.blue9,
    Colors.blue8,
    Colors.blue7,
    Colors.blue3,
    Colors.blue4,
    Colors.blue5,
    Colors.blue6,
    Colors.blue5,
    Colors.blue4,
    Colors.blue7,
    Colors.blue6,
    Colors.blue5,
    Colors.blue14,
    Colors.blue13,
    Colors.blue12,
    Colors.blueOnOriginDefaultLight,
    Colors.blueOnOriginHoveredLight,
    Colors.blueOnOriginPressedLight,
    Colors.blueOriginDefaultLight,
    Colors.blueOriginHoveredLight,
    Colors.blueOriginPressedLight,
)
val CyanColorsLight = CyanColors(
    Colors.cyan14,
    Colors.cyan13,
    Colors.cyan12,
    Colors.cyan13,
    Colors.cyan12,
    Colors.cyan11,
    Colors.cyan12,
    Colors.cyan11,
    Colors.cyan10,
    Colors.cyan6.copy(1f),
    Colors.cyan6.copy(0.84f),
    Colors.cyan6.copy(0.76f),
    Colors.cyan6.copy(0.68f),
    Colors.cyan3,
    Colors.cyan4,
    Colors.cyan5,
    Colors.cyan5,
    Colors.cyan6,
    Colors.cyan7,
    Colors.cyan6,
    Colors.cyan5,
    Colors.cyan4,
    Colors.cyan7,
    Colors.cyan6,
    Colors.cyan5,
    Colors.cyan10,
    Colors.cyan9,
    Colors.cyan8,
    Colors.cyan9,
    Colors.cyan8,
    Colors.cyan7,
    Colors.cyan3,
    Colors.cyan4,
    Colors.cyan5,
    Colors.cyan6,
    Colors.cyan5,
    Colors.cyan4,
    Colors.cyan7,
    Colors.cyan6,
    Colors.cyan5,
    Colors.cyan14,
    Colors.cyan13,
    Colors.cyan12,
    Colors.cyanOnOriginDefaultLight,
    Colors.cyanOnOriginHoveredLight,
    Colors.cyanOnOriginPressedLight,
    Colors.cyanOriginDefaultLight,
    Colors.cyanOriginHoveredLight,
    Colors.cyanOriginPressedLight,
)
val TurquoiseColorsLight = TurquoiseColors(
    Colors.turquoise14,
    Colors.turquoise13,
    Colors.turquoise12,
    Colors.turquoise13,
    Colors.turquoise12,
    Colors.turquoise11,
    Colors.turquoise12,
    Colors.turquoise11,
    Colors.turquoise10,
    Colors.turquoise6.copy(1f),
    Colors.turquoise6.copy(0.84f),
    Colors.turquoise6.copy(0.76f),
    Colors.turquoise6.copy(0.68f),
    Colors.turquoise3,
    Colors.turquoise4,
    Colors.turquoise5,
    Colors.turquoise5,
    Colors.turquoise6,
    Colors.turquoise7,
    Colors.turquoise6,
    Colors.turquoise5,
    Colors.turquoise4,
    Colors.turquoise7,
    Colors.turquoise6,
    Colors.turquoise5,
    Colors.turquoise10,
    Colors.turquoise9,
    Colors.turquoise8,
    Colors.turquoise9,
    Colors.turquoise8,
    Colors.turquoise7,
    Colors.turquoise3,
    Colors.turquoise4,
    Colors.turquoise5,
    Colors.turquoise6,
    Colors.turquoise5,
    Colors.turquoise4,
    Colors.turquoise7,
    Colors.turquoise6,
    Colors.turquoise5,
    Colors.turquoise14,
    Colors.turquoise13,
    Colors.turquoise12,
    Colors.turquoiseOnOriginDefaultLight,
    Colors.turquoiseOnOriginHoveredLight,
    Colors.turquoiseOnOriginPressedLight,
    Colors.turquoiseOriginDefaultLight,
    Colors.turquoiseOriginHoveredLight,
    Colors.turquoiseOriginPressedLight,
)
val GreenColorsLight = GreenColors(
    Colors.green14,
    Colors.green13,
    Colors.green12,
    Colors.green13,
    Colors.green12,
    Colors.green11,
    Colors.green12,
    Colors.green11,
    Colors.green10,
    Colors.green6.copy(1f),
    Colors.green6.copy(0.84f),
    Colors.green6.copy(0.76f),
    Colors.green6.copy(0.68f),
    Colors.green3,
    Colors.green4,
    Colors.green5,
    Colors.green5,
    Colors.green6,
    Colors.green7,
    Colors.green6,
    Colors.green5,
    Colors.green4,
    Colors.green7,
    Colors.green6,
    Colors.green5,
    Colors.green10,
    Colors.green9,
    Colors.green8,
    Colors.green9,
    Colors.green8,
    Colors.green7,
    Colors.green3,
    Colors.green4,
    Colors.green5,
    Colors.green6,
    Colors.green5,
    Colors.green4,
    Colors.green7,
    Colors.green6,
    Colors.green5,
    Colors.green14,
    Colors.green13,
    Colors.green12,
    Colors.greenOnOriginDefaultLight,
    Colors.greenOnOriginHoveredLight,
    Colors.greenOnOriginPressedLight,
    Colors.greenOriginDefaultLight,
    Colors.greenOriginHoveredLight,
    Colors.greenOriginPressedLight,
)

fun getColorSchemeLight(
    neutral: NeutralColors = NeutralColorsLight,
    brand: BrandColors = BrandColorsLight,
    informational: InformationalColors = InformationalColorsLight,
    warning: WarningColors = WarningColorsLight,
    successful: SuccessfulColors = SuccessfulColorsLight,
    critical: CriticalColors = CriticalColorsLight,
    yellow: YellowColors = YellowColorsLight,
    orange: OrangeColors = OrangeColorsLight,
    red: RedColors = RedColorsLight,
    pink: PinkColors = PinkColorsLight,
    violet: VioletColors = VioletColorsLight,
    blue: BlueColors = BlueColorsLight,
    cyan: CyanColors = CyanColorsLight,
    turquoise: TurquoiseColors = TurquoiseColorsLight,
    green: GreenColors = GreenColorsLight,

    ): DBThemeColorScheme = DBThemeColorScheme(
    neutral = neutral,
    brand = brand,
    informational = informational,
    warning = warning,
    successful = successful,
    critical = critical,
    yellow = yellow,
    orange = orange,
    red = red,
    pink = pink,
    violet = violet,
    blue = blue,
    cyan = cyan,
    turquoise = turquoise,
    green = green,
)

val LocalColors = staticCompositionLocalOf { getColorSchemeLight() }

package com.example.myapplication.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.runtime.staticCompositionLocalOf

import androidx.compose.ui.graphics.Color
class NeutralColors(
bgLvl1Enabled: Color,
bgLvl1Hover: Color,
bgLvl1Pressed: Color,
bgLvl2Enabled: Color,
bgLvl2Hover: Color,
bgLvl2Pressed: Color,
bgLvl3Enabled: Color,
bgLvl3Hover: Color,
bgLvl3Pressed: Color,
bgTransparentFullEnabled: Color,
bgTransparentSemiEnabled: Color,
bgTransparentHover: Color,
bgTransparentPressed: Color,
onBgEnabled: Color,
onBgHover: Color,
onBgPressed: Color,
onBgWeakEnabled: Color,
onBgWeakHover: Color,
onBgWeakPressed: Color,
onContrastEnabled: Color,
onContrastHover: Color,
onContrastPressed: Color,
contrastHighEnabled: Color,
contrastHighHover: Color,
contrastHighPressed: Color,
contrastLowEnabled: Color,
contrastLowHover: Color,
contrastLowPressed: Color,
border: Color,
) {
var bgLvl1Enabled by mutableStateOf(bgLvl1Enabled, structuralEqualityPolicy())
  internal set
var bgLvl1Hover by mutableStateOf(bgLvl1Hover, structuralEqualityPolicy())
  internal set
var bgLvl1Pressed by mutableStateOf(bgLvl1Pressed, structuralEqualityPolicy())
  internal set
var bgLvl2Enabled by mutableStateOf(bgLvl2Enabled, structuralEqualityPolicy())
  internal set
var bgLvl2Hover by mutableStateOf(bgLvl2Hover, structuralEqualityPolicy())
  internal set
var bgLvl2Pressed by mutableStateOf(bgLvl2Pressed, structuralEqualityPolicy())
  internal set
var bgLvl3Enabled by mutableStateOf(bgLvl3Enabled, structuralEqualityPolicy())
  internal set
var bgLvl3Hover by mutableStateOf(bgLvl3Hover, structuralEqualityPolicy())
  internal set
var bgLvl3Pressed by mutableStateOf(bgLvl3Pressed, structuralEqualityPolicy())
  internal set
var bgTransparentFullEnabled by mutableStateOf(bgTransparentFullEnabled, structuralEqualityPolicy())
  internal set
var bgTransparentSemiEnabled by mutableStateOf(bgTransparentSemiEnabled, structuralEqualityPolicy())
  internal set
var bgTransparentHover by mutableStateOf(bgTransparentHover, structuralEqualityPolicy())
  internal set
var bgTransparentPressed by mutableStateOf(bgTransparentPressed, structuralEqualityPolicy())
  internal set
var onBgEnabled by mutableStateOf(onBgEnabled, structuralEqualityPolicy())
  internal set
var onBgHover by mutableStateOf(onBgHover, structuralEqualityPolicy())
  internal set
var onBgPressed by mutableStateOf(onBgPressed, structuralEqualityPolicy())
  internal set
var onBgWeakEnabled by mutableStateOf(onBgWeakEnabled, structuralEqualityPolicy())
  internal set
var onBgWeakHover by mutableStateOf(onBgWeakHover, structuralEqualityPolicy())
  internal set
var onBgWeakPressed by mutableStateOf(onBgWeakPressed, structuralEqualityPolicy())
  internal set
var onContrastEnabled by mutableStateOf(onContrastEnabled, structuralEqualityPolicy())
  internal set
var onContrastHover by mutableStateOf(onContrastHover, structuralEqualityPolicy())
  internal set
var onContrastPressed by mutableStateOf(onContrastPressed, structuralEqualityPolicy())
  internal set
var contrastHighEnabled by mutableStateOf(contrastHighEnabled, structuralEqualityPolicy())
  internal set
var contrastHighHover by mutableStateOf(contrastHighHover, structuralEqualityPolicy())
  internal set
var contrastHighPressed by mutableStateOf(contrastHighPressed, structuralEqualityPolicy())
  internal set
var contrastLowEnabled by mutableStateOf(contrastLowEnabled, structuralEqualityPolicy())
  internal set
var contrastLowHover by mutableStateOf(contrastLowHover, structuralEqualityPolicy())
  internal set
var contrastLowPressed by mutableStateOf(contrastLowPressed, structuralEqualityPolicy())
  internal set
var border by mutableStateOf(border, structuralEqualityPolicy())
  internal set
}
class BrandColors(
bgLvl1Enabled: Color,
bgLvl1Hover: Color,
bgLvl1Pressed: Color,
bgLvl2Enabled: Color,
bgLvl2Hover: Color,
bgLvl2Pressed: Color,
bgLvl3Enabled: Color,
bgLvl3Hover: Color,
bgLvl3Pressed: Color,
bgTransparentFullEnabled: Color,
bgTransparentSemiEnabled: Color,
bgTransparentHover: Color,
bgTransparentPressed: Color,
onBgEnabled: Color,
onBgHover: Color,
onBgPressed: Color,
onBgWeakEnabled: Color,
onBgWeakHover: Color,
onBgWeakPressed: Color,
onContrastEnabled: Color,
onContrastHover: Color,
onContrastPressed: Color,
contrastHighEnabled: Color,
contrastHighHover: Color,
contrastHighPressed: Color,
contrastLowEnabled: Color,
contrastLowHover: Color,
contrastLowPressed: Color,
border: Color,
onEnabled: Color,
originEnabled: Color,
originHover: Color,
originPressed: Color,
) {
var bgLvl1Enabled by mutableStateOf(bgLvl1Enabled, structuralEqualityPolicy())
  internal set
var bgLvl1Hover by mutableStateOf(bgLvl1Hover, structuralEqualityPolicy())
  internal set
var bgLvl1Pressed by mutableStateOf(bgLvl1Pressed, structuralEqualityPolicy())
  internal set
var bgLvl2Enabled by mutableStateOf(bgLvl2Enabled, structuralEqualityPolicy())
  internal set
var bgLvl2Hover by mutableStateOf(bgLvl2Hover, structuralEqualityPolicy())
  internal set
var bgLvl2Pressed by mutableStateOf(bgLvl2Pressed, structuralEqualityPolicy())
  internal set
var bgLvl3Enabled by mutableStateOf(bgLvl3Enabled, structuralEqualityPolicy())
  internal set
var bgLvl3Hover by mutableStateOf(bgLvl3Hover, structuralEqualityPolicy())
  internal set
var bgLvl3Pressed by mutableStateOf(bgLvl3Pressed, structuralEqualityPolicy())
  internal set
var bgTransparentFullEnabled by mutableStateOf(bgTransparentFullEnabled, structuralEqualityPolicy())
  internal set
var bgTransparentSemiEnabled by mutableStateOf(bgTransparentSemiEnabled, structuralEqualityPolicy())
  internal set
var bgTransparentHover by mutableStateOf(bgTransparentHover, structuralEqualityPolicy())
  internal set
var bgTransparentPressed by mutableStateOf(bgTransparentPressed, structuralEqualityPolicy())
  internal set
var onBgEnabled by mutableStateOf(onBgEnabled, structuralEqualityPolicy())
  internal set
var onBgHover by mutableStateOf(onBgHover, structuralEqualityPolicy())
  internal set
var onBgPressed by mutableStateOf(onBgPressed, structuralEqualityPolicy())
  internal set
var onBgWeakEnabled by mutableStateOf(onBgWeakEnabled, structuralEqualityPolicy())
  internal set
var onBgWeakHover by mutableStateOf(onBgWeakHover, structuralEqualityPolicy())
  internal set
var onBgWeakPressed by mutableStateOf(onBgWeakPressed, structuralEqualityPolicy())
  internal set
var onContrastEnabled by mutableStateOf(onContrastEnabled, structuralEqualityPolicy())
  internal set
var onContrastHover by mutableStateOf(onContrastHover, structuralEqualityPolicy())
  internal set
var onContrastPressed by mutableStateOf(onContrastPressed, structuralEqualityPolicy())
  internal set
var contrastHighEnabled by mutableStateOf(contrastHighEnabled, structuralEqualityPolicy())
  internal set
var contrastHighHover by mutableStateOf(contrastHighHover, structuralEqualityPolicy())
  internal set
var contrastHighPressed by mutableStateOf(contrastHighPressed, structuralEqualityPolicy())
  internal set
var contrastLowEnabled by mutableStateOf(contrastLowEnabled, structuralEqualityPolicy())
  internal set
var contrastLowHover by mutableStateOf(contrastLowHover, structuralEqualityPolicy())
  internal set
var contrastLowPressed by mutableStateOf(contrastLowPressed, structuralEqualityPolicy())
  internal set
var border by mutableStateOf(border, structuralEqualityPolicy())
  internal set
var onEnabled by mutableStateOf(onEnabled, structuralEqualityPolicy())
  internal set
var originEnabled by mutableStateOf(originEnabled, structuralEqualityPolicy())
  internal set
var originHover by mutableStateOf(originHover, structuralEqualityPolicy())
  internal set
var originPressed by mutableStateOf(originPressed, structuralEqualityPolicy())
  internal set
}
class InformationalColors(
bgLvl1Enabled: Color,
bgLvl1Hover: Color,
bgLvl1Pressed: Color,
bgLvl2Enabled: Color,
bgLvl2Hover: Color,
bgLvl2Pressed: Color,
bgLvl3Enabled: Color,
bgLvl3Hover: Color,
bgLvl3Pressed: Color,
bgTransparentFullEnabled: Color,
bgTransparentSemiEnabled: Color,
bgTransparentHover: Color,
bgTransparentPressed: Color,
onBgEnabled: Color,
onBgHover: Color,
onBgPressed: Color,
onBgWeakEnabled: Color,
onBgWeakHover: Color,
onBgWeakPressed: Color,
onContrastEnabled: Color,
onContrastHover: Color,
onContrastPressed: Color,
contrastHighEnabled: Color,
contrastHighHover: Color,
contrastHighPressed: Color,
contrastLowEnabled: Color,
contrastLowHover: Color,
contrastLowPressed: Color,
border: Color,
) {
var bgLvl1Enabled by mutableStateOf(bgLvl1Enabled, structuralEqualityPolicy())
  internal set
var bgLvl1Hover by mutableStateOf(bgLvl1Hover, structuralEqualityPolicy())
  internal set
var bgLvl1Pressed by mutableStateOf(bgLvl1Pressed, structuralEqualityPolicy())
  internal set
var bgLvl2Enabled by mutableStateOf(bgLvl2Enabled, structuralEqualityPolicy())
  internal set
var bgLvl2Hover by mutableStateOf(bgLvl2Hover, structuralEqualityPolicy())
  internal set
var bgLvl2Pressed by mutableStateOf(bgLvl2Pressed, structuralEqualityPolicy())
  internal set
var bgLvl3Enabled by mutableStateOf(bgLvl3Enabled, structuralEqualityPolicy())
  internal set
var bgLvl3Hover by mutableStateOf(bgLvl3Hover, structuralEqualityPolicy())
  internal set
var bgLvl3Pressed by mutableStateOf(bgLvl3Pressed, structuralEqualityPolicy())
  internal set
var bgTransparentFullEnabled by mutableStateOf(bgTransparentFullEnabled, structuralEqualityPolicy())
  internal set
var bgTransparentSemiEnabled by mutableStateOf(bgTransparentSemiEnabled, structuralEqualityPolicy())
  internal set
var bgTransparentHover by mutableStateOf(bgTransparentHover, structuralEqualityPolicy())
  internal set
var bgTransparentPressed by mutableStateOf(bgTransparentPressed, structuralEqualityPolicy())
  internal set
var onBgEnabled by mutableStateOf(onBgEnabled, structuralEqualityPolicy())
  internal set
var onBgHover by mutableStateOf(onBgHover, structuralEqualityPolicy())
  internal set
var onBgPressed by mutableStateOf(onBgPressed, structuralEqualityPolicy())
  internal set
var onBgWeakEnabled by mutableStateOf(onBgWeakEnabled, structuralEqualityPolicy())
  internal set
var onBgWeakHover by mutableStateOf(onBgWeakHover, structuralEqualityPolicy())
  internal set
var onBgWeakPressed by mutableStateOf(onBgWeakPressed, structuralEqualityPolicy())
  internal set
var onContrastEnabled by mutableStateOf(onContrastEnabled, structuralEqualityPolicy())
  internal set
var onContrastHover by mutableStateOf(onContrastHover, structuralEqualityPolicy())
  internal set
var onContrastPressed by mutableStateOf(onContrastPressed, structuralEqualityPolicy())
  internal set
var contrastHighEnabled by mutableStateOf(contrastHighEnabled, structuralEqualityPolicy())
  internal set
var contrastHighHover by mutableStateOf(contrastHighHover, structuralEqualityPolicy())
  internal set
var contrastHighPressed by mutableStateOf(contrastHighPressed, structuralEqualityPolicy())
  internal set
var contrastLowEnabled by mutableStateOf(contrastLowEnabled, structuralEqualityPolicy())
  internal set
var contrastLowHover by mutableStateOf(contrastLowHover, structuralEqualityPolicy())
  internal set
var contrastLowPressed by mutableStateOf(contrastLowPressed, structuralEqualityPolicy())
  internal set
var border by mutableStateOf(border, structuralEqualityPolicy())
  internal set
}
class WarningColors(
bgLvl1Enabled: Color,
bgLvl1Hover: Color,
bgLvl1Pressed: Color,
bgLvl2Enabled: Color,
bgLvl2Hover: Color,
bgLvl2Pressed: Color,
bgLvl3Enabled: Color,
bgLvl3Hover: Color,
bgLvl3Pressed: Color,
bgTransparentFullEnabled: Color,
bgTransparentSemiEnabled: Color,
bgTransparentHover: Color,
bgTransparentPressed: Color,
onBgEnabled: Color,
onBgHover: Color,
onBgPressed: Color,
onBgWeakEnabled: Color,
onBgWeakHover: Color,
onBgWeakPressed: Color,
onContrastEnabled: Color,
onContrastHover: Color,
onContrastPressed: Color,
contrastHighEnabled: Color,
contrastHighHover: Color,
contrastHighPressed: Color,
contrastLowEnabled: Color,
contrastLowHover: Color,
contrastLowPressed: Color,
border: Color,
) {
var bgLvl1Enabled by mutableStateOf(bgLvl1Enabled, structuralEqualityPolicy())
  internal set
var bgLvl1Hover by mutableStateOf(bgLvl1Hover, structuralEqualityPolicy())
  internal set
var bgLvl1Pressed by mutableStateOf(bgLvl1Pressed, structuralEqualityPolicy())
  internal set
var bgLvl2Enabled by mutableStateOf(bgLvl2Enabled, structuralEqualityPolicy())
  internal set
var bgLvl2Hover by mutableStateOf(bgLvl2Hover, structuralEqualityPolicy())
  internal set
var bgLvl2Pressed by mutableStateOf(bgLvl2Pressed, structuralEqualityPolicy())
  internal set
var bgLvl3Enabled by mutableStateOf(bgLvl3Enabled, structuralEqualityPolicy())
  internal set
var bgLvl3Hover by mutableStateOf(bgLvl3Hover, structuralEqualityPolicy())
  internal set
var bgLvl3Pressed by mutableStateOf(bgLvl3Pressed, structuralEqualityPolicy())
  internal set
var bgTransparentFullEnabled by mutableStateOf(bgTransparentFullEnabled, structuralEqualityPolicy())
  internal set
var bgTransparentSemiEnabled by mutableStateOf(bgTransparentSemiEnabled, structuralEqualityPolicy())
  internal set
var bgTransparentHover by mutableStateOf(bgTransparentHover, structuralEqualityPolicy())
  internal set
var bgTransparentPressed by mutableStateOf(bgTransparentPressed, structuralEqualityPolicy())
  internal set
var onBgEnabled by mutableStateOf(onBgEnabled, structuralEqualityPolicy())
  internal set
var onBgHover by mutableStateOf(onBgHover, structuralEqualityPolicy())
  internal set
var onBgPressed by mutableStateOf(onBgPressed, structuralEqualityPolicy())
  internal set
var onBgWeakEnabled by mutableStateOf(onBgWeakEnabled, structuralEqualityPolicy())
  internal set
var onBgWeakHover by mutableStateOf(onBgWeakHover, structuralEqualityPolicy())
  internal set
var onBgWeakPressed by mutableStateOf(onBgWeakPressed, structuralEqualityPolicy())
  internal set
var onContrastEnabled by mutableStateOf(onContrastEnabled, structuralEqualityPolicy())
  internal set
var onContrastHover by mutableStateOf(onContrastHover, structuralEqualityPolicy())
  internal set
var onContrastPressed by mutableStateOf(onContrastPressed, structuralEqualityPolicy())
  internal set
var contrastHighEnabled by mutableStateOf(contrastHighEnabled, structuralEqualityPolicy())
  internal set
var contrastHighHover by mutableStateOf(contrastHighHover, structuralEqualityPolicy())
  internal set
var contrastHighPressed by mutableStateOf(contrastHighPressed, structuralEqualityPolicy())
  internal set
var contrastLowEnabled by mutableStateOf(contrastLowEnabled, structuralEqualityPolicy())
  internal set
var contrastLowHover by mutableStateOf(contrastLowHover, structuralEqualityPolicy())
  internal set
var contrastLowPressed by mutableStateOf(contrastLowPressed, structuralEqualityPolicy())
  internal set
var border by mutableStateOf(border, structuralEqualityPolicy())
  internal set
}
class SuccessfulColors(
bgLvl1Enabled: Color,
bgLvl1Hover: Color,
bgLvl1Pressed: Color,
bgLvl2Enabled: Color,
bgLvl2Hover: Color,
bgLvl2Pressed: Color,
bgLvl3Enabled: Color,
bgLvl3Hover: Color,
bgLvl3Pressed: Color,
bgTransparentFullEnabled: Color,
bgTransparentSemiEnabled: Color,
bgTransparentHover: Color,
bgTransparentPressed: Color,
onBgEnabled: Color,
onBgHover: Color,
onBgPressed: Color,
onBgWeakEnabled: Color,
onBgWeakHover: Color,
onBgWeakPressed: Color,
onContrastEnabled: Color,
onContrastHover: Color,
onContrastPressed: Color,
contrastHighEnabled: Color,
contrastHighHover: Color,
contrastHighPressed: Color,
contrastLowEnabled: Color,
contrastLowHover: Color,
contrastLowPressed: Color,
border: Color,
) {
var bgLvl1Enabled by mutableStateOf(bgLvl1Enabled, structuralEqualityPolicy())
  internal set
var bgLvl1Hover by mutableStateOf(bgLvl1Hover, structuralEqualityPolicy())
  internal set
var bgLvl1Pressed by mutableStateOf(bgLvl1Pressed, structuralEqualityPolicy())
  internal set
var bgLvl2Enabled by mutableStateOf(bgLvl2Enabled, structuralEqualityPolicy())
  internal set
var bgLvl2Hover by mutableStateOf(bgLvl2Hover, structuralEqualityPolicy())
  internal set
var bgLvl2Pressed by mutableStateOf(bgLvl2Pressed, structuralEqualityPolicy())
  internal set
var bgLvl3Enabled by mutableStateOf(bgLvl3Enabled, structuralEqualityPolicy())
  internal set
var bgLvl3Hover by mutableStateOf(bgLvl3Hover, structuralEqualityPolicy())
  internal set
var bgLvl3Pressed by mutableStateOf(bgLvl3Pressed, structuralEqualityPolicy())
  internal set
var bgTransparentFullEnabled by mutableStateOf(bgTransparentFullEnabled, structuralEqualityPolicy())
  internal set
var bgTransparentSemiEnabled by mutableStateOf(bgTransparentSemiEnabled, structuralEqualityPolicy())
  internal set
var bgTransparentHover by mutableStateOf(bgTransparentHover, structuralEqualityPolicy())
  internal set
var bgTransparentPressed by mutableStateOf(bgTransparentPressed, structuralEqualityPolicy())
  internal set
var onBgEnabled by mutableStateOf(onBgEnabled, structuralEqualityPolicy())
  internal set
var onBgHover by mutableStateOf(onBgHover, structuralEqualityPolicy())
  internal set
var onBgPressed by mutableStateOf(onBgPressed, structuralEqualityPolicy())
  internal set
var onBgWeakEnabled by mutableStateOf(onBgWeakEnabled, structuralEqualityPolicy())
  internal set
var onBgWeakHover by mutableStateOf(onBgWeakHover, structuralEqualityPolicy())
  internal set
var onBgWeakPressed by mutableStateOf(onBgWeakPressed, structuralEqualityPolicy())
  internal set
var onContrastEnabled by mutableStateOf(onContrastEnabled, structuralEqualityPolicy())
  internal set
var onContrastHover by mutableStateOf(onContrastHover, structuralEqualityPolicy())
  internal set
var onContrastPressed by mutableStateOf(onContrastPressed, structuralEqualityPolicy())
  internal set
var contrastHighEnabled by mutableStateOf(contrastHighEnabled, structuralEqualityPolicy())
  internal set
var contrastHighHover by mutableStateOf(contrastHighHover, structuralEqualityPolicy())
  internal set
var contrastHighPressed by mutableStateOf(contrastHighPressed, structuralEqualityPolicy())
  internal set
var contrastLowEnabled by mutableStateOf(contrastLowEnabled, structuralEqualityPolicy())
  internal set
var contrastLowHover by mutableStateOf(contrastLowHover, structuralEqualityPolicy())
  internal set
var contrastLowPressed by mutableStateOf(contrastLowPressed, structuralEqualityPolicy())
  internal set
var border by mutableStateOf(border, structuralEqualityPolicy())
  internal set
}
class CriticalColors(
bgLvl1Enabled: Color,
bgLvl1Hover: Color,
bgLvl1Pressed: Color,
bgLvl2Enabled: Color,
bgLvl2Hover: Color,
bgLvl2Pressed: Color,
bgLvl3Enabled: Color,
bgLvl3Hover: Color,
bgLvl3Pressed: Color,
bgTransparentFullEnabled: Color,
bgTransparentSemiEnabled: Color,
bgTransparentHover: Color,
bgTransparentPressed: Color,
onBgEnabled: Color,
onBgHover: Color,
onBgPressed: Color,
onBgWeakEnabled: Color,
onBgWeakHover: Color,
onBgWeakPressed: Color,
onContrastEnabled: Color,
onContrastHover: Color,
onContrastPressed: Color,
contrastHighEnabled: Color,
contrastHighHover: Color,
contrastHighPressed: Color,
contrastLowEnabled: Color,
contrastLowHover: Color,
contrastLowPressed: Color,
border: Color,
) {
var bgLvl1Enabled by mutableStateOf(bgLvl1Enabled, structuralEqualityPolicy())
  internal set
var bgLvl1Hover by mutableStateOf(bgLvl1Hover, structuralEqualityPolicy())
  internal set
var bgLvl1Pressed by mutableStateOf(bgLvl1Pressed, structuralEqualityPolicy())
  internal set
var bgLvl2Enabled by mutableStateOf(bgLvl2Enabled, structuralEqualityPolicy())
  internal set
var bgLvl2Hover by mutableStateOf(bgLvl2Hover, structuralEqualityPolicy())
  internal set
var bgLvl2Pressed by mutableStateOf(bgLvl2Pressed, structuralEqualityPolicy())
  internal set
var bgLvl3Enabled by mutableStateOf(bgLvl3Enabled, structuralEqualityPolicy())
  internal set
var bgLvl3Hover by mutableStateOf(bgLvl3Hover, structuralEqualityPolicy())
  internal set
var bgLvl3Pressed by mutableStateOf(bgLvl3Pressed, structuralEqualityPolicy())
  internal set
var bgTransparentFullEnabled by mutableStateOf(bgTransparentFullEnabled, structuralEqualityPolicy())
  internal set
var bgTransparentSemiEnabled by mutableStateOf(bgTransparentSemiEnabled, structuralEqualityPolicy())
  internal set
var bgTransparentHover by mutableStateOf(bgTransparentHover, structuralEqualityPolicy())
  internal set
var bgTransparentPressed by mutableStateOf(bgTransparentPressed, structuralEqualityPolicy())
  internal set
var onBgEnabled by mutableStateOf(onBgEnabled, structuralEqualityPolicy())
  internal set
var onBgHover by mutableStateOf(onBgHover, structuralEqualityPolicy())
  internal set
var onBgPressed by mutableStateOf(onBgPressed, structuralEqualityPolicy())
  internal set
var onBgWeakEnabled by mutableStateOf(onBgWeakEnabled, structuralEqualityPolicy())
  internal set
var onBgWeakHover by mutableStateOf(onBgWeakHover, structuralEqualityPolicy())
  internal set
var onBgWeakPressed by mutableStateOf(onBgWeakPressed, structuralEqualityPolicy())
  internal set
var onContrastEnabled by mutableStateOf(onContrastEnabled, structuralEqualityPolicy())
  internal set
var onContrastHover by mutableStateOf(onContrastHover, structuralEqualityPolicy())
  internal set
var onContrastPressed by mutableStateOf(onContrastPressed, structuralEqualityPolicy())
  internal set
var contrastHighEnabled by mutableStateOf(contrastHighEnabled, structuralEqualityPolicy())
  internal set
var contrastHighHover by mutableStateOf(contrastHighHover, structuralEqualityPolicy())
  internal set
var contrastHighPressed by mutableStateOf(contrastHighPressed, structuralEqualityPolicy())
  internal set
var contrastLowEnabled by mutableStateOf(contrastLowEnabled, structuralEqualityPolicy())
  internal set
var contrastLowHover by mutableStateOf(contrastLowHover, structuralEqualityPolicy())
  internal set
var contrastLowPressed by mutableStateOf(contrastLowPressed, structuralEqualityPolicy())
  internal set
var border by mutableStateOf(border, structuralEqualityPolicy())
  internal set
}
class DBThemeColorScheme(
neutral: NeutralColors,
brand: BrandColors,
informational: InformationalColors,
warning: WarningColors,
successful: SuccessfulColors,
critical: CriticalColors,
){
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
Colors.neutral3,
Colors.neutral4,
Colors.neutral5,
Colors.neutral9,
Colors.neutral8,
Colors.neutral7,
Colors.neutral8,
Colors.neutral7,
Colors.neutral6,
Colors.neutral6,
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
Colors.brand3,
Colors.brand4,
Colors.brand5,
Colors.brand9,
Colors.brand8,
Colors.brand7,
Colors.brand8,
Colors.brand7,
Colors.brand6,
Colors.brand6,
Colors.brandOnDark,
Colors.brandOriginDark,
Colors.brandHoverDark,
Colors.brandPressedDark,
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
Colors.informational3,
Colors.informational4,
Colors.informational5,
Colors.informational9,
Colors.informational8,
Colors.informational7,
Colors.informational8,
Colors.informational7,
Colors.informational6,
Colors.informational6,
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
Colors.warning3,
Colors.warning4,
Colors.warning5,
Colors.warning9,
Colors.warning8,
Colors.warning7,
Colors.warning8,
Colors.warning7,
Colors.warning6,
Colors.warning6,
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
Colors.successful3,
Colors.successful4,
Colors.successful5,
Colors.successful9,
Colors.successful8,
Colors.successful7,
Colors.successful8,
Colors.successful7,
Colors.successful6,
Colors.successful6,
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
Colors.critical3,
Colors.critical4,
Colors.critical5,
Colors.critical9,
Colors.critical8,
Colors.critical7,
Colors.critical8,
Colors.critical7,
Colors.critical6,
Colors.critical6,
)
fun getColorSchemeDark(
neutral: NeutralColors = NeutralColorsDark,
brand: BrandColors = BrandColorsDark,
informational: InformationalColors = InformationalColorsDark,
warning: WarningColors = WarningColorsDark,
successful: SuccessfulColors = SuccessfulColorsDark,
critical: CriticalColors = CriticalColorsDark,

):DBThemeColorScheme = DBThemeColorScheme(
neutral=neutral,
brand=brand,
informational=informational,
warning=warning,
successful=successful,
critical=critical,
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
Colors.neutral14,
Colors.neutral13,
Colors.neutral12,
Colors.neutral6,
Colors.neutral5,
Colors.neutral4,
Colors.neutral7,
Colors.neutral6,
Colors.neutral5,
Colors.neutral10,
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
Colors.brand14,
Colors.brand13,
Colors.brand12,
Colors.brand6,
Colors.brand5,
Colors.brand4,
Colors.brand7,
Colors.brand6,
Colors.brand5,
Colors.brand10,
Colors.brandOnLight,
Colors.brandOriginLight,
Colors.brandHoverLight,
Colors.brandPressedLight,
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
Colors.informational14,
Colors.informational13,
Colors.informational12,
Colors.informational6,
Colors.informational5,
Colors.informational4,
Colors.informational7,
Colors.informational6,
Colors.informational5,
Colors.informational10,
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
Colors.warning14,
Colors.warning13,
Colors.warning12,
Colors.warning6,
Colors.warning5,
Colors.warning4,
Colors.warning7,
Colors.warning6,
Colors.warning5,
Colors.warning10,
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
Colors.successful14,
Colors.successful13,
Colors.successful12,
Colors.successful6,
Colors.successful5,
Colors.successful4,
Colors.successful7,
Colors.successful6,
Colors.successful5,
Colors.successful10,
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
Colors.critical14,
Colors.critical13,
Colors.critical12,
Colors.critical6,
Colors.critical5,
Colors.critical4,
Colors.critical7,
Colors.critical6,
Colors.critical5,
Colors.critical10,
)
fun getColorSchemeLight(
neutral: NeutralColors = NeutralColorsLight,
brand: BrandColors = BrandColorsLight,
informational: InformationalColors = InformationalColorsLight,
warning: WarningColors = WarningColorsLight,
successful: SuccessfulColors = SuccessfulColorsLight,
critical: CriticalColors = CriticalColorsLight,

):DBThemeColorScheme = DBThemeColorScheme(
neutral=neutral,
brand=brand,
informational=informational,
warning=warning,
successful=successful,
critical=critical,
)

val LocalColors = staticCompositionLocalOf { getColorSchemeLight() }

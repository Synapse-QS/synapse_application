package com.synapse.social.studioasinc.feature.shared.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.MaterialExpressiveTheme
import androidx.compose.material3.MotionScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

private val ChatEncryptionLightColors = lightColorScheme(
    primary = Color(0xFF00696E), onPrimary = Color(0xFFFFFFFF), primaryContainer = Color(0xFF9CF1F6), onPrimaryContainer = Color(0xFF002022),
    secondary = Color(0xFF4D6263), secondaryContainer = Color(0xFFCCE8E9), onSecondaryContainer = Color(0xFF051F20),
    tertiaryContainer = Color(0xFFD2E4FF), onTertiaryContainer = Color(0xFF001C3B), surface = Color(0xFFF4FBFB),
    surfaceContainerLow = Color(0xFFEEF5F5), surfaceContainer = Color(0xFFE8EFEF), surfaceContainerHigh = Color(0xFFE2EAEA),
    surfaceContainerHighest = Color(0xFFDDE4E4), onSurface = Color(0xFF161D1D), onSurfaceVariant = Color(0xFF3F4948),
    outline = Color(0xFF6F7979), outlineVariant = Color(0xFFBEC8C8), inverseSurface = Color(0xFF2B3232),
    inverseOnSurface = Color(0xFFECF2F2), inversePrimary = Color(0xFF80D5DA), error = Color(0xFFB3261E),
    onError = Color(0xFFFFFFFF), errorContainer = Color(0xFFF9DEDC), onErrorContainer = Color(0xFF410E0B)
)

private val ChatEncryptionDarkColors = darkColorScheme(
    primary = Color(0xFF83D4D8), onPrimary = Color(0xFF063639), primaryContainer = Color(0xFF0B4F52), onPrimaryContainer = Color(0xFF9FF0F5),
    secondary = Color(0xFFB3CBCC), secondaryContainer = Color(0xFF354A4C), onSecondaryContainer = Color(0xFFCFE7E8),
    tertiaryContainer = Color(0xFF38485A), onTertiaryContainer = Color(0xFFD3E4FA), surface = Color(0xFF0D1515),
    surfaceContainerLow = Color(0xFF161D1D), surfaceContainer = Color(0xFF1A2121), surfaceContainerHigh = Color(0xFF252B2B),
    surfaceContainerHighest = Color(0xFF2F3636), onSurface = Color(0xFFDCE4E4), onSurfaceVariant = Color(0xFFB7CACB),
    outline = Color(0xFF819495), outlineVariant = Color(0xFF394A4B), inverseSurface = Color(0xFFDCE4E4),
    inverseOnSurface = Color(0xFF2B3232), inversePrimary = Color(0xFF00696E), error = Color(0xFFF2B8B5),
    onError = Color(0xFF601410), errorContainer = Color(0xFF8C1D18), onErrorContainer = Color(0xFFF9DEDC)
)

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
internal fun ChatEncryptionTheme(content: @Composable () -> Unit) {
    val colors = if (isSystemInDarkTheme()) ChatEncryptionDarkColors else ChatEncryptionLightColors
    MaterialExpressiveTheme(colorScheme = colors, motionScheme = MotionScheme.expressive(), content = content)
}

/** Component sizes follow the supplied brief; QR size is this screen's layout decision. */
internal object ChatEncryptionMetrics {
    val sheetMaximumHeight = 652.dp
    val sheetCornerRadius = 28.dp
    val cardCornerRadius = 20.dp
    val listOuterCornerRadius = 28.dp
    val listInnerCornerRadius = 8.dp
    val listGap = 3.dp
    val iconButtonSize = 40.dp
    val iconCircleSize = 40.dp
    val listItemMinimumHeight = 72.dp
    val buttonHeight = 56.dp
    val verificationCardHeight = 180.dp
    val topBarHeight = 64.dp
    val dividerThickness = 1.dp
    val qrSize = 144.dp
}

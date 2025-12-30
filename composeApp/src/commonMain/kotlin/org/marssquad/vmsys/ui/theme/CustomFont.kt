package org.marssquad.vmsys.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import vmsystem.composeapp.generated.resources.Montserrat_Bold
import vmsystem.composeapp.generated.resources.Montserrat_Light
import vmsystem.composeapp.generated.resources.Montserrat_Medium
import vmsystem.composeapp.generated.resources.Montserrat_Regular
import vmsystem.composeapp.generated.resources.Montserrat_SemiBold
import vmsystem.composeapp.generated.resources.Res

@Composable
fun MontserratFontFamily() = FontFamily(
    Font(Res.font.Montserrat_Light, weight = FontWeight.Light),
    Font(Res.font.Montserrat_Regular, weight = FontWeight.Normal),
    Font(Res.font.Montserrat_Medium, weight = FontWeight.Medium),
    Font(Res.font.Montserrat_SemiBold, weight = FontWeight.SemiBold),
    Font(Res.font.Montserrat_Bold, weight = FontWeight.Bold)
)

@Composable
fun montserratTypography(): androidx.compose.material3.Typography {
    val family = MontserratFontFamily()
    return Typography().run {
        copy(
            displayLarge = displayLarge.copy(fontFamily = family),
            displayMedium = displayMedium.copy(fontFamily = family),
            displaySmall = displaySmall.copy(fontFamily = family),
            headlineLarge = headlineLarge.copy(fontFamily = family),
            headlineMedium = headlineMedium.copy(fontFamily = family),
            headlineSmall = headlineSmall.copy(fontFamily = family),
            titleLarge = titleLarge.copy(fontFamily = family),
            titleMedium = titleMedium.copy(fontFamily = family),
            titleSmall = titleSmall.copy(fontFamily = family),
            bodyLarge = bodyLarge.copy(fontFamily = family),
            bodyMedium = bodyMedium.copy(fontFamily = family),
            bodySmall = bodySmall.copy(fontFamily = family),
            labelLarge = labelLarge.copy(fontFamily = family),
            labelMedium = labelMedium.copy(fontFamily = family),
            labelSmall = labelSmall.copy(fontFamily = family)
        )
    }
}
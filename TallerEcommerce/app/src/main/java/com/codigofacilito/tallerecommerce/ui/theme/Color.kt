package com.codigofacilito.tallerecommerce.ui.theme

import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val primaryColor = HexToColor.getColor("#ed4960")
val white = Color.White
val backgroundDark =HexToColor.getColor("#19202c")
val black =HexToColor.getColor("#222a32")
val surfaceDark =HexToColor.getColor("#1c2639")

object HexToColor{
    fun getColor(color: String):Color{
        return Color(android.graphics.Color.parseColor(color))
    }
}
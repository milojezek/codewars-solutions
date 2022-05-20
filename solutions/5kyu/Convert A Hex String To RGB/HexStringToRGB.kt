fun hexStringToRGB(hexString: String): RGB = RGB(
    hexString.slice(1..2).toInt(16),
    hexString.slice(3..4).toInt(16),
    hexString.slice(5..6).toInt(16)
)

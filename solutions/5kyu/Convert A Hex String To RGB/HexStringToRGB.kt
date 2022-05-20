fun hexStringToRGB(hexString: String): RGB {
    val r = hexString.slice(1..2).toInt(16)
    val g = hexString.slice(3..4).toInt(16)
    val b = hexString.slice(5..6).toInt(16)
    val rgb = RGB(r, g, b)
    return rgb  
}

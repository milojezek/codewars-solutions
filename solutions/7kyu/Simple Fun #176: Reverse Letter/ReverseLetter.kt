fun reverseLetter(str: String): String {
    val cleanStr = str.map { if (it.isLetter()) it else "" }
    return cleanStr.reversed().joinToString("")
}

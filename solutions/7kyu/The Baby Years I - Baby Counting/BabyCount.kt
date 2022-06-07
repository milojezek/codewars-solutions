fun babyCount(x: String): Int? {
    var b = 0; var a = 0; var y = 0
    for (char in x.lowercase()) {
        when (char) {
            'b' -> b++
            'a' -> a++
            'y' -> y++
            else -> continue
        }
    }
    val letters = listOf(b / 2, a, y)
    
    return if (letters.minOrNull() == 0) null else letters.minOrNull()
}

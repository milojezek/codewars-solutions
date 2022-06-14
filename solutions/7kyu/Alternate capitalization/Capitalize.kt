package altcaps

fun capitalize(text: String): List<String> {
    val evenCapitalized = text.toMutableList()
    val oddCapitalized = text.toMutableList()
    for (index in text.indices) {
        if (index % 2 == 0) {
            evenCapitalized[index] = evenCapitalized[index].uppercaseChar()
        } else {
            oddCapitalized[index] = oddCapitalized[index].uppercaseChar()
        }
    }
    
    val capitalized = listOf(
        evenCapitalized.joinToString(""),
        oddCapitalized.joinToString(""))
    
    return capitalized
}

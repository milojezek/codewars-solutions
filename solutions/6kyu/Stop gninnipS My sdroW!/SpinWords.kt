package spinwords

fun spinWords(sentence: String): String {
    val words = sentence.split(" ").toTypedArray()
    for (i in 0 until words.size) {
        if (words[i].length >= 5) {
            words[i] = words[i].reversed()
        }
    }
    
    return words.joinToString(" ")
}

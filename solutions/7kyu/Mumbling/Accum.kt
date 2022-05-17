package accum

fun accum(s:String):String {
    var numOfLetters = 1
    val accumList = mutableListOf<String>()
    for (letter in s) {
        var letterSeq = letter.uppercase()
        repeat(numOfLetters - 1) {
            letterSeq += letter.lowercase()
        }
        accumList.add(letterSeq)
        numOfLetters++
    }
    
    return accumList.joinToString("-")
}

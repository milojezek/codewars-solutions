package accum

fun accum(s:String):String {
    var numOfLetters = 1
    val accumList = mutableListOf<String>()
    for (letter in s) {
        accumList.add(letter.uppercase() + letter.lowercase().repeat(numOfLetters - 1))
        numOfLetters++
    }
    
    return accumList.joinToString("-")
}

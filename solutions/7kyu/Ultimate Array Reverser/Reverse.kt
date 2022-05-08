// No Kotlin coder would ever use Arrays if they could avoid it,
// even in a challenge called "Ultimate Array Reverser."
// To paraphrase a man in a cave,
// "It's dangerous to go alone, take this [List]"
fun reverse(input: List<String>): List<String> {
    var chars = input.joinToString("").reversed().toMutableList()
    var resultAsCharSequences = mutableListOf<CharArray>()
    var result = mutableListOf<String>()
    
    for (word in input) {
        resultAsCharSequences.add(chars.slice(0..word.length - 1).toCharArray())
        chars.subList(0, word.length).clear()
    }
    
    for (n in resultAsCharSequences) {
        result.add(n.joinToString(""))
    }
    
    return result
}

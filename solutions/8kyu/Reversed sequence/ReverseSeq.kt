fun reverseSeq(n: Int): List<Int> {
    val reversedSequence = mutableListOf<Int>()
    for (number in n downTo 1) {
        reversedSequence.add(number)
    }
    
    return reversedSequence
}

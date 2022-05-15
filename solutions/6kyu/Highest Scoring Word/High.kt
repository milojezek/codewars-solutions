fun high(str: String) : String {
    val wordList = str.split(" ")
    var highestScoringWord = wordList[0]
    for (word in wordList) {
        if (calculateScore(word) > calculateScore(highestScoringWord)) {
            highestScoringWord = word
        } else {
            continue
        }
    }
    
    return highestScoringWord
}

fun calculateScore(word: String): Int {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    var score = 0
    for (letter in word) {
        score += alphabet.indexOf(letter) + 1
    }
    

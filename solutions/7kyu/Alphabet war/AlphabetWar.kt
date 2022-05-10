fun alphabetWar(fight: String): String {
    var leftSideScore = 0
    var rightSideScore = 0

    val leftSideLetterPower = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1)
    val rightSideLetterPower = mapOf('m' to 4, 'q' to 3, 'd' to 2, 'z' to 1)
    
    for (letter in fight) {
        if (letter in leftSideLetterPower.keys) {
            leftSideScore += leftSideLetterPower.getValue(letter)
        } else if (letter in rightSideLetterPower.keys) {
            rightSideScore += rightSideLetterPower.getValue(letter)
        } else {
            continue
        }
    }
    
    return when {
        leftSideScore > rightSideScore -> "Left side wins!"
        leftSideScore < rightSideScore -> "Right side wins!"
        else -> "Let's fight again!"
    }
}

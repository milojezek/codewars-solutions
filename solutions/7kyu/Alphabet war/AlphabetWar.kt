fun alphabetWar(fight: String): String {
    var leftSideScore = 0
    var rightSideScore = 0

    val leftSidePower = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1)
    val rightSidePower = mapOf('m' to 4, 'q' to 3, 'd' to 2, 'z' to 1)
    
    for (letter in fight) {
        when (letter) {
        in leftSidePower.keys -> leftSideScore += leftSidePower.getValue(letter)
        in rightSidePower.keys -> rightSideScore += rightSidePower.getValue(letter)
        else -> continue
        }
    }
    
    return when {
        leftSideScore > rightSideScore -> "Left side wins!"
        leftSideScore < rightSideScore -> "Right side wins!"
        else -> "Let's fight again!"
    }
}

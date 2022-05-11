fun findShort(s: String): Int {
    val splittedString = s.split(" ")
    var shortest = splittedString[0]
    for (word in splittedString) {
        if (word.length < shortest.length) shortest = word else continue
    }
    
    return shortest.length
}

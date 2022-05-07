fun fireFight(s: String): String {
    // return s.replace("Fire", "~~")
    var stringAsList = s.split(" ").toMutableList()
    for (word in stringAsList) {
        if (word == "Fire") {
            stringAsList[stringAsList.indexOf(word)] = "~~"
        } else {
            continue
        }
    }
    
    return stringAsList.joinToString(" ")
    

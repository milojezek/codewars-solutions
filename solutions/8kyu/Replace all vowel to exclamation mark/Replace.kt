fun replace(string: String): String {
    var newString = ""
    for (aChar in string) {
        if (aChar in "AEIOUaeiou") {
            newString += "!"
        } else {
            newString += aChar
        }
    }
    
    return newString
}

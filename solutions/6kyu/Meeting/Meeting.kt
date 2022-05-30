fun meeting(s: String): String {
    val result = mutableListOf<String>()
    for (fullName in s.uppercase().split(";")) {
        val forename = fullName.split(":")[0]
        val surname = fullName.split(":")[1]
        result.add("($surname, $forename)")
    }
    
    result.sort()
    return result.joinToString("")
}

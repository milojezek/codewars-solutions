object FixStringCase {
    
    fun solve(s: String): String {
        var upperChars = 0; var lowerChars = 0
        for (char in s) {
            if (char.isUpperCase()) upperChars++ else lowerChars++
        }
        
        when {
            upperChars > lowerChars -> return s.uppercase()
            upperChars < lowerChars || upperChars == lowerChars -> return s.lowercase()
            else -> return s
        }
    }
    
}

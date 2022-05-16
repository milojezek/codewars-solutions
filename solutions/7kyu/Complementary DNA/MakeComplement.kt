package dna

fun makeComplement(dna : String) : String {
    val compList = mutableListOf<Char>()
    for (letter in dna) {
        compList.add(when (letter) {
            'A' -> 'T'
            'T' -> 'A'
            'G' -> 'C'
            'C' -> 'G'
            else -> continue
        })
    }
    
    return compList.joinToString("")
}

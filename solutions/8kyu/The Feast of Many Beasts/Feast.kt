fun feast(beast: String, dish: String): Boolean {
    val firstSame = beast.first() == dish.first()
    val lastSame = beast.last() == dish.last()
    return if (firstSame && lastSame) true else false
}

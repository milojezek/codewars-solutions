fun highAndLow(numbers: String): String {
    val numberList = numbers.split(" ").map { it.toInt() }
    return "${numberList.maxOrNull()} ${numberList.minOrNull()}"
}

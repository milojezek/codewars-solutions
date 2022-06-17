fun fizzBuzz(n: Int): Array<String> {
    val fizzBuzzList: MutableList<String> = mutableListOf()
    for (number in 1..n) {
        fizzBuzzList.add(when {
            number % 5 == 0 && number % 3 == 0 -> "FizzBuzz"
            number % 5 == 0 -> "Buzz"
            number % 3 == 0 -> "Fizz"
            else -> number.toString()
        })
    }
    
    return fizzBuzzList.toTypedArray()
}

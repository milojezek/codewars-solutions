fun fizzBuzz(n: Int): Array<String> {
    val fizzBuzzList: MutableList<String> = mutableListOf()
    for (number in 1..n) {
        when {
            number % 5 == 0 && number % 3 == 0 -> fizzBuzzList.add("FizzBuzz")
            number % 5 == 0 -> fizzBuzzList.add("Buzz")
            number % 3 == 0 -> fizzBuzzList.add("Fizz")
            else -> fizzBuzzList.add(number.toString())
        }
    }
    
    return fizzBuzzList.toTypedArray()
}

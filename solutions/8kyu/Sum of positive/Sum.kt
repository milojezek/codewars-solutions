fun sum(numbers: IntArray): Int {
    var sum = 0
    for (number in numbers) {
        if (number > 0) sum += number else continue
    }
    
    return sum
}

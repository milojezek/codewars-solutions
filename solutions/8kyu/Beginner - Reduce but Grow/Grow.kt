package reducebutgrow

fun grow(arr: IntArray): Int {
    var result = 1
    for (number in arr) {
        result *= number
    }
    
    return result
}

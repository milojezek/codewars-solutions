fun persistence(num: Int) : Int {
    var currentNumber = num.toString()
    var auxiliarNumber = 1
    var numberPersistence = 0
    
    while (currentNumber.length != 1) {
        for (digit in currentNumber) {
            auxiliarNumber *= digit.digitToInt()
        }
        
        currentNumber = auxiliarNumber.toString()
        auxiliarNumber = 1
        numberPersistence++
    }
    
    return numberPersistence
}

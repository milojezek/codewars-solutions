object Kata {
  fun digitize(n:Long):IntArray {
      val charList = n.toString().toList()
      var intList: List<Int> = mutableListOf<Int>()
      for (digit in charList) {
          val digitAsInt = digit.digitToInt()
          intList += digitAsInt
      }
      
      val finalIntArray = intList.reversed().toIntArray()
      return finalIntArray
  }
}

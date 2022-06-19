object EnoughIsEnough {
  fun deleteNth(elements: IntArray, maxOcurrences: Int): IntArray {
        val count = mutableMapOf<Int, Int>()
        val result = mutableListOf<Int>()
        
        elements.forEach {
            count[it] = if (it in count.keys) count[it]!! + 1 else 1
            if (count[it]!! <= maxOcurrences) result.add(it)
        }

        return result.toIntArray()
    }
}

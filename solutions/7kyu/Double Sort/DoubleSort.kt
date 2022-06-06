package com.codewars.a.partridge

object DoubleSort {
    fun dbSort(a:Array<Any>):Array<Any> {
        var intList: MutableList<Int> = mutableListOf()
        var strList: MutableList<String> = mutableListOf()
        for (element in a) {
            when (element) {
                is Int -> intList.add(element)
                is String -> strList.add(element)
            }
        }
        
        return (intList.sorted() + strList.sorted()).toTypedArray()
    }
}

package org.example

class StringCalculator {

    fun add(numbers: String): Int {
        var sum = 0
        if(numbers != "") {
            val numbersMap = HashMap<Int, Int>()
            numbers.split(',').mapIndexed { index, num ->
                numbersMap.put(index + 1, num.toInt())
            }
            sum = (numbersMap[1] ?: 0) + (numbersMap[2] ?: 0)
        }
        return sum
    }
}
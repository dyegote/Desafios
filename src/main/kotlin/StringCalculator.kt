package org.example

class StringCalculator {

    fun add(numbers: String): Int {
        val sum: Int
        if(numbers == "") {
            sum = 0
        } else {
            val numbersList: List<Int> = numbers.split(',').map { it.toInt() }
            if(numbersList.size == 1)
                sum = numbersList[0]
            else
                sum = numbersList[0] + numbersList[1]
        }
        return sum
    }
}
package org.example

class StringCalculator {

    fun add(numbers: String): Int {
        var sum = 0
        if(numbers != "") {
            numbers.split(',').mapIndexed { index, num ->
                sum += num.toInt()
            }
        }
        return sum
    }
}
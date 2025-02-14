import org.example.StringCalculator
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StringCalculatorTest {

    val stringCalculator: StringCalculator by lazy { StringCalculator() }

    @Test
    fun `GIVEN string number empty WHEN Call add THEN result is 0`() {
        val stringNumbers = ""
        val sum = stringCalculator.add(stringNumbers)
        assertEquals(0, sum)
    }

    @Test
    fun `GIVEN string number is 5 WHEN Call add THEN result is 5`() {
        val stringNumbers = "5"
        val sum = stringCalculator.add(stringNumbers)
        assertEquals(5, sum)
    }

    @Test
    fun `GIVEN string number is 3,6 WHEN Call add THEN result is 9`() {
        val stringNumbers = "3,6"
        val sum = stringCalculator.add(stringNumbers)
        assertEquals(9, sum)
    }
}
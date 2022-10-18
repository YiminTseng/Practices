import org.junit.Test

import org.junit.Assert.*

class QuestionFourTest {

    @Test
    fun doCalculateTest() {
        val expected = "1+2-3=0"
        val actual = QuestionFour().doCalculate(3)
        assertEquals(expected,actual)
    }

    @Test
    fun printAndCalculateTest() {
        val expected = "1+2-3=0"
        val actual = QuestionFour().printAndCalculate(3)
        assertEquals(expected,actual)
    }
}
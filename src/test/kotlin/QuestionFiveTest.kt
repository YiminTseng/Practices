import org.junit.Test

import org.junit.Assert.*

class QuestionFiveTest {

    @Test
    fun umlevenTest() {
        val expected =160
        val actual = QuestionFive().umleven(10)
        assertEquals(expected, actual)
    }
}
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class QuestionOneKtTest {

    val questionOne = QuestionOne()

    @Test
    fun playMoveTest() {
        val expected = "照常播放電影"
        val actual = questionOne.playMovie(4
        )
        assertEquals(expected,actual)
    }
    @Test
    fun playMoveTest2() {
        val expected = "沒有客人"
        val actual = questionOne.playMovie(0
        )
        assertEquals(expected,actual)
    }
}
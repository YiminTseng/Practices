import org.junit.Assert.*
import org.junit.Test
import java.util.*

class QuestionTwoKtTest{

//    val queationTwo = QuestionTwo()

    @Test
    fun sameRemainderTest(){
        val expected = "餘數相同"
        val actual = sameRemainder(14,17)
        assertEquals(expected,actual)
    }
    @Test
    fun sameRemainderTest2(){
        val expected = "餘數不同"
        val actual = sameRemainder(9,7)
        assertEquals(expected,actual)
    }
    @Test
    fun checkScannerTest(){
        val expected = mutableListOf<Int>( 1, 4)
        val str = "1 4"
        val actual = checkScanner(str)
        assertEquals(expected,actual)
    }

}
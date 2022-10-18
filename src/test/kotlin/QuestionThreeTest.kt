import org.junit.Assert.*
import org.junit.Test

class QuestionThreeTest{
    val questionThree =QuestionThree()

    @Test
    fun getTicketPriceTest(){
        val expected = "優惠半價 : 200"
        val actual = questionThree.getTicketPrice(6)
        assertEquals(expected,actual)
    }

    @Test
    fun getNormalTicketPriceTest(){
        val expected = "一般票價 : 400"
        val actual = questionThree.getTicketPrice(64)
        assertEquals(expected,actual)
    }

}
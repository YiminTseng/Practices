import java.util.*

class QuestionThree {
    private val ticketPrice = 400
    fun getTicketPrice(age: Int):String {
       return if (age > 64 || age < 7) {
           "優惠半價 : ${ticketPrice/2}"
        } else {
           "一般票價 : $ticketPrice"
        }
    }
}


fun main() {
    println("請輸入年齡:")
    val input = readln().toInt()
    QuestionThree().getTicketPrice(input).let(::println)

}
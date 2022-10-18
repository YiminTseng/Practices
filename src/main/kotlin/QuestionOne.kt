fun main() {
    println("請輸入買票人數:")
    val customers = readln().toInt()
    val result = QuestionOne().playMovie(customers)
    println(result)

}
class QuestionOne {
    fun playMovie(customers: Int): String {
        return if (customers > 0) "照常播放電影" else "沒有客人"
    }
}

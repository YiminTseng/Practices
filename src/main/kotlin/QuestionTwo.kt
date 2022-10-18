import java.util.*

fun main() {
    println("請輸入2個整數並以空白鍵分開:")
    val str = readln()
    val numList = checkScanner(str)
    if(numList.isNotEmpty()){
    val result = sameRemainder(numList[0],numList[1])
    println(result)}
}

fun checkScanner(input :String):List<Int>{
    val intList = mutableListOf<Int>()
    try {
        val firstNumber = input.split(" ")[0].toInt()
        val secondNumber = input.split(" ")[1].toInt()
        intList.apply {
            add(firstNumber)
            add(secondNumber)
        }
        println("第1個數字 : $firstNumber\t第2個數字 : $secondNumber")
    } catch (e: Exception) {
        println("類型必須是整數")
    }
    return intList
}
fun sameRemainder(firstNumber: Int, secondNumber: Int): String {
    return if (firstNumber % 3 == secondNumber % 3) "餘數相同" else "餘數不同"
}
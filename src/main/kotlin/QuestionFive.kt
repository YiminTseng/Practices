//5. 寫一個遞迴函數 function umleven(n) 來求算 2*4 + 4*6 + 6*8...+(n-2)*n
// a1  n = 4  4*2 = 8
// a2  n = 6  6*4 = 24
// a3  n = 8  8*6 = 48
// a4  n = 10 10*8 = 80
// a5  n=
// n*(n-2)


class QuestionFive {
    fun umleven(n: Int): Int {
        val next = n - 2
        return if (n == 4) 8 else n * next + umleven(next)
    }
}

fun main() {
    val result = QuestionFive().umleven(8)
    println(result)
}
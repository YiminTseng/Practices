class QuestionFour {
    fun doCalculate(n: Int):String {
        val intList = mutableListOf<Int>()
        var sum = 0
        val stringBuilder = StringBuilder()
        for (i in 1..n) {
            intList.add(i)
        }
        for (i in intList) {
            when {
                i == n -> if (i % 2 == 1) {
                    sum -= i
                    stringBuilder.append("$i=$sum")
                } else {
                    sum += i
                    stringBuilder.append("$i=$sum")
                }
                i % 2 == 1 -> if (i == 1) {
                    sum += i
                    stringBuilder.append("$i+")
                } else {
                    sum -= i
                    stringBuilder.append("$i+")
                }
                i % 2 == 0 -> {
                    sum += i
                    stringBuilder.append("$i-")
                }
            }
        }
        return stringBuilder.toString()
    }

    fun printAndCalculate(n: Int):String {
        val stringBuilder=StringBuilder()
        var sum = 1

        for (i in 1..n) {
            stringBuilder.append(i)
            if (i < n) {
                if (i % 2 == 1) {
                    stringBuilder.append("+")
                    if (i > 1) sum -= i
                } else {
                    stringBuilder.append("-")
                    sum += i
                }
            } else {
                if (i % 2 == 1) {
                    sum -= i
                } else sum += i
                stringBuilder.append("=$sum")
            }
        }
        return stringBuilder.toString()
    }
}

fun main() {
    val questionFour = QuestionFour()
    questionFour.printAndCalculate(5)
    println()
    questionFour.doCalculate(10)
}
//9. 宣告兩個具有5個元素的整數陣列 arr1 和 arr2 ，
// 並利用陣列設定初值的方式將 arr1[0]~arr1[4] 分別設值為 2,3,1,7,9，
// arr2[0]~arr2[4] 分別設值為 8,7,9,3,1，將 arr1 與 arr2 兩陣列對應項相加，列印出相加後的陣列

fun main() {
    val arr1 = IntArray(5)
    val arr2 = IntArray(5)

    arr1[0] = 2
    arr1[1] = 3
    arr1[2] = 1
    arr1[3] = 7
    arr1[4] = 9
    arr2[0] = 8
    arr2[1] = 7
    arr2[2] = 9
    arr2[3] = 3
    arr2[4] = 1
    val arr3 = IntArray(5)
    for (i in arr3.indices) {
        arr3[i] = arr1[i] + arr2[i]
    }

    arr3.forEach { print("$it ") }
}
package baekjoon

import java.util.*

fun main() {
    val N = readLine()!!.toInt()
    val array = Arrays.stream(readLine()!!.split(" ".toRegex()).dropLastWhile { it.isEmpty() }
        .toTypedArray()).mapToInt { s: String -> s.toInt() }.toArray()

    var sum = array.size
    for (i in array.indices) {
        if (array[i] == 0 || array[i] == 1) {
            sum--
        }
        val hasPrime = true
        var j = 2
        while (j <= Math.sqrt(array[i].toDouble())) {
            if (array[i] % j == 0) {
                sum--
                break
            }
            j++
        }
    }
    println(sum)
}

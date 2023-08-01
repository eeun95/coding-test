package baekjoon

fun main() {
    var n = 0
    while (n != -1) {
        n = readLine()!!.toInt()
        var sum = 0
        val list = ArrayList<Int>()
        for (i in 1 until n) {
            if (n % i == 0) {
                sum += i
                list.add(i)
            }
        }
        if (n == sum) {
            val join = list.joinToString(" + ")
            println("$n = $join")
        } else {
            println("$n is NOT perfect.")
        }
    }
}
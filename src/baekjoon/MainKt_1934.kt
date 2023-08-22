package baekjoon


fun main() {
    val T = readLine()!!.toInt()

    val sb = StringBuilder()
    for (i in 0 until T) {
        val s = readLine()!!.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val A = s[0].toInt()
        val B = s[1].toInt()
        val n = gcd(A, B)
        sb.append(A * B / n).append("\n")
    }
    println(sb)
}

fun gcd(a: Int, b: Int): Int {
    var a = a
    var b = b
    while (b != 0) {
        val r = a % b // 나머지를 구해준다.

        // GCD(a, b) = GCD(b, r)이므로 변환한다.
        a = b
        b = r
    }
    return a
}
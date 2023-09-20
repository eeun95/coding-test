package baekjoon

import java.util.*

fun main() {
    val st = StringTokenizer(readLine()!!, " ")
    val N = st.nextToken().toInt()
    val B = st.nextToken().toInt()

    val s = Stack<Int>()
    var quotient = N
    var remain: Int
    while (quotient >= B) {
        remain = quotient % B
        quotient /= B
        s.push(remain)
    }
    s.push(quotient)

    val sb = StringBuilder()
    while (!s.empty()) {
        val n = s.pop()
        if (n >= 10) {
            val c = (n + 55).toChar()
            sb.append(c)
        } else {
            sb.append(n)
        }
    }
    println(sb)
}

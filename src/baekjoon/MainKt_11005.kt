package baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

    fun main(args: Array<String>) {
        val st = StringTokenizer(readLine()!!, " ")
        val N = st.nextToken().toInt()
        val B = st.nextToken().toInt()

        // 10진법 수 N을 B진법으로 출력
        // 60466175 36 ZZZZZ

        //(36^4 * 35 )+ (36^3 * 35 +) + (36^2 * 35) + (36^1 * 35) + 35

        // 8 2 1000(2)
        // 18 3 200(3)
        val s = Stack<Int>()
        var quotient = N
        var remain: Int
        while (quotient >= B) {
            remain = quotient % B
            quotient /= B
            s.push(remain)
        }
        s.push(quotient)

        // 65 = A
        // 90 = Z
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

package baekjoon

import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val st = StringTokenizer(readLine())
    val array = IntArray(n)
    val dp = Array(n) { IntArray(2) }

    for(i in 0 until n) {
        array[i] = st.nextToken().toInt()
    }
    var max = array[0]
    dp[0][0] = array[0]
    dp[0][1] = array[0]

    for(i in 1 until n) {
        dp[i][0] = Math.max(dp[i-1][0]+array[i], array[i])
        dp[i][1] = Math.max(dp[i-1][0], dp[i-1][1]+array[i])
        max = Math.max(max, Math.max(dp[i][0], dp[i][1]))
    }
    println(max)
}
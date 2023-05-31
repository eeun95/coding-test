package baekjoon

import java.util.*

fun main() {
    val n : Int = readLine()!!.toInt()
    val array = IntArray(n)
    val dp = IntArray(n)

    val st = StringTokenizer(readLine(), " ")
    var cnt = 0
    while(st.hasMoreTokens()) {
        array[cnt] = st.nextToken().toInt()
        cnt++
    }
    dp[0] = array[0]
    for (i in 1 until  n) {
        dp[i] = Math.max(dp[i-1]+array[i], array[i])
    }
    println(Arrays.stream(dp).max().asInt)
}
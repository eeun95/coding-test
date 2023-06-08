package baekjoon

import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val dp = Array(n+1) { IntArray(2) }

    // 0은 0으로 끝나는 이친수의 갯수
    // 1은 1로 끝나는 이친수의 갯수
    // 한자리 이친수의 개수는 1로 끝나는 1뿐이므로 [1][0]=0 [1][1]=1 세팅
    dp[1][0] = 0
    dp[1][1] = 1
    dp[2][0] = 1
    dp[2][1] = 0

    for(i in 3 until n+1) {
        dp[i][0] = dp[i-2][0]+dp[i-1][0]
        dp[i][1] = dp[i-2][1]+dp[i-1][1]
    }
    println(dp[n][0]+dp[n][1])
}
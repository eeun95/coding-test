package baekjoon

import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val dp = Array(n+2) { LongArray(2) }
    // n+1해주면 ArrayIndexOutOfBounds err

    // 0은 0으로 끝나는 이친수의 갯수
    // 1은 1로 끝나는 이친수의 갯수
    // 한자리 이친수의 개수는 1로 끝나는 1뿐이므로 [1][0]=0 [1][1]=1 세팅

    // 1
    // [10]
    // [100 101]

    // 최댓값이 90인데 90넣으면 가질 수 있는 범위 초과!
    // int 가 아니라 long으로 해줘야함

    dp[1][0] = 0L
    dp[1][1] = 1L
    dp[2][0] = 1L
    dp[2][1] = 0L

    for(i in 3 until n+1) {
        dp[i][0] = dp[i-2][0]+dp[i-1][0]
        dp[i][1] = dp[i-2][1]+dp[i-1][1]
    }
    println(dp[n][0]+dp[n][1])
}
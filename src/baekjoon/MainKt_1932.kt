package baekjoon

import java.util.*

private val n = readLine()!!.toInt()
private var dp = Array(n) {IntArray(n)}

fun main() {
    for (i in 0 until n) {
        var st : StringTokenizer = StringTokenizer(readLine())
        var cnt = 0
        while (st.hasMoreTokens()) {
            var num = st.nextToken().toInt()
            dp[i][cnt] = num
            cnt++
        }
    }
    for(i in 1 until n) {
        for(j in 0 until n) {
            dp(i, j)
        }
    }

    val max = Arrays.stream(dp[n - 1]).max().asInt
    println(max)
}
fun dp(i : Int, j : Int){
    if(j==0) {
        dp[i][j] = dp[i-1][j] + dp[i][0]
    } else if(i==j) {
        dp[i][j] = dp[i-1][j-1] + dp[i][j]
    } else {
        dp[i][j] = Math.max(dp[i - 1][j - 1] + dp[i][j], dp[i - 1][j] + dp[i][j])
    }
}

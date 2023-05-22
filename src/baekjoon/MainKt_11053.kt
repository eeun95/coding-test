package baekjoon

import java.util.*

private var array = emptyArray<Int>()
private var dp = emptyArray<Int>()

fun main() {
    var N = readLine()!!.toInt()
    array = arrayOf(N)
    dp = arrayOf(N)
    var st = StringTokenizer(readLine(), " ")
    var i=0
    while (st.hasMoreTokens()) {
        array[i] = st.nextToken().toInt()
        i++
    }

    for(j in 0 until N) {
        dp(j)
    }
}
fun dp(n : Int) : Int {
    if(dp[n] == 0) {
        dp[n] = 1

        for (i in n-1 downTo 0) {
            if(array[i] < array[n]) {
                dp[n] = Math.max(dp[n], dp(i)+1)
            }
        }
    }
    return dp[n]
}

package baekjoon

import java.util.*

var array = emptyArray<Int>()
var dp = emptyArray<Int>()

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
        dpTopDown(j)
    }
}
fun dpTopDown(n : Int) : Int {
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

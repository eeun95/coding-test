package baekjoon

import java.util.*

private var dp = emptyArray<Array<Int>>()
private var home = emptyArray<Array<Int>>()

fun main() {
    val N : Int = readLine()!!.toInt()
    dp = Array(N) {
        Array(3){0}
    }
    home = Array(N) {
        Array(3){0}
    }

    for (i in 0 until N) {
        val st = StringTokenizer(readLine(), " ")
        home[i][0] = st.nextToken().toInt()
        home[i][1] = st.nextToken().toInt()
        home[i][2] = st.nextToken().toInt()
    }

    dp[0][0] = home[0][0]
    dp[0][1] = home[0][1]
    dp[0][2] = home[0][2]

    println(Math.min(dp(0, N - 1), Math.min(dp(1, N - 1), dp(2, N - 1))))

    fun dp(color:Int, N:Int):Int {
        if(dp[N][color]==0) {
            if (color == 0) {
                Main_1149.dp[N][color] = Math.min(Main_1149.dp(1, N - 1), Main_1149.dp(2, N - 1)) + Main_1149.home[N][color]
            } else if (color == 1) {
                Main_1149.dp[N][color] = Math.min(Main_1149.dp(0, N - 1), Main_1149.dp(2, N - 1)) + Main_1149.home[N][color]
            } else if (color == 2) {
                Main_1149.dp[N][color] = Math.min(Main_1149.dp(0, N - 1), Main_1149.dp(1, N - 1)) + Main_1149.home[N][color]
            }
        }
        return dp[N][color]
    }
}

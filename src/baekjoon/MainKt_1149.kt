package baekjoon

import java.util.StringTokenizer

private var dp = emptyArray<Array<Int>>()
private var home = emptyArray<Array<Int>>()

fun main() {
    val N : Int = readLine()!!.toInt()
    dp = Array(N) {
        emptyArray()
    }
    home = Array(N) {
        kotlin.emptyArray()
    }

    for (i in 0 until N) {
        val st = StringTokenizer(readLine(), " ")
        val cnt = 0
        while(st.hasMoreTokens()) {
            home[i][cnt] = st.nextToken().toInt()
        }
    }
}
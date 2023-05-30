package baekjoon

import java.util.StringTokenizer

fun main() {
    val n : Int = readLine()!!.toInt()
    val array = arrayListOf<Int>(n)

    val st = StringTokenizer(readLine(), " ")
    var cnt = 0
    while(st.hasMoreTokens()) {
        array[cnt] = st.nextToken().toInt()
        cnt++
    }
}
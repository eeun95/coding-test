package baekjoon

import java.lang.module.ModuleDescriptor.read
import java.util.*

fun main() {
    var N = readLine()!!.toInt()
    var array = IntArray(n)

    var st = StringTokenizer(readLine(), " ")
    var i=0
    while (st.hasMoreTokens()) {
        array[i] = st.nextToken().toInt()
        i++
    }
}
package baekjoon

import java.util.*

var arr = emptyArray<Int?>()

fun main() {
    val sb : StringBuilder = StringBuilder()

    val N = readLine()!!.toInt()
    arr = arrayOfNulls(N)


    val st : StringTokenizer = StringTokenizer(readLine())
    for (i in 0 until N) {
        arr[i] = st.nextToken().toInt()
    }
    Arrays.sort(arr)

    val M = readLine()!!.toInt()
    val s = readLine()!!.split(" ")
    for(i in 0 until M) {
        var num = s[i].toInt()
        if(binarySearch(num)) {
            sb.append("1 ")
        } else {
            sb.append("0 ")
        }
    }
    print(sb.toString())

}

fun binarySearch(num:Int) : Boolean {
    var left = 0
    var right = arr.size -1

    while(left <= right) {
        var mid = (left+right)/2
        if(num > arr[mid]!!) {
            left = mid+1
        } else if(num < arr[mid]!!) {
            right = mid-1
        } else {
            return true;
        }
    }
    return false;
}
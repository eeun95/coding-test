package baekjoon

fun main() {
    val input: List<String> = readLine()!!.split(" ")
    val N:String = input.get(0)
    val B:Double = input.get(1).toDouble()

    var sum:Long = 0
    var j = 0
    for (i in N.length - 1 downTo 0) {
        var c = N[j]
        var ascii = 0

        if( c>= '0' && c<= '9') {
            ascii = c-'0'
        } else {
            ascii = c-(55.toChar())
        }
        sum += ascii * (Math.pow(B, i.toDouble())).toLong()

        j++
    }
    print(sum)
}
package baekjoon

fun main() {
    var s: String? = readLine()

    var sArray: Array<String?> = arrayOfNulls(s!!.length)
    for (i in 0 until s!!.length) {
        sArray[i] = s.substring(i, i+1)
    }

    var result:Int = 1
    var j:Int = s.length-1
    for(i in 0 until s!!.length/2 step 1 step j.dec()) {
        if(!sArray[i].equals(sArray[j])) {
            result = 0
            break
        }
    }
    print(result)

}

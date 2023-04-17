package baekjoon

fun main() {
    val count:Int = 5
    val maxLength:Int = 15
    var arr: ArrayList<ArrayList<String>> = ArrayList<ArrayList<String>>()

    for(i in 0 until maxLength) {
        arr.add(ArrayList<String>())
    }

    for (i in 0 until count) {
        val s:String = readLine()!!
        for (j in 0 until s.length) {
            arr.get(j).add(s.substring(j, j+1))
        }
    }
    var sb:StringBuilder = StringBuilder()
    for (list in arr) {
        if(list.isNotEmpty()) {
            for( s in list) {
                sb.append(s)
            }
        }
    }
    print(sb.toString())
}
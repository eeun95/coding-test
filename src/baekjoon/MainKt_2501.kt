package baekjoon

fun main() {
    val s = readLine()!!.split(" ")
    val N = s[0].toInt()
    val K = s[1].toInt()

    // 6
    // 1 2 3 6
    // 3
    val list = ArrayList<Int>()
    for (i in 1..N) {
        if (N % i == 0) {
            //System.out.println(i);
            list.add(i)
        }
    }
    if (list.size < K) {
        println("0")
    } else {
        println(list[K - 1])
    }
}

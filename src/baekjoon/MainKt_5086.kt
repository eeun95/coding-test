package baekjoon
fun main() {
    while (true) {
        val br = readLine()!!
        val s = br.split(" ")
        if (s[0] == "0" && s[1] == "0") break

        val first = s[0].toInt()
        val second = s[1].toInt()
        if (second % first == 0) {
            println("factor")
        } else if (first % second == 0) {
            println("multiple")
        } else {
            println("neither")
        }
    }
}


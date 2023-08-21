package baekjoon

fun main() {
    val N = readLine()!!.toInt()
    val F = readLine()!!.toInt()

    // 정수 N의 가장 뒤 두 자리를 적절히 바꿔서 N을 F로 나누어 떨어지게 만들려고 한다.
    // 만약 가능한 것이 여러 가지이면, 뒤 두 자리를 가능하면 작게 만들려고 한다.
    var n = N / 100 * 100
    while (true) {
        if (n % F == 0) break
        n++
    }
    println((n.toString() + "").substring((n.toString() + "").length - 2, (n.toString() + "").length))
}

package baekjoon

fun main() {
    val arr = Array(9) { IntArray(9) } // 9x9 크기의 배열 생성
    var max = 0 // 최댓값 저장할 변수 초기화
    var row = 0 // 최댓값 위치(행) 저장할 변수 초기화
    var col = 0 // 최댓값 위치(열) 저장할 변수 초기화

    // 2차원 배열 입력 받기
    for (i in 0 until 9) {
        val input = readLine()!!.split(" ")
        for (j in 0 until 9) {
            arr[i][j] = input[j].toInt()
            if (arr[i][j] > max) {
                max = arr[i][j]
                row = i
                col = j
            }
        }
    }

    // 결과 출력
    println("$max")
    println("${row+1} ${col+1}")
}
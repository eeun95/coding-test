package baekjoon;

import java.util.Scanner;

public class Main_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        // 1 (1/1)
        // 2 3 (2/1 1/2)
        // 6 5 4 (3/1 2/2 1/3)
        // 7 8 9 10 (4/1 3/2 2/3 1/4)
        // 각 줄에 칸의 갯수는 (분자+분모)-1
        int cross_count = 1, prev_count_sum = 0;

        while (true) {

            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (X <= prev_count_sum + cross_count) {

                if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면
                    // 분자가 큰 수부터 시작
                    // 분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1)
                    // 분모는 X 번째 - 직전 대각선까지의 블럭 개수
                    System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                }

                else {	// 대각선상의 블럭의 개수가 짝수라면
                    // 홀수일 때의 출력을 반대로
                    System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
                    break;
                }

            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }

    }
}

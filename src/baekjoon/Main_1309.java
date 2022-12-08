package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();       // 사자 우리의 크기
        int[][] dp = new int[N + 1][N + 1];

        dp[N][0] = 1;               // 한마리도 배치하지 않을 경우 = 1
        dp[N][1] = (2*N);           // 한마리씩 배치할 경우 가로X세로
        dp[N][N] = 2;               // 우리가 꽉 찬 지그재그 배치 = 2

        // 추가되는 줄 아래는 직전 데이터 . .
        for (int i = 3; i <= N; i++) {
            dp[N][i] = 0 + dp[N-1][i];
        }

        int sum = Arrays.stream(dp[N]).sum();

    }
}

package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();       // 사자 우리의 크기
        int[][] dp = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            dp[i][0] = 1;           // 한마리도 배치하지 않을 경우 = 1
            dp[i][1] = (2*N);       // 한마리씩 배치할 경우 가로X세로
            dp[i][N] = 2;           // 우리가 꽉 찬 지그재그 배치 = 2
            for (int j = 2; j < i; j++) {
                //System.out.println("dp[" + (i - 1) + "][" + (j) + "]");
                dp[i][j] = (2 * (2 * (N - 1)-1)) + dp[i - 1][j];
                //System.out.println((2 * (2 * (N - 1)-1)) + " + " + dp[i - 1][j]);
            }
        }
        int sum = Arrays.stream(dp[N]).sum();
        System.out.println(sum%9901);

    }
}

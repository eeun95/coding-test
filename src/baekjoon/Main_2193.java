package baekjoon;

import java.util.Scanner;

public class Main_2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Long[][] dp = new Long[N+1][2];
        dp[1][0] = 0L;       // 한자리 수 중 0으로 끝나는 이친수 갯수
        dp[1][1] = 1L;       // 한자리 수 중 1로 끝나는 이친수 갯수

        for (int i = 2; i <= N; i++) {
            dp[i][0] = dp[i-1][0]+dp[i-1][1];
            dp[i][1] = dp[i-1][0];
            System.out.println(dp[i-1][0]+" "+dp[i-1][1]);
        }

        System.out.println(dp[N][0]+dp[N][1]);

    }
}

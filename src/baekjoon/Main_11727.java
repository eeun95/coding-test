package baekjoon;

import java.util.Scanner;

public class Main_11727 {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dp = new int[N+1];

        // 초기값 세팅
        dp[1] = 1;
        if(N>1) {
            dp[2] = 3;
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i-1] + (2*dp[i-2]))%10007;
        }
        System.out.println(dp[N]);

    }
}

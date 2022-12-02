package baekjoon;

import java.util.Scanner;

public class Main_11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[1001];
        dp[1] = 10;
        dp[2] = 55;
        int plus = 0;
        for (int i = 9; i > 0; i--) {
            for (int j=1; j<=i; j++) {
                plus += j;
            }
        }
        for (int n = 3; n <= N; n++) {
            dp[n] = (dp[n-1] + plus)%10007;
        }
        System.out.println(dp[N]);
    }
}

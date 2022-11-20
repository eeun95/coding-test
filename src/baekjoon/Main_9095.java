package baekjoon;

import java.util.Scanner;

public class Main_9095 {
    static int[] dp = new int[11];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] array = new int[N];

        dp[1] = 1; // (1) - 1가지
        dp[2] = 2; // (1+1, 2) - 2가지
        dp[3] = 4; // (1+1+1, 1+2, 3) - 4가지
        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            array[i] = start;
            for (int j = 4; j <= start; j++) {
                dp[j] = dp[j-1]+dp[j-2]+dp[j-3];
            }
        }
        for (int n : array) {
            System.out.println(dp[n]);
        }
    }
}

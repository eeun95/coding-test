package baekjoon;

import java.io.*;

public class Main_2579 {
    static Integer[] dp;
    static int[] stair;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        stair = new int[N+1];
        dp = new Integer[N+1];
        for (int i = 1; i <= N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = stair[0];
        dp[1] = stair[1];

        if(N>=2) {
            dp[2] = stair[1]+stair[2];
        }
        System.out.println(dp(N));
    }
    static int dp(int N) {
        if (dp[N] == null) {
            dp[N] = Math.max(dp(N - 2), dp(N - 3) + stair[N - 1]) + stair[N];
        }
        return dp[N];
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9461 {
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        /*

        역삼각형을 만들땐 전 정삼각형의 변 두개의 합
        정삼각형을 만들땐 전 역삼각형의 변 두개의 합

        점화식 도출하면?
        dp[i] = dp[i-1]+dp[i-5]
        */
        dp = new long[101];
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            // 초기값 세팅
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            dp[5] = 2;
            for (int j = 1; j <= N; j++) {
                dp(j);
            }
            System.out.println(dp[N]);
        }
    }
    static long dp(int N) {
        if(N<=5) return dp[N];
        dp[N] = dp[N-1] + dp[N-5];
        return dp[N];
    }
}

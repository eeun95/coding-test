package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1149 {
    static int[][] dp;
    static int[][] home;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        home = new int[N][3];
        dp = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            home[i][0] = Integer.parseInt(st.nextToken());
            home[i][1] = Integer.parseInt(st.nextToken());
            home[i][2] = Integer.parseInt(st.nextToken());

        }
        dp[0][0] = home[0][0];
        dp[0][1] = home[0][1];
        dp[0][2] = home[0][2];

        System.out.println(Math.min(dp(0, N-1), Math.min(dp(1, N-1), dp(2, N-2))));
    }

    static int dp(int color, int N) {

        if(dp[N][color] == 0) {
            if (color == 0) {
                dp[N][color] = home[N][color] + Math.min(dp(1, N-1), dp(2, N-1));
            } else if (color == 1) {
                dp[N][color] = home[N][color] + Math.min(dp(0, N-1), dp(2, N-1));
            } else if (color == 2) {
                dp[N][color] = home[N][color] + Math.min(dp(0, N-1), dp(1, N-1));
            }
        }
        return dp[N][color];
    }
}

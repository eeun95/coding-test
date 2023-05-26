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

        home = new int[N][N];
        dp = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int cnt = 0;
            while(st.hasMoreTokens()) {
                home[i][cnt] = Integer.parseInt(st.nextToken());
                cnt++;
            }
        }
    }
    public int dp(int color, int i, int j) {
        if(color==0) {
            dp[i][j] = home[i][j] + Math.min(dp(1, i, j), dp(2, i, j));
        } else if(color==1) {
            dp[i][j] = home[i][j] + Math.min(dp(0, i, j), dp(2, i, j));
        } else if(color==2) {
            dp[i][j] = home[i][j] + Math.min(dp(0, i, j), dp(1, i, j));
        }
        return dp[i][j];
    }
}

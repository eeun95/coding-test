package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2775 {
    static int count=0;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        // a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야한다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.valueOf(br.readLine());     // 테스트 케이스 수
        int[] result = new int[T];
        for (int i = 0; i < T; i++) {
            count = 0;
            int k = Integer.valueOf(br.readLine());     // k층
            int n = Integer.valueOf(br.readLine());     // n호
            dp = new int[k+1][n+1];
            for (int j = 1; j <= n; j++) {
                dp[0][j] = j;
            }
            result[i] = dp(k, n);
        }

        for (int r : result) {
            System.out.println(r);
        }
    }
    public static int dp(int k, int n) {
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i][j-1]+dp[i-1][j];
                //System.out.println("dp["+i+"]["+j+"] = dp["+i+"]["+(j-1)+"] + dp["+(i-1)+"]["+j+"]");
                //System.out.println(dp[i][j]+" = "+dp[i][j-1]+" + "+dp[i-1][j]);
            }
        }
        return dp[k][n];
    }
}

/*
*
* 0층 1:1 2:2 3:3 4:4..
* 1층 1:1 2:3 3:6 4:10.. 2 3 4
* 2층 1:1 2:4 3:10 4:20.. 3 6 10
* 3층 1:1 2:5 3:15 4:35.. 4 10 20
*
* 직전 호수만큼씩 커진다
*
* */

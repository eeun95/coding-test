package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[][] triangle = new int[n][n];
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int j = 0;
            while (st.hasMoreTokens()) {
                triangle[i][j] = Integer.valueOf(st.nextToken());
                j++;
            }
        }

        int max = 0;

        // 초기값 세팅
        dp[0][0] = triangle[0][0];
        for(int j=1; j<triangle.length; j++) {
            for (int k = 0; k < triangle[j].length; k++) {
                int now = triangle[j][k];
                if(k==0)
                    dp[j][k] = now+dp[j-1][k];
                else
                    dp[j][k] = Math.max(now+dp[j-1][k-1], now+dp[j-1][k]);
                //System.out.println(dp[j][k]);
            }
        }
        for (int m = 0; m < triangle.length; m++) {
            max = Math.max(max, dp[n-1][m]);
        }
        System.out.println(max);
    }
}


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

        for (int j = 0; j < triangle.length; j++) {
            if(j==(n-1)) break;
            for (int k = 0; k < triangle[j].length; k++) {
                if(j==0) {
                    if(k==2)  break;
                    int start = dp[0][0] = triangle[0][0];
                    dp[j+1][k] = start + triangle[j+1][k];
                } else {
                    if(k==(n-1)) break;
                    int now = dp[j][k];
                    dp[j+1][k] = Math.max(now + triangle[j+1][k], now + triangle[j+1][k+1]);
                    //System.out.println(j+" "+k+" "+dp[j][k]);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n-1; i++) {
            max = Math.max(max, dp[n-1][i]);
        }
        System.out.println(max);
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.StringTokenizer;

public class Main_1932 {
    static int[][] array;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int[n][n];
        array = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int cnt = 0;
            while(st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                array[i][cnt] = num;
                dp[i][cnt] = num;
                cnt++;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp(i,j);
            }
        }

        Integer max = Arrays.stream(dp[n - 1]).max().getAsInt();
        System.out.println(max);
    }
    static void dp(int i, int j) {
        if(j==0) {
            dp[i][j] = dp[i-1][j] + dp[i][0];
        } else if(i==j) {
            dp[i][j] = dp[i-1][j-1] + dp[i][j];
        } else {
            dp[i][j] = Math.max(dp[i - 1][j - 1] + dp[i][j], dp[i - 1][j]+dp[i][j]);
        }
    }
}


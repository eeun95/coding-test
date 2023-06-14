package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        int[][] dp = new int[N+1][11];

        /*
        dp[0][0]=1;
        for (int i = 1; i < 10; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < N; i++) {
            dp[i][0] = i;
            for (int j = 1; j < 10; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
            }
        }

         */
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            dp[i][0] = dp[i - 1][1];
            for (int j = 1; j <= 9; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
            }
        }

        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += dp[N][i];
        }
        System.out.println(sum % 1000000000);
        //System.out.println(Arrays.toString(dp[N-1]));
        //System.out.println((Arrays.stream(dp[N-1]).sum()-dp[N-1][0])%1000000000);

    }
}

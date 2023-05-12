package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
                array[i][cnt] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                dp(i,j);
            }
        }
        Arrays.stream(dp).toList().forEach(
                ints -> Arrays.stream(ints).forEach(i-> System.out.print(i)));
    }
    static void dp(int i, int j) {
        if(j==0) {
            dp[i][j] = array[i-1][j] + array[i][j];
        } else if(i==j) {
            dp[i][j] = array[i-1][j-1] + array[i][j];
        } else {
            dp[i][j] = Math.max(array[i - 1][j - 1] + array[i][j], array[i - 1][j]);
        }
        System.out.println(i+" "+j+" "+dp[i][j]);
    }
}


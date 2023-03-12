package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1149 {
    static int[][] dp;
    static int[][] cost;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new int[N][3];
        cost = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }
        // 첫째줄 집 값으로 dp 값 초기세팅
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        System.out.println(Math.min(paint(N-1, 0), Math.min(paint(N-1, 1), paint(N-1, 2))));

    }
    static int paint(int N, int color) {
        if(dp[N][color] == 0) {
            if(color == 0) {
                // 빨
                dp[N][color] = Math.min(paint(N-1, 1), paint(N-1, 2))+cost[N][0];
            } else if(color == 1) {
                // 초
                dp[N][color] = Math.min(paint(N-1, 0), paint(N-1, 2))+cost[N][1];
            } else {
                // 파
                dp[N][color] = Math.min(paint(N-1, 0), paint(N-1, 1))+cost[N][2];
            }
        }
        return dp[N][color];
    }
}

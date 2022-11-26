package baekjoon;

import java.util.Scanner;

public class Main_15989 {
    public static void main(String[] args) {
        // 각 테스트 케이스마다 n을 1,2,3의 합으로 나타내는 방법의 수를 출력한다
        // 합을 이루고 있는 수의 순서만 다른 것은 같은 것으로 친다
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int T = sc.nextInt();
        int[] result = new int[T];
        int[][] dp = new int[10001][4];

        dp[1][1] = 1;
        dp[1][2] = 0;
        dp[1][3] = 0;

        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[2][3] = 0;

        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i = 4; i <= 10000; i++) {
            dp[i][1] = dp[i-1][1];
            dp[i][2] = dp[i-2][1] + dp[i-2][2];
            dp[i][3] = dp[i-3][1] +dp[i-3][2]+dp[i-3][3];
        }

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            sb.append(dp[n][1] + dp[n][2] + dp[n][3]+"\n");
        }
        System.out.println(sb);
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.print(usedMemory + " bytes");
    }
}
package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();       // 사자 우리의 크기
        int[][] dp = new int[N+1][3];

        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;

        for(int i=2;i<=N;i++){
            dp[i][0]=dp[i-1][0]+dp[i-1][1]+dp[i-1][2];
            dp[i][1]=dp[i-1][2]+dp[i-1][0];
            dp[i][2]=dp[i-1][1]+dp[i-1][0];

            dp[i][0] %= 9901;
            dp[i][1] %= 9901;
            dp[i][2] %= 9901;
        }
        System.out.println(Arrays.stream(dp[N]).sum()%9901);

    }
}

package baekjoon;

import java.util.Scanner;

import static java.lang.Math.min;

public class Main_1463 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N+1];

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i-1] + 1;
            if(i%2 == 0) dp[i] = min(dp[i], dp[i / 2] + 1);
            if(i%3 == 0) dp[i] = min(dp[i], dp[i / 3] + 1);
            System.out.println(i + ">" + dp[i]+" "+dp[1]);

        }
        System.out.println(dp[N]);
    }
}

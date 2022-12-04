package baekjoon;

import java.util.Scanner;

public class Main_11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 앞은 자릿수, 뒤는 끝나는 수
        int[][] dp = new int[N+1][10];

        // 초기값 세팅
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for(int i=2; i<=N; i++){
            for(int j=0; j<10; j++){
                for(int k=0; k<=j; k++){
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }
        int sum = 0;
        for(int i=0; i<10; i++){
            sum += dp[N][i];
        }
        System.out.println(sum%10007);
    }
}

package baekjoon;

import java.util.Scanner;

public class Main_2156 {
    public static void main(String[] args) {
        // 잔에 있는 건 다 마셔야하고 마신 후 제자리에 둬야함
        // 연속 3잔을 마실 수 없음
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                // 포도주 잔의 개수
        int[] amount = new int[n + 1];       // 포도주 양을 저장한 배열
        int[] dp = new int[n+1];

        // 잔이 3개 미만일 경우 모든 잔을 먹어야 최댓값
        for (int i = 1; i <= n; i++) {
            amount[i] = sc.nextInt();
            if(i<3) {
                dp[i] += amount[i] + dp[i-1];
            }
        }

        // O O X 전전과 직전 와인을 마시고 현재 와인을 마시지 않는다
        // O X O 직전 와인을 마시지 않고 전전 와인과 현재 와인을 마신다
        // X O O 전전 와인을 마시지 않고 직전과 현재 와인을 마신다
        // 세 개의 경우의 수가 있음 (3잔을 연달아 마시면 안되므로)
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2], dp[i-3] + amount[i-1]) + amount[i]);
        }

        System.out.println(dp[n]);

    }
}

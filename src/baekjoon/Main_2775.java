package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2775 {
    static int count=0;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        // a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야한다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.valueOf(br.readLine());     // 테스트 케이스 수
        for (int i = 0; i < T; i++) {
            count = 0;
            int k = Integer.valueOf(br.readLine());     // k층
            int n = Integer.valueOf(br.readLine());     // n호
            dp = new int[k+1][n+1];
            dp(k, n);
        }
    }
    public static void dp(int k, int n) {
    }
}

/*
*
* 0층 1:1 2:2 3:3 4:4..
* 1층 1:1 2:3 3:6 4:10..
* 2층 1:1 2:4 3:10 4:20..
* 3층 1:1 2:5 3:15 4:35..
*
* */

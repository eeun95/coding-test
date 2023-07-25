package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] P = new int[N + 1];
        int[] dp = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
            if(i==1) {
                dp[i] = N*P[i];
            } else if(i==N) {
                dp[i] = P[i];
            } else {
                dp[i] = (N / i * P[i]) + (N % i * P[N % i]);
            }
        }

        // 4
        // 1 5 6 7
        // 카드 네장을 살려면 2개 든 카드 두번 사면 됨 5*2 = 10
        // 한장짜리 네 개 사면 4밖에 안돼서 X
        System.out.println(Arrays.toString(dp));



    }
}

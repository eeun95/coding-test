package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        int[][] dp = new int[N+1][10];

        // 0으로 끝나는 수 뒤엔 1밖에 못붙는다
        // 9로 끝나는 수는 8밖에 못붙음
        // 나머지 수는 두개씩 더 붙을 수 있음
        // ex 10 12 21 23 32 34 ... 는
        // [101] [121 123] [210 212] [232 234] [323 324] [345 343] 이렇게 늘어날 수 있음

        // 초기값 세팅
        for (int i = 1; i < 10; i++) {
            if(i==9) {
                dp[1][i] = 1;
                dp[2][i] = 1;
            }
            else {
                dp[1][i] = 2;
                dp[2][i] = 2;
            }
        }

        for (int i = 3; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                if(j==0) dp[i][j] = dp[i-1][j]*1;
                else if(j==9) dp[i][j] = dp[i-1][j]*1;
                else dp[i][j] = dp[i-1][j]*2;
            }
        }

        //System.out.println(Arrays.toString(dp[N]));
        System.out.println(Arrays.stream(dp[N]).sum());

    }
}

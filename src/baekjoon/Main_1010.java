package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1010 {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            dp = new int[N+1][M+1];
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= M; k++) {
                    if(j<=k) {
                        dp(j, k);
                    }
                }
            }

            System.out.println(dp[N][M]);
        }
    }
    static void dp(int N, int M) {
        if(N==1 || M==1) {
            dp[N][M] = N==1 ? M : N;
        } else if(N==M) {
            dp[N][M] = 1;
        } else {
            int sum = 0;
            int n = N;
            int m = M;
            while(true) {
                sum += dp[n-1][m-1];
                //System.out.println("dp["+N+"]["+M+"] += dp["+(n-1)+"]["+(m-1)+"]"+dp[n-1][m-1]);
                if(n-1 == m-1) {
                    break;
                }
                m--;
            }
            dp[N][M] = sum;
        }
        //System.out.println(N+" "+M+" "+dp[N][M]);
    }
}

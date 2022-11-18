package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.max;

public class Main_11722 {
    static int N = 0;
    static int[] dp;
    static int[] array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.valueOf(br.readLine());     // 수열의 크기
        array = new int[N];
        dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int i = 0;
        while (st.hasMoreTokens()) {
            int a = Integer.valueOf(st.nextToken());
            array[i] = a;
            i++;
        }
        dp();
    }
    public static void dp() {
        int max = 1;
        for (int i = 0; i < N; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(array[j] > array[i] && dp[j]+1 > dp[i]) {
                    dp[i] = dp[j]+1;
                    max = max(max, dp[i]);
                }
            }
        }
        System.out.println(max);
    }
}

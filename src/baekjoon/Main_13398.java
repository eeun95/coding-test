package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_13398 {
    static int[] dp, dp2, array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        array = new int[N];
        dp = new int[N];
        dp2 = new int[N];

        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(s[i]);
        }

        // 연속된 수를 선택하여 가장 큰 합
        // 수열에서 수를 하나 제거할 수 있다
        // 첨부터 연속으로 더한 값에서 제일 작은 값 뺀것과 직전값+현재값 비교하기
        // 10 -4 3 1 5 6 -35 12 21 -1
        // 10+(-4) vs 10(-4 제외) = 6
        // 6+3 vs 10+(-4)+3(-4 제외) = 13
        // 13+1 vs 10+(-4)+3+1(-4 제외) = 14
        // 14+5 vs 10+(-4)+3+1+5(-4 제외) = 19

        // 6
        // 3 -5 5 -4 5 4 = 14

        // 8
        // 1 -3 4 8 -4 -3 9 2 = 20

        // 5
        // 1 -3 4 8 -4 = 13

        // 4
        // 2 -1 2 -1000

        dp[0] = array[0];
        dp2[0] = array[0];

        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(dp[i-1]+array[i], array[i-1]+array[i]);
        }

        for (int i = 1; i < N; i++) {
            dp(i);
        }
//        System.out.println(Arrays.toString(dp));
//        System.out.println(Arrays.toString(dp2));
        int max = Math.max(Arrays.stream(dp).max().getAsInt(), Arrays.stream(dp2).max().getAsInt());
        System.out.println(max);

    }

    static int dp(int N) {
        for (int i = 0; i < N; i++) {
            int[] tmp = Arrays.copyOfRange(array, i, N+1);
            int min = Arrays.stream(tmp).min().getAsInt();
            dp2[N] = Math.max(dp2[N], Arrays.stream(tmp).sum()-min);
        }
        return dp[N];
    }
}

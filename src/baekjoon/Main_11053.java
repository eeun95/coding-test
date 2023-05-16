package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main_11053 {
    static int[] dp, array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        array = new int[N];
        dp = new int[N];
        IntStream.range(0, N).forEach(i -> dp[i] = 1);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int i=0;
        while (st.hasMoreTokens()) {
            array[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        for (int j = 1; j < N; j++) {
            dp(j);
        }
        System.out.println(Arrays.toString(dp));
    }

    public static int dp(int n) {
        if(n==0) return 1;
        if(array[n-1] < array[n]) {
            return dp[n-1]+1;
        }
        return dp(n-1);
    }
}

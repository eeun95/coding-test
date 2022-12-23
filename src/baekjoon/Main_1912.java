package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] num = new int[n];
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int idx=0;
        while (st.hasMoreTokens()) {
            num[idx] = Integer.valueOf(st.nextToken());
            idx++;
        }

        dp[0] = num[0];
        for (int i = 1; i < n; i++) {
            //연속된 합과 현재값을 더한것보다 현재값이 크면 갱신
            dp[i] = Math.max(dp[i-1]+num[i], num[i]);
            //System.out.println(dp[i]);
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
        //Arrays.stream(num).forEach(System.out::println);
    }
}

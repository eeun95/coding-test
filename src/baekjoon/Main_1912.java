package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1912 {
    static int[] dp, array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        array = new int[n];
        dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        while(st.hasMoreTokens()) {
            array[cnt] = Integer.parseInt(st.nextToken());
            cnt++;
        }

        /*
            직전 수에 현재 수를 더한게 큰지, 직전까지의 합에 현재 수를 더한게 큰지 체크하여 각 인덱스에서 가질 수 있는 최대를 구한다
            ex. 10 -4 3 1 5 6 -35 12 21 -1
            인덱스 0에서 가질 수 있는 max 10
            인덱스 1에서 가질 수 있는 max (10+(-4) > -4) = 6
            인덱스 2에서 가질 수 있는 max (10+(-4)+3) > 3 = 9
            .
            .
            .
        */
        dp[0] = array[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + array[i], array[i]);
        }
        //System.out.println(Arrays.toString(dp));
        System.out.println(Arrays.stream(dp).max().getAsInt());

    }

}

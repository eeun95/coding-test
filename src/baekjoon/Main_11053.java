package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11053 {
    static int[] dp, array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        array = new int[N];
        dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int i=0;
        while (st.hasMoreTokens()) {
            array[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        // top-down 재귀방식
        for (int j = 0; j < N; j++) {
            dp(j);
        }
        System.out.println(Arrays.toString(dp));
    }

    static int dp(int n) {
        if(dp[n] == 0) {
            // 탐색하지 않았을 경우 1로 초기화
            dp[n] = 1;

            // 직전값에 +1 더한값이 더 큰지
            // 처음부터 다시 선택했을 때 값이 더 큰지
            // 반복문 돌리면서 현재 파라미터보다 수가 작은 애들만 체크
            for (int i = n - 1; i >= 0; i--) {
                if(array[i] < array[n])
                    dp[n] = Math.max(dp[n], dp(i)+1);
            }
        }
        return dp[n];
    }
}

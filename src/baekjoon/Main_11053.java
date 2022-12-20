package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 수열 A의 크기
        int[] A = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if(A[j] < A[i] && dp[i] < dp[j]+1) {
                    dp[i] = dp[j]+1;
                }
            }
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
        /*
        * OptionalInt[4] -> getAsInt로 값을 꺼내줌
        * intStream과 같은 기본 스트림은 Optional도 기본형을 값으로 하는 OptionalInt, OptionalLong, OptionalDouble을 반환한다
        * */
    }
}

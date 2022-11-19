package baekjoon;

import java.util.Scanner;

public class Main_9095 {
    static int[] dp = new int[500];
    static int start = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
            start = array[i];
            System.out.println("START"+start);
            dp(start);
        }
    }

    public static int dp(int num) {
        System.out.println("DP IN");
        if(num==1) return 1;
        dp[num] = dp[num-1]+(start-(num-1));
        System.out.println("dp["+num+"] = dp["+(num-1)+"] + "+(start-(num-1)));
        dp(num-1);

        return 0;
    }
}

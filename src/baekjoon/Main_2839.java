package baekjoon;

import java.util.Scanner;

public class Main_2839 {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        dp = new int[N+1];
        System.out.println(dp(N));
    }
    public static int dp(int n) {
        if (n == 4 || n == 7) {
            return -1;
        }
        else if (n % 5 == 0) {
            return (n / 5);
        }
        else if (n % 5 == 1 || n % 5 == 3) {
            return (n / 5) + 1;
        }
        else if (n % 5 == 2 || n % 5 == 4) {
            return (n / 5) + 2;
        } else {
            return -1;
        }
    }
}

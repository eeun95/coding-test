package baekjoon;

import java.util.Scanner;

public class Main_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(dp(N));
    }
    public static int dp(int n) {
        if ((n % 3 == 0 && n % 5 == 0) || n%5==0) {
            return n/5;
        } else if ((n - 3) % 5 == 0 || (n - 5) % 3 == 0) {
            if((n - 5) % 3 == 0) return 1+((n-5)/3);
            else return 1+((n-3)/5);
        } else if(n%3 == 0) {
            return n/3;
        } else {
            return -1;
        }
    }
}

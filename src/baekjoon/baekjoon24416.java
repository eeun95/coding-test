package baekjoon;

import java.util.Scanner;

public class baekjoon24416 {
    static int fib = 0;
    static int dm = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fib(n);
        dm(n);
        System.out.print(fib+" "+dm);

    }

    public static void fib(int n) {
        if(n == 1 || n==2) {
            fib++;
        } else {
            fib(n-1);
            fib(n-2);
        }
    }

    public static void dm(int n) {
        if(n>=3) {
            for (int i = 3; i <= n; i++) {
                dm++;
            }
        }
    }
}

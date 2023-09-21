package baekjoon;

import java.util.Scanner;

public class Main2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1 - 9
        // 2 - 25
        // 5 - 1089
        double v = (9 * Math.pow(4, N - 1)) - Math.pow(3, N);
        System.out.println("9 * "+Math.pow(4, N-1)+" - "+Math.pow(3, N));
        if(N == 1) {
            v = 9;
        }
        System.out.println(v);
    }
}

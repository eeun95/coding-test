package baekjoon;

import java.util.Scanner;

public class Main2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1 - 9
        // 2 - 25
        // 5 - 1089
        int base = (int) Math.pow(4, N-1);
        int num = (9*base) - (base*3-1);
        System.out.println("9 * "+Math.pow(4, N-1)+" - "+Math.pow(4, N-1)*3);
        if(N == 1) {
            num = 9;
        }
        System.out.println(num);

        int vertices = (int) Math.pow(2, N) * (int) Math.pow(2, N);
        System.out.println(vertices);
    }
}

package baekjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] chess = new int[] {1,1,2,2,2,8};

        for (int i = 0; i < chess.length; i++) {
            int a = sc.nextInt();
            if (a == chess[i]) {
                System.out.print("0 ");
            } else {
                System.out.print(chess[i] - a+" ");
            }
        }
    }
}

package baekjoon;

import java.util.Scanner;

public class Main1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //1 666 2 1666 3 2666 ...
        int n = 0;
        for (int i = 0; i < N; i++) {
            System.out.println(i+"666");
        }
    }
}

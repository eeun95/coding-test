package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();       // 플레이어의 수
            int[] pick = new int[T];
            for (int j = 1; j <= N; j++) {
                int you = sc.nextInt();
                if(you == N) {
                    pick[i] = j;
                }
            }

            Arrays.stream(pick).forEach(System.out::println);
        }
    }
}

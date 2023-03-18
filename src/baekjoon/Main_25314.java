package baekjoon;

import java.util.Scanner;

public class Main_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // long int = 4 long long int = 8
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N / 4; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}

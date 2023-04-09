package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int max = (2*N-1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            // 1 3 5 7 9 7 5 3 1
            if((i+1) < N) {
                // 증가
                sb.append(" ".repeat(N-(i+1)));
                sb.append("*".repeat(2*i+1)+"\n");
            } else if( (i+1)== N) {
                sb.append("*".repeat(max)+"\n");
            } else {
                // 감소
                sb.append(" ".repeat((i+1)-N));
                sb.append("*".repeat(max-(i+1-N)*2)+"\n");
            }
        }
        System.out.println(sb.toString());
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);   // 바구니
        int M = Integer.parseInt(input[1]);   // 공

        int[] basket = new int[N+1];
        for (int i = 0; i < M; i++) {
            String[] in = br.readLine().split(" ");
            int basketStart = Integer.parseInt(in[0]);
            int basketEnd = Integer.parseInt(in[1]);
            int ball = Integer.parseInt(in[2]);

            for (int j = basketStart; j <= basketEnd; j++) {
                basket[j] = ball;
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int i : basket) {
            if(first) {
                first = false;
                continue;
            }
            sb.append(i+" ");
        }
        System.out.println(sb);
    }
}

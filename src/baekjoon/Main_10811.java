package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 바구니
        int M = Integer.parseInt(input[1]); // 공

        int[] basket = new int[N+1];
        Arrays.setAll(basket, i -> i);

        for (int i = 0; i < M; i++) {
            String[] b = br.readLine().split(" ");
            int iBasket = Integer.parseInt(b[0]);
            int jBasket = Integer.parseInt(b[1]);

            for (int j = iBasket; j <= jBasket; j++, jBasket--) {
                int tmp = basket[j];
                basket[j] = basket[jBasket];
                basket[jBasket] = tmp;
            }
        }

        boolean b = true;
        StringBuilder sb = new StringBuilder();
        for(int i : basket) {
            if(b) {
                b = false;
                continue;
            }
            sb.append(i+" ");
        }
        System.out.println(sb);

        // 1 2 3 4 5
        // 2 1 3 4 5
        // 2 1 4 3 5
        // 3 4 1 2 5
    }
}

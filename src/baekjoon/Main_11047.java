package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        // N종류의 동전을 최소로 사용해서 K원 만들기

        Integer[] coin = new Integer[N];
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.valueOf(br.readLine());
        }
        Arrays.sort(coin, Comparator.reverseOrder());

        int cnt = 0;
        int index = 0;
        while(true) {
            int amount = coin[index];
            if(amount <= K) {
                K -= amount;
                cnt++;
            } else if(K <= 0) {
                break;
            } else {
                index++;
            }
        }
        System.out.println(cnt);
    }
}

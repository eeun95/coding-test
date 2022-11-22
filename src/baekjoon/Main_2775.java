package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2775 {
    public static void main(String[] args) throws IOException {
        // a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야한다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.valueOf(br.readLine());     // 테스트 케이스 수
        for (int i = 0; i < T; i++) {
            int k = Integer.valueOf(br.readLine());     // k층
            int n = Integer.valueOf(br.readLine());     // n호
            System.out.println(k+" "+n);
        }


    }
}

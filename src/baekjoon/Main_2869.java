package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());   // 낮에 오르는 미터
        int B = Integer.parseInt(st.nextToken());   // 밤에 떨어지는 미터
        int V = Integer.parseInt(st.nextToken());   // 정상

        int day = 1;
        if((V-A)%(A-B) == 0) {
            day += ((V-A)/(A-B));
        } else {
            day += (V-A)/(A-B)+1;
        }
        System.out.println(day);

    }
}

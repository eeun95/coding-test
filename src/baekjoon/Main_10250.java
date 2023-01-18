package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());       // 층수
            int W = Integer.parseInt(st.nextToken());       // 방수
            int N = Integer.parseInt(st.nextToken());       // 몇번째 손님

            //System.out.println(H+" "+W+" "+N);
            String blank = (W>9) ? "0" : "";
            System.out.println((N%H)+blank+(N/H+1));
        }
    }
}

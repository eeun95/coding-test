package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int[] array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        for (int j = 0; j < M; j++) {
            int sum =0 ;
            String[] ss = br.readLine().split(" ");
            for (int k = Integer.parseInt(ss[0]) - 1; k <= Integer.parseInt(ss[1]) - 1; k++) {
                sum += array[k];
            }
            System.out.println(sum);
        }
    }
}

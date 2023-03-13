package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_7576 {
    static int M,N;
    static int[][] tomato;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        M = Integer.parseInt(st.nextToken());       // 상자의 가로 칸
        N = Integer.parseInt(st.nextToken());       // 상자의 세로 칸

        tomato = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int j=0;
            while (st.hasMoreTokens()) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }
        System.out.println(Arrays.toString(tomato));
    }
}

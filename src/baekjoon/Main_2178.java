package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2178 {
    static int N;
    static int M;

    static boolean[][] dfs;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.valueOf(st.nextToken());    // 줄의 갯수
        M = Integer.valueOf(st.nextToken());    // 칸의 갯수

        dfs = new boolean[N + 1][M + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

            }
        }
    }
}

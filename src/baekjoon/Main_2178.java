package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2178 {
    static int N;
    static int M;

    static int[][] dfs;
    static int[][] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.valueOf(st.nextToken());    // 줄의 갯수
        M = Integer.valueOf(st.nextToken());    // 칸의 갯수

        dfs = new int[N + 1][M + 1];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                int ss = Integer.valueOf(s.substring(j, j + 1));
                dfs[i][j] = ss;
            }
        }
        dfs(0,0);
    }
    public static void dfs(int i, int j) {
        if(i<N && j<M) {
            if (dfs[i][j] == 1) {
                for (int k = j+1; k < M; k++) {
                    System.out.println(i+" "+k+" 지나가");
                    dfs(i, k);
                }
            } else {
                i++;
                System.out.println(i+" "+(j-1)+" 내려가");
                dfs(i, j-1);
            }
        }
    }
}
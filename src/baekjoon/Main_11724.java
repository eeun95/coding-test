package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11724 {
    static int N,M=0;
    static boolean[][] dfs;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.valueOf(st.nextToken()); // 정점의 개수
        M = Integer.valueOf(st.nextToken()); // 간선의 개수

        dfs = new boolean[N + 1][N + 1];
        visit = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int j = Integer.valueOf(st2.nextToken());
            int k = Integer.valueOf(st2.nextToken());

            dfs[j][k] = true;
            dfs[k][j] = true;
        }
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if(!visit[i]) {
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void dfs(int i) {
        visit[i] = true;

        for (int j = 1; j <= N; j++) {
            if(dfs[i][j] == true && !visit[j]) {
                dfs(j);
            }
        }
    }
}

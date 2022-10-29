package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon2606 {
    static boolean [][] dfs;
    static boolean [][] bfs;
    static boolean [] check;
    static int count=0;
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());        // 컴퓨터 대
        int M = Integer.parseInt(br.readLine());    // 연결 쌍

        dfs = new boolean[N+1][N+1];                // dfs로 풀기
        bfs = new boolean[N+1][N+1];                // bfs로 풀기

        check = new boolean[N + 1];

        int cnt = 0;
        while(cnt < M) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            bfs[n][m] = true;
            bfs[m][n] = true;

            dfs[n][m] = true;
            dfs[m][n] = true;
            cnt ++;
        }

        dfs(1);
        //bfs(1);
        System.out.println(count-1);
    }

    static int bfs(int i) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(i);
        check[i] = true;

        while(!q.isEmpty()) {
            int temp = q.poll();

            for(int k = 1; k<=N; k++) {
                if (bfs[temp][k] && !check[k]) {
                    q.offer(k);
                    check[k] = true;
                    count++;
                }
            }
        }

        return count;
    }

    static void dfs(int i) {
        check[i] = true;
        count++;

        for (int j = 0; j <= N; j++) {
            if(dfs[i][j] && !check[j]) {
                System.out.println(i+" "+j);
                dfs(j);
            }
        }
    }
}

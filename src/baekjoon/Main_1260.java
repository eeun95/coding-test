package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1260 {
    static boolean[][] dfs;
    static boolean[][] bfs;
    static boolean[] visit;

    static int N;
    static int M;
    static HashSet<Integer> hs = new LinkedHashSet<>();
    static HashSet<Integer> hs2 = new LinkedHashSet<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.valueOf(st.nextToken());       // 정점의 개수
        M = Integer.valueOf(st.nextToken());       // 간선의 개수
        int V = Integer.valueOf(st.nextToken());   // 탐색 시작 정점 번호

        dfs = new boolean[N+1][N+1];
        bfs = new boolean[N+1][N+1];
        visit = new boolean[N+1];

        // 간선이 연결하는 두 정점의 번호
        for(int i=0; i<M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.valueOf(st2.nextToken());
            int b = Integer.valueOf(st2.nextToken());
            dfs[a][b] = true;
            bfs[a][b] = true;
            dfs[b][a] = true;
            bfs[b][a] = true;
        }
        dfs(V);
        bfs(V);

        //System.out.println(hs);
        for (Integer a : hs.toArray(new Integer[hs.size()])) {
            System.out.print(a+" ");
        }
        System.out.println();

        //System.out.println(hs2);
        for (Integer a : hs2.toArray(new Integer[hs2.size()])) {
            System.out.print(a+" ");
        }
    }

    public static void dfs(int i) {
        if (!visit[i]) {
            hs.add(i);
            visit[i] = true;
            for (int j = 1; j <= N; j++) {
                if(dfs[i][j]) {
                    dfs(j);
                }
            }
        }
    }

    public static void bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        q.add(i);
        while (!q.isEmpty()) {
            int start = q.poll();
            q2.add(start);
            //System.out.println(start);
            hs2.add(start);
            for (int j = 1; j <= N; j++) {
                // 이미 다 돈 정점은 q2에 빼줘서 중복 체크
                if(bfs[start][j] && !q2.contains(j)) {
                    //System.out.println(start+ " "+ j);
                    q.add(j);
                }
            }
        }
    }
}

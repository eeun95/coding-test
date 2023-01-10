package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2444 {
    static int N, M;
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> bfs = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());       // 정점의 수
        M = Integer.parseInt(st.nextToken());       // 간선의 수
        int R = Integer.parseInt(st.nextToken());   // 시작정점

        for (int i = 0; i <= N; i++) {
            bfs.add(new ArrayList<>());
        }
        visit = new boolean[N+1];
        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st2.nextToken());
            int v = Integer.parseInt(st2.nextToken());

            bfs.get(u).add(v);
            bfs.get(v).add(u);
        }

        for (ArrayList<Integer> arrayList : bfs) {
            Collections.sort(arrayList);
        }

        bfs(R);
    }

    public static void bfs(int start) {
        if(!visit[start]) {
            System.out.println(start);
            visit[start] = true;
            Queue<Integer> q = new LinkedList<>();
            q.add(start);
            while(!q.isEmpty()) {
                int u = q.poll();
                for (Integer integer : bfs.get(u)) {
                    bfs(integer);
                }
            }
        }
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_24445 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visit;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        visit = new int[N + 1];
        for (int i = 0; i < N+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st2.nextToken());
            int v = Integer.parseInt(st2.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (ArrayList<Integer> arrayList : graph) {
            Collections.sort(arrayList, Collections.reverseOrder());
        }
        //System.out.println(graph);
        visit[R] = ++cnt;
        bfs(R);
        for (int i = 1; i < N + 1; i++) {
            System.out.println(visit[i]);
        }

    }
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int u = q.poll();
            //System.out.println(u);
            for (Integer integer : graph.get(u)) {
                if(visit[integer] != 0) continue;
                q.add(integer);
                visit[integer] = ++cnt;
            }
        }
    }
}

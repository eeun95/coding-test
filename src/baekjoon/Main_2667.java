package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2667 {
    static boolean[][] dfs;
    static boolean[][] bfs;
    static boolean[][] visit;
    static int[] dX = {0, 0, -1, 1};
    static int[] dY = {-1, 1, 0, 0};
    static int cnt,index=0;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.valueOf(br.readLine());
        dfs= new boolean[N+1][N+1];
        bfs = new boolean[N + 1][N + 1];
        visit = new boolean[N+1][N+1];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                boolean b = (s.substring(j, j+1).equals("0")) ? false : true;
                dfs[i][j] = b;
                bfs[i][j] = b;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //int c = dfs(i,j);

                int c = bfs(i, j);
                if(c>0) {
                    list.add(c);
                }
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for (int k : list) {
            System.out.println(k);
        }
    }
    public static int bfs(int x, int y) {
        int cnt = 0;
        Queue<int[]> q = new LinkedList<>();
        if(!visit[x][y] && bfs[x][y]) {
            cnt++;
            visit[x][y] = true;
            q.add(new int[]{x, y});
            while (!q.isEmpty()) {
                int[] xy = q.poll();
                for (int i = 0; i < 4; i++) {
                    int dx = xy[0] + dX[i];
                    int dy = xy[1] + dY[i];

                    if (dx >= 0 && dx < N && dy >= 0 && dy < N) {
                        if (bfs[dx][dy] && !visit[dx][dy]) {
                            //System.out.println(x+" "+y+" "+dx+" "+dy);
                            visit[dx][dy] = true;
                            q.add(new int[]{dx, dy});
                            cnt++;
                        }
                    }
                }
            }
        }
        return cnt;
    }
    public static int dfs(int dx, int dy) {
        if(!visit[dx][dy]) {
            //System.out.println(dx+" "+dy);
            if(dfs[dx][dy]) {
                //System.out.println(dx+" "+dy);
                cnt++;
                visit[dx][dy] = true;
                //상
                if (dy > 0 && dfs[dx][dy - 1] && !visit[dx][dy - 1]) {
                    //System.out.println("상");
                    dfs(dx, dy - 1);
                }
                //하
                if (dy < N - 1 && dfs[dx][dy + 1] && !visit[dx][dy + 1]) {
                    //System.out.println("하");
                    dfs(dx, dy + 1);
                }
                //좌
                if (dx > 0 && dfs[dx - 1][dy] && !visit[dx - 1][dy]) {
                    //System.out.println("좌");
                    dfs(dx - 1, dy);
                }
                //우
                if (dx < N - 1 && dfs[dx + 1][dy] && !visit[dx + 1][dy]) {
                    //System.out.println("우");
                    dfs(dx + 1, dy);
                }
            } else {
                cnt = 0;
            }
        } else {
            //System.out.println("++++");
            cnt = 0;
        }
        return cnt;
    }
}


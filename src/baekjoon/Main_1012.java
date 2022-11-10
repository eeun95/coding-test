package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1012 {
    static int M, N, K;
    static int count;

    static boolean[][] dfs;
    static boolean[][] bfs;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.valueOf(br.readLine());
        for (int i = 0; i < testCase; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.valueOf(st.nextToken());        // 배추밭 가로줄
            N = Integer.valueOf(st.nextToken());        // 배추밭 세로줄
            K = Integer.valueOf(st.nextToken());        // 배추가 심어진 갯수

            dfs = new boolean[M + 1][N + 1];            // 배추가 심어진 곳을 알기위한 배열
            bfs = new boolean[M + 1][N + 1];            // 배추가 심어진 곳을 알기위한 배열
            visit = new boolean[M + 1][N + 1];          // 카운트 체크를 위한 배열

            for (int j = 0; j < K; j++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
                int x = Integer.valueOf(st2.nextToken());
                int y = Integer.valueOf(st2.nextToken());
                dfs[x][y] = true;
                bfs[x][y] = true;
            }
            count = 0;
            for (int a = 0; a < M; a++) {
                for (int b = 0; b < N; b++) {
                    /*
                    if(dfs[a][b]) {
                        dfs(a, b, true);
                    }

                     */
                    if(bfs[a][b]) {
                        bfs(a, b);
                    }
                }
            }
            q.offer(count);
        }
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();

        if(visit[x][y]) {
            return;
        } else {
            count++;
            System.out.println("COME!!!"+x+" "+y);
            q.offer(new int[]{x, y});
            visit[x][y] = true;
        }

        while (!q.isEmpty()) {

            int[] position = q.poll();
            int dx = position[0];
            int dy = position[1];

            if((dx+1) > M || (dy+1) >N) {
                System.out.println(dx+" .. "+dy);
                break;
            }
            // 호출 된 위치와 인접한 위치 찾기
            if (dx - 1 > -1 && bfs[dx - 1][dy] && !visit[dx-1][dy]) {
                // 상
                System.out.println("상 "+(dx-1) + " " + dy);
                q.offer(new int[]{dx - 1, dy});
                visit[dx-1][dy] = true;
            }
            if (dx + 1 < M && bfs[dx + 1][dy] && !visit[dx+1][dy]) {
                // 하
                System.out.println("하 "+(dx+1) + " " + dy);
                q.offer(new int[]{dx + 1, dy});
                visit[dx+1][dy] = true;
            }
            if (dy - 1 > -1 && bfs[dx][dy - 1] && !visit[dx][dy-1]) {
                // 좌
                System.out.println("좌 "+dx + " " + (dy - 1));
                q.offer(new int[]{dx, dy - 1});
                visit[dx][dy-1] = true;
            }
            if (dy + 1 < N && bfs[dx][dy + 1] && !visit[dx][dy+1]) {
                // 우
                System.out.println("우 "+dx + " " + (dy + 1));
                q.offer(new int[]{dx, dy + 1});
                visit[dx][dy+1] = true;
            }
        }
    }
    public static void dfs(int x, int y, boolean start) {
        if(!visit[x][y]) {
            visit[x][y] = true;
            if(start) {
                count++;
            }

            // 호출 된 위치와 인접한 위치 찾기
            if(x-1 > -1 && dfs[x-1][y]) {
                // 상
                dfs(x - 1, y, false);
            }
            if(x+1 < M && dfs[x+1][y]) {
                // 하
                dfs(x + 1, y, false);
            }
            if(y-1 > -1 && dfs[x][y-1]) {
                // 좌
                dfs(x, y - 1, false);
            }
            if(y+1 < N && dfs[x][y+1]) {
                // 우
                dfs(x, y + 1, false);
            }
        }
    }
}

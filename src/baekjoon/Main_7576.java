package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_7576 {
    static int M,N;
    static int[][] tomato;
    static boolean[][] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        M = Integer.parseInt(st.nextToken());       // 상자의 가로 칸
        N = Integer.parseInt(st.nextToken());       // 상자의 세로 칸

        tomato = new int[N][M];
        visit = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int j=0;
            while (st.hasMoreTokens()) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }
        for (int i = 0; i<tomato.length; i++) {
            for (int j = 0; j < tomato[i].length; j++) {
                if(tomato[i][j] == 1) tomatoDelicious(i,j);
            }
        }
    }

    static void tomatoDelicious(int i, int j) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        if(!visit[i][j]) {
            System.out.println("HI?");
            visit[i][j] = true;
            for (int k = 0; k < 4; k++) {
                int nx = i+dx[k];
                int ny = j+dy[k];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if(!visit[nx][ny] && tomato[nx][ny] != -1) {
                        tomatoDelicious(nx, ny);
                    }
                }
            }
        }
    }
}

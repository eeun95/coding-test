package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2178 {
    static int N;
    static int M;
    static int count=1;

    static int[][] find;
    static boolean[][] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.valueOf(st.nextToken());    // 줄의 갯수
        M = Integer.valueOf(st.nextToken());    // 칸의 갯수

        find = new int[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                int ss = Integer.valueOf(s.substring(j, j + 1));
                find[i][j] = ss;
            }
        }
        move(0,0);
    }
    public static void move(int i, int j) {
        // 위로 이동 i-1, j
        // 아래로 이동 i+1, j
        // 우로 이동 i, j+1
        // 좌로 이동 i, j-1
        if(i==N-1 && j==M-1) {
            System.out.println("끝"+count);
            return;
        }
        if(!visit[i][j]) {
            count++;
            System.out.println(i+" "+j+" 무브");
            visit[i][j] = true;
            // 우로 이동 가능
            if(j+1<M && find[i][j+1]==1) {
                move(i, j+1);
            }
            // 아래로 이동 가능
            if(i+1<N && find[i+1][j]==1) {
                move(i+1, j);
            }
            // 위로 이동 가능
            if(i-1>-1 && find[i-1][j]==1) {
                move(i-1, j);
            }
            // 좌로 이동 가능
            if(j-1>-1 && find[i][j-1]==1) {
                move(i, j-1);
            }
        } else {
            System.out.println("왔었어 "+i+" "+j);
            count--;
        }
        System.out.println(count);
    }
}
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10026 {
    static String[][] rgb, nrgb;
    static boolean[][] visit, nvisit;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        // 적록색약 X
        rgb = new String[N][N];
        visit = new boolean[N][N];
        // 적록색약 O
        nrgb = new String[N][N];
        nvisit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String ss = br.readLine();
            int cnt = 0;
            while(cnt < N) {
                rgb[i][cnt] = ss.substring(cnt, cnt+1);
                System.out.println(rgb[i][cnt]);
                String ns = ss.replace("G", "R");
                nrgb[i][cnt] = ns.substring(cnt, cnt+1);
                cnt++;
            }
        }
        System.out.println(rgb[0][1]);
        int rgbCnt = 0;
        int nrbgCnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visit[i][j]) {
                    dfs(i, j, rgb, visit);
                    rgbCnt++;
                }
                if (!nvisit[i][j]) {
                    dfs(i, j, nrgb, nvisit);
                    nrbgCnt++;
                }
            }
        }
        System.out.println(rgbCnt+" "+nrbgCnt);
    }
    static void dfs(int i, int j, String[][] rgb, boolean[][] visit) {
        if(!visit[i][j]) {
            visit[i][j] = true;
            String color = rgb[i][j];

            // 상
            if(i>0 && !visit[i-1][j] && rgb[i-1][j].equals(color)) {
                dfs(i-1, j, rgb, visit);
            }
            // 하
            if(i<(N-1) && !visit[i+1][j] && rgb[i+1][j].equals(color)) {
                dfs(i+1, j, rgb, visit);
            }
            // 좌
            if(j>0 && !visit[i][j-1] && rgb[i][j-1].equals(color)) {
                dfs(i, j-1, rgb, visit);
            }
            // 우
            if(j<(N-1) && !visit[i][j+1] && rgb[i][j+1].equals(color)) {
                dfs(i, j+1, rgb, visit);
            }
        }
    }
}

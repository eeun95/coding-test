package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_15649 {

    static int[] dfs;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        // 1부터 N까지 길이가 M인 수열

        dfs = new int[M];
        visit = new boolean[N];
    }

    public static void dfs(int N, int M, int depth) {
        if(depth == M) {
            for(int val : dfs) {
                System.out.println(val + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs[depth] = i+1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }

}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        int [][] a = new int[N][M];
        int [][] b = new int[N][M];
        for (int i = 0; i < N *2 ; i++) {
            int idx = i;
            String [] s = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                if(i>=N) {
                    idx = i-3;
                    b[idx][j] = Integer.parseInt(s[j]);
                } else {
                    a[idx][j] = Integer.parseInt(s[j]);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
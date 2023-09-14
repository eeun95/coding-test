package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1707 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            String s = br.readLine();
            int V = Integer.parseInt(s.split(" ")[0]);
            int E = Integer.parseInt(s.split(" ")[1]);

            for(int j=0; j<E; j++) {
                String ss = br.readLine();
                int u = Integer.parseInt(ss.split(" ")[0]);
                int v = Integer.parseInt(ss.split(" ")[1]);
            }
        }
    }
}

package baekjoon;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.valueOf(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a= Integer.valueOf(st.nextToken());
            int b= Integer.valueOf(st.nextToken());

            bw.write((a + b) + "\n");
        }
        bw.flush();
        bw.close();
    }
}

package baekjoon;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());

            double[] score = new double[N];
            for (int j = 0; j < N; j++) {
                score[j] = Double.parseDouble(st.nextToken());
            }
            double avg = Arrays.stream(score).sum()/N;
            double high=0;
            for (int k = 0; k < N; k++) {
                if (score[k] > avg) {
                    high++;
                }
            }
            System.out.println(String.format("%.3f",high/N*100)+"%");

        }
    }
}

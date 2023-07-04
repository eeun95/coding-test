package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            Queue<Double> q = new LinkedList<>() {{
                add(0.25);
                add(0.10);
                add(0.05);
                add(0.01);
            }};

            int C = Integer.parseInt(br.readLine());
            double c = (double) C /100;

            Double coin = q.poll();
            int cnt = 0;
            while(true) {
                if(c >= coin) {
                    c -= coin;
                    c = Math.round(c*100)/100.0;
                    cnt++;
                } else {
                    sb.append(cnt).append(" ");
                    if(!q.isEmpty()) {
                        coin = q.poll();
                    } else {
                        break;
                    }
                    cnt=0;
                }
            }
            System.out.println(sb);
        }
    }
}

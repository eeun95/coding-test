package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            Queue<String> q1 = new LinkedList<>();
            Queue<String> q2 = new LinkedList<>();
            for (int j = 0; j < s.length(); j++) {
                q1.add(s.substring(j, j + 1));
            }
            boolean flag = true;
            String before = "";
            while (!q1.isEmpty()) {
                String word = q1.poll();
                if (!before.equals(word) && q2.contains(word)) {
                    flag = false;
                    break;
                }
                q2.add(word);
                before = word;
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }
}

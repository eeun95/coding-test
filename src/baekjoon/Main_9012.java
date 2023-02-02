package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Stack<String> stack = new Stack<>();
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                String ss = s.substring(j, j + 1);
                stack.push(ss);
            }

        }
    }
}

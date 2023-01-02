package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();
            if (cmd.startsWith("push")) {
                String[] ss = cmd.split(" ");
                s.push(Integer.parseInt(ss[1]));
            } else if (cmd.startsWith("pop")) {
                if (s.size() < 1) {
                    System.out.println("-1");
                } else {
                    System.out.println(s.pop());
                }
            } else if (cmd.startsWith("size")) {
                System.out.println(s.size());
            } else if (cmd.startsWith("empty")) {
                if (s.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else {
                if (s.size() < 1) {
                    System.out.println("-1");
                } else {
                    System.out.println(s.peek());
                }
            }
        }
    }
}
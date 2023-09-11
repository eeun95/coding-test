package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            if(command.startsWith("1")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                stack.push(x);
            } else if(command.equals("2")) {
                if(stack.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack.pop()+"\n");
                    //stack.stream().map(num -> sb.append(num+"\n"));
                }
            } else if(command.equals("3")) {
                sb.append(stack.size()+"\n");
            } else if(command.equals("4")) {
                sb.append(stack.isEmpty() ? "1\n" : "0\n");
            } else if(command.equals("5")) {
                sb.append(stack.isEmpty() ? "-1\n" : stack.peek()+"\n");
            }
        }
        System.out.println(sb.toString());
    }
}

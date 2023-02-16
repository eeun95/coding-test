package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();
            if(cmd.equals("front")) {
                if(!dq.isEmpty()) sb.append(dq.peekFirst()+"\n");
                else sb.append("-1"+"\n");
            } else if(cmd.equals("back")) {
                if(!dq.isEmpty()) sb.append(dq.peekLast()+"\n");
                else sb.append("-1"+"\n");
            } else if(cmd.equals("empty")) {
                if(!dq.isEmpty()) sb.append("0"+"\n");
                else sb.append("1"+"\n");
            } else if (cmd.equals("size")) {
                sb.append(dq.size()+"\n");
            } else if (cmd.equals("pop")) {
                if(!dq.isEmpty()) sb.append(dq.pop()+"\n");
                else sb.append("-1"+"\n");
            } else {
                dq.add(Integer.valueOf(cmd.split(" ")[1]));
            }
        }
        System.out.println(sb);
    }
}

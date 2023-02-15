package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String cmd = st.nextToken();
            if(st.hasMoreTokens()) {
                dq.push(Integer.valueOf(st.nextToken()));
            } else {
                if(cmd.equals("front")) {
                    if(!dq.isEmpty()) System.out.println(dq.peekFirst());
                    else System.out.println("-1");
                } else if(cmd.equals("back")) {
                    if(!dq.isEmpty()) System.out.println(dq.peekLast());
                    else System.out.println("-1");
                } else if(cmd.equals("empty")) {
                    if(!dq.isEmpty()) System.out.println("0");
                    else System.out.println("1");
                } else if (cmd.equals("size")) {
                    System.out.println(dq.size());
                } else if (cmd.equals("pop")) {
                    if(!dq.isEmpty()) System.out.println(dq.pop());
                    else System.out.println("-1");
                }
            }
        }
    }
}

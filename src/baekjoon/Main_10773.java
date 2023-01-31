package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n!=0) {
                s.push(n);
            } else {
                s.pop();
            }
        }
        if (s.isEmpty()) {
            System.out.println("0");
        } else {
            int sum = 0;
            for (Integer integer : s) {
                sum += integer;
            }
            System.out.println(sum);
        }
    }
}

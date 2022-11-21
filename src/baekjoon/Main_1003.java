package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_1003 {
    static int cnt0, cnt1=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int T = Integer.valueOf(br.readLine());
        for (int i = 0; i < T; i++) {
            q.add( Integer.valueOf(br.readLine()));
        }

        while (!q.isEmpty()) {
            cnt0 = cnt1 = 0;
            int N = q.poll();
            fibonacci(N);
            System.out.println(cnt0+" "+cnt1);
        }
    }
    public static void fibonacci(int n) {
        if (n == 0) {
            cnt0++;
        } else if (n == 1) {
            cnt1++;
        } else {
            fibonacci(n-1);
            fibonacci(n-2);
        }
    }
}

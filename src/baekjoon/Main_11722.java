package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_11722 {
    static int max = 0;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int N = Integer.valueOf(br.readLine());     // 수열의 크기
        int[] array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int i = 0;
        while(st.hasMoreTokens()) {
            int a = Integer.valueOf(st.nextToken());
            array[i] = a;
            q.offer(a);
            i++;
        }
        System.out.println(q);
        System.out.println(cnt);
    }
    public static void dp(Queue<Integer> q) {
        System.out.println(q);
        Queue<Integer> tmpQ = new LinkedList<>();
        int start = q.poll();
        while (!q.isEmpty()) {
            int A = q.poll();
            tmpQ.add(A);
            if (q.isEmpty()) break;
            if (max > A && A > q.peek()) {
                System.out.println("+" + A);
            }
        }
        if (!tmpQ.isEmpty()) {
            dp(tmpQ);
        }
    }
}

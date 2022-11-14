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
        Deque<Integer> q = new LinkedList<>();
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
        dp(q);
        System.out.println(cnt);
    }
    public static void dp(Deque<Integer> q) {
        System.out.println(q);
        int last = 0;
        while (!q.isEmpty()) {
            int A = q.poll();
            if (q.isEmpty()) {
                if (last > A) {
                    System.out.println("+" + A);
                    cnt++;
                } else {
                    System.out.println("-" + A);
                }
                break;
            }
            if(A <= q.peek()) {
                // 다음 원소와 비교했을 때 작으면 감소수열이 깨지므로 빼주고 다음으로 넘어감
                System.out.println("-" + A);
            } else {
                // 다음 원소보다 현재 원소가 크면 해당 큐를 다시 보내서 비교
                System.out.println("+" + A);
                cnt++;
            }
            last = A;
        }
    }
}

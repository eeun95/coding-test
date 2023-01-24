package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1697 {
    static int N, K;
    static int[] visit = new int[100001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        if(N==K) {
            System.out.println(0);
        }
        else {
            bfs(N);
            System.out.println(visit[K]-1);
        }
    }

    public static void bfs(int X) {
        Queue<Integer> q = new LinkedList<>();
        q.add(X);
        visit[X] = 1;
        while (!q.isEmpty()) {
            int x = q.poll();

            // 수빈이가 움직일 수 있는 거리
            if (x-1 >= 0 && visit[x - 1] == 0) {
                visit[x-1] = visit[x]+1;
                q.add(x-1);
            }
            if (x+1 <= 100000 && visit[x + 1] == 0) {
                visit[x+1] = visit[x]+1;
                q.add(x+1);
            }
            if (2*x <= 100000 && visit[2 * x] == 0) {
                visit[2*x] = visit[x]+1;
                q.add(2*x);
            }
        }
    }
}

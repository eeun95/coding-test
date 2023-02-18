package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        boolean flag = true;
        while (q.size() > 1) {
            int poll = q.poll();
            //System.out.println(poll);
            if(flag) flag = false;
            else {
                q.add(poll);
                flag = true;
            }
        }
        System.out.println(q.poll());
    }
}

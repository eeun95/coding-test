package stack_queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class sq2_printer {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int[] priorities2 = {2, 3, 3, 2, 9, 3, 3};
        int location2 = 3;
        System.out.println(solution(priorities2, location2));
    }
    public static int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3 = new LinkedList<>();

        int max = 0;
        for (int i = 0; i < priorities.length; i++) {
            if (max <= priorities[i]) {
                max = priorities[i];
            }
            q.add(priorities[i]);
            q2.add(i);
        }

        while (!q.isEmpty()) {
            if( max > q.peek() ) {
                int tmp = q.poll();
                int tmp2 = q2.poll();
                q.add(tmp);
                q2.add(tmp2);
            } else {
                System.out.println(max+" "+q2.peek()+" "+q.peek());
                q3.add(q2.poll());
                q.poll();
                if(q.peek()!=null) {
                    max = q.peek();
                }
            }
        }

        int cnt = 0;
        while (!q3.isEmpty()) {
            int p = q3.poll();
            cnt++;
            System.out.println(">>>"+p+" "+cnt);
            if (p == location) {
                answer = cnt;
                break;
            }
        }

        return answer;
    }
}

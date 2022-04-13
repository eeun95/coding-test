package stack_queue;

import java.util.*;

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

        Queue<Integer> q = new LinkedList<>();          // 중요도
        Queue<Integer> q2 = new LinkedList<>();         // 순서
        Queue<Integer> q3 = new LinkedList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


        int max = 0;
        for (int i = 0; i < priorities.length; i++) {
            if (!pq.contains(priorities[i])) {
                pq.add(priorities[i]);
            }
            q.add(priorities[i]);
            q2.add(i);
        }

        max = pq.poll();

        while (!q.isEmpty()) {

            if (max == q.peek()) {
                System.out.println(q2.peek() + " " + q.peek());
                q3.add(q2.poll());
                q.poll();
            } else if (max > q.peek()) {
                int tmp = q.poll();
                int tmp2 = q2.poll();
                q.add(tmp);
                q2.add(tmp2);
            }

            if(!q.contains(max) && !pq.isEmpty()) {
                max = pq.poll();
            }
        }

        int cnt = 1;
        while (!q3.isEmpty()) {
            //System.out.println(q3.poll());
            if(q3.poll() == location) {
                break;
            }
            cnt ++;
        }

        answer = cnt;

        return answer;
    }
}

package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class heap1_soHot {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int[] scoville2 = {1, 1, 2};
        int k2 = 20;
        System.out.println(solution(scoville, k));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //요건 내림차순
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int s : scoville) {
            pq.add(s);
        }

        int cnt = 1;

        while (!pq.isEmpty()) {
            int first_val = pq.poll();
            if(pq.isEmpty()) {
                cnt = -1;
                break;
            }
            int second_val = pq.poll();
            int sum = first_val + (second_val * 2);
            pq.add(sum);
            System.out.println(pq);
            if (pq.peek() >= K) {
                break;
            }
            cnt++;
        }

        answer = cnt;

        return answer;
    }
}
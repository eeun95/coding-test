package stack_queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class sq1_funcDevelop {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(solution(progresses, speeds));
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int max_progress = 100;

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i< progresses.length; i++) {
            int open_days = (max_progress-progresses[i])/speeds[i];
            if((max_progress-progresses[i])%speeds[i]>0) open_days++;

            q.offer(open_days);
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        // 처음 오픈해야 하는 날짜 (poll로 빼줌)
        int days = q.poll();
        int d = 1;

        // 첫번째 기능 오픈
        hm.put(d, 1);

        while (!q.isEmpty()) {
            //System.out.println(days+" "+q.peek());

            if(days >= q.peek()) {
                hm.put(d, hm.getOrDefault(d, 0)+1);
                //System.out.println(">> "+d+" "+hm.get(d));
                q.poll();
            } else {
                d++;
                days = q.poll();
                hm.put(d, 1);
            }
        }

        System.out.println("====");
        answer = new int[hm.size()];
        for (Integer dd : hm.keySet()) {
            System.out.println(dd + " " + hm.get(dd));
            answer[dd-1] = hm.get(dd);
        }

        return answer;
    }
}

package heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class heap2_diskController {
    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        int[][] jobs2 = {{0, 3}, {5, 9}, {3, 12}};

        System.out.println(solution(jobs2));
    }
    public static int solution(int[][] jobs) {
        int answer = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Integer> time = new PriorityQueue<>();

        for (int i = 0; i < jobs.length; i++) {
            hm.put(jobs[i][0], i);
            time.add(jobs[i][1]);
        }

        int avg = jobs.length;
        int sum = 0;
        int end_time = 0;
        int wait_time = 0;


        answer = sum/avg;
        return answer;
    }
}

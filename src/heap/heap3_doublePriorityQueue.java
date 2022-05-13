package heap;

import java.util.*;

public class heap3_doublePriorityQueue {
    public static void main(String[] args) {
        String[] operations = {"I 16", "D 1"};
        String[] operations2 = {"I 7", "I 5", "I -5", "D -1"};
        String[] oper = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        String[] oper2 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};

        System.out.println(solution(oper2));
    }

    public static int[] solution(String[] operations) {
        int[] answer = {};

        int max = 0;
        int min = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        for (int i = 0; i < operations.length; i++) {
            List<String> list = Arrays.asList(operations[i].split(" "));
            //System.out.println(list.get(0)+" "+list.get(1));

            if (list.get(0).equals("I")) {
                pq.add(Integer.valueOf(list.get(1)));
            } else {

                int cnt = 0;
                if(pq.isEmpty()) continue;
                Iterator<Integer> it = pq.iterator();

                if (Integer.valueOf(list.get(1)) < 0) {
                    // 최소값 제거
                    while (!pq.isEmpty()) {
                        pq2.add(pq.poll());
                    }
                    pq2.poll();
                    while (!pq2.isEmpty()) {
                        pq.add(pq2.poll());
                    }

                } else {
                    // 최대값 제거
                    pq.poll();
                }
            }
        }

        int cnt = 0;
        while (!pq.isEmpty()) {
            if(cnt == 0 ) {
                max = pq.poll();
            } else {
                min = pq.poll();
            }
            cnt++;
        }

        answer = new int[]{max, min};
        System.out.println(max+" "+min);
        return answer;
    }
}

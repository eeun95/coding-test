package bruteForce;

import java.util.*;

public class bruteForce1_test {
    public static void main(String[] args) {
        int answers[] = {1, 2, 3, 4, 5};
        int answers2[] = {1, 3, 2, 4, 2};
        int answers3[] = {3, 3, 2, 1, 5};
        int answers4[] = {5, 5, 4, 3, 3,6,6,6,6,6,6};
        System.out.println(solution(answers4));
    }

    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[][] students = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (students[i][j%(students[i].length)] == answers[j]) {
                    hm.put((i+1), hm.getOrDefault((i+1), 0)+1);
                } else {
                    hm.put((i + 1), hm.getOrDefault((i+1), 0));
                }
            }
        }

        List<Integer> keySet = new ArrayList<>(hm.keySet());
        Collections.sort(keySet, (value1, value2) -> (hm.get(value2).compareTo(hm.get(value1))));

        System.out.println(keySet);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

            int max = hm.get(keySet.get(0));            // 젤 많이 맞춘 애가 맞춘 갯수
            for (int n : hm.keySet()) {
                if (max == hm.get(n)) {
                    System.out.println(max + " student" + n + " 바로 최대값");
                    pq.add(n);
                } else {
                    System.out.println(hm.get(n) + " student" + n + " 안최대값");
                }
            }

            answer = new int[pq.size()];
            int idx = 0;
            while (!pq.isEmpty()) {
                answer[idx] = pq.poll();
                idx++;
            }

        return answer;
    }
}

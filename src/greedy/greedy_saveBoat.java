package greedy;

import java.lang.reflect.Array;
import java.util.*;

public class greedy_saveBoat {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        solution(people, limit);
        people = new int[]{40, 50, 150, 160};
        limit = 200;

        people = new int[]{100, 500, 500, 900, 950};
        limit = 1000;

    }
    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int person : people) {
            dq.add(person);
        }

        while (!dq.isEmpty()) {
            if(dq.peekFirst() >= limit) {
                answer = dq.size();
                break;
            } else {
                int able = limit - dq.peekLast();
                if (dq.peekFirst() <= able) {
                    dq.pollFirst();
                    dq.pollLast();
                    answer++;
                } else {
                    dq.pollLast();
                    answer++;
                }
            }
        }

        return answer;
    }
}

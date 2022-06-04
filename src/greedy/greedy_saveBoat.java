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

        Integer[] p = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(p, Collections.reverseOrder());

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int person : p) {
            dq.add(person);
        }

        while (!dq.isEmpty()) {
            int able = limit - dq.peekFirst();
            System.out.println(dq.peekFirst()+" 시작 !!!!");
            if (dq.peekLast() <= able) {
                System.out.println(dq.peekFirst()+" "+dq.peekLast()+" 한 보트로 나감");
                dq.pollFirst();
                dq.pollLast();
                answer++;
            } else {
                System.out.println(dq.pollFirst()+" 혼자 타고 나감");
                answer++;
            }

        }

        return answer;
    }
}

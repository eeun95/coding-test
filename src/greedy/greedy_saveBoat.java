package greedy;

import java.util.Arrays;

public class greedy_saveBoat {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        solution(people, limit);
    }
    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int save = 0;
        int one_boat = 0;
        boolean boat_flag = true;

        for (int i = 0; i < people.length; i++) {
            save += people[i];
            System.out.println(save);
            if(limit >= save) {
                System.out.println("한 보트에 타");

                if(boat_flag) {
                    // 첫번째로 꺼낸 보트
                    answer++;
                    boat_flag = false;
                }
                if(one_boat > 2) {
                    System.out.println("한 보트에 두명 다 탐 새보트 꺼낼차례");
                    one_boat = 0;
                    save = people[i];
                    answer++;
                }
                one_boat++;
            } else {
                save = people[i];
                System.out.println("새 보트 꺼내");
                answer++;
                boat_flag = true;
            }
        }
        System.out.println(answer);
        return answer;
    }
}

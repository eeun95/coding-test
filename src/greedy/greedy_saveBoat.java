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

        for (int i = 0; i < people.length; i++) {
            save += people[i];
            System.out.println(save);
            if(limit >= save) {
                System.out.println("한 보트에 타");
                if(one_boat > 2) {
                    answer++;
                    one_boat = 0;
                }
                one_boat++;
            } else {
                save = people[i];
                System.out.println("새 보트 꺼내");
                answer++;
            }
        }
        System.out.println(answer+one_boat);
        return answer;
    }
}

package greedy;

import java.lang.reflect.Array;
import java.util.Arrays;

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

        int new_boat = 0;
        for (int i = 0; i < people.length; i++) {

            for (int j = people.length - 1; j > i; j--) {

                int save = people[i] + people[j];
                if(save <= limit ) {
                    System.out.println(people[i] + " " + people[j]+" 보트 하나 탑승");
                    new_boat++;
                    break;
                } else {
                    System.out.println(people[i] + " " + people[j]+" 새보트");
                    new_boat++;
                }
            }
        }
        return answer;
    }
}

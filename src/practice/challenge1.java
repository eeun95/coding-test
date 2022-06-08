package practice;

import java.util.Arrays;
import java.util.HashMap;

public class challenge1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        solution(numbers);
    }
    public static int solution(int[] numbers) {
        int answer = -1;

        Arrays.sort(numbers);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    map.put(i, i);
                    break;
                } else {
                    map.put(i, 0);
                }
            }
        }

        int sum = 0;
        for (int k : map.keySet()) {
            System.out.println(k+" "+map.get(k));
            if (map.get(k) == 0) {
                sum += k;
            }
        }
        answer = sum;

        return answer;
    }

    public int solution2(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}

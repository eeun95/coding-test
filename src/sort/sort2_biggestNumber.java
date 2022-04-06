package sort;

import java.util.Arrays;
import java.util.HashMap;

public class sort2_biggestNumber {
    public static void main(String[] args) {
        int [] numbers1 = {6, 10, 2};
        int [] numbers2 = {3, 30, 34, 5, 9};

        System.out.println(solution(numbers2));
    }
    public static String solution(int[] numbers) {
        String answer = "";

        String [] temp = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(temp);
        String s = "";
        for (int j = temp.length; j > 0; j--) {
            s += temp[j-1];
        }
        //System.out.println(s);
        answer = s;
        return answer;
    }
}

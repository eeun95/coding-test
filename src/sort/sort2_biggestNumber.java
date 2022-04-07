package sort;

import java.util.Arrays;
import java.util.Comparator;
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
        // 정렬
        Arrays.sort(temp, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                System.out.println((o2 + o1) + " " + (o1 + o2));
                return ((o2 + o1).compareTo(o1 + o2));
            }
        });

        // 0만 여러개 있는 배열의 경우 하나의 0만 리턴
        if(temp[0].equals("0")) {
            return "0";
        }

        // 정렬된 문자 하나로 합치기
        for (String a : temp) {
            answer += a;
        }

        return answer;

        /*
        Arrays.sort(temp);
        String s = "";
        for (int j = temp.length; j > 0; j--) {
            s += temp[j-1];
        }
        //System.out.println(s);
        answer = s;

         */
    }
}

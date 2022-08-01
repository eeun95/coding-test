package practice;

import java.util.HashSet;

public class poketmon {

    public static void main(String[] args) {
        solution(new int[]{3, 1, 2, 3});
        solution(new int[]{3, 3, 3, 2, 2, 4});
        solution(new int[]{3, 3, 3, 2, 2, 2});
    }

   public static int solution(int[] nums) {
        int answer = 0;
        int p = nums.length/2;

       HashSet<Integer> set = new HashSet<>();

       for (int n : nums) {
           set.add(n);
       }
       if (p < set.size()) {
           answer = p;
       } else {
           answer = set.size();
       }
       System.out.println(set);

       return answer;
    }
}

package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon2587 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int [] ary = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++) {
            int a = sc.nextInt();
            ary[i] = a;
            sum += a;
        }

        Arrays.sort(ary);
        System.out.println(ary[2]);
        System.out.println(sum/ary.length);
    }
}

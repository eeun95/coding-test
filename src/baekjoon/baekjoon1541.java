package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String formula = sc.next();


        StringTokenizer st = new StringTokenizer(formula, "-");

        int sum = 0;
        boolean start = true;
        while (st.hasMoreTokens()) {
           int temp = 0;

            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");
            while (st2.hasMoreTokens()) {
                temp += Integer.parseInt(st2.nextToken());
            }
            if(start) {
                sum = temp;
                start = false;
            } else {
                sum -= temp;
            }
        }
    }
}

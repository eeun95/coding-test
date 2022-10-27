package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String a= s.split(" ")[0];
        String b= s.split(" ")[1];

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        int i=0;
        while(num2 != num1) {
            System.out.println(num2);

            if (num2 % 2 == 1) {
                num2 = Integer.parseInt(String.valueOf(num2).substring(0, String.valueOf(num2).length()-1));

                System.out.println(num2);
                i++;
            } else {
                num2 /= 2;
                i++;
            }

            if(num1==num2) {
                i+=1;
                break;
            }
            if(num2<num1) {
                i=-1;
                break;
            }
        }
        System.out.println(i);
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String[] s = br.readLine().split(" ");
            if(s[0].equals("0") && s[1].equals("0")) break;

            int first = Integer.parseInt(s[0]);
            int second = Integer.parseInt(s[1]);

            if(second%first == 0) {
                System.out.println("factor");
            }
            else if(first%second == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }

    }
}

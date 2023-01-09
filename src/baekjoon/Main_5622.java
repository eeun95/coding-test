package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Map<Character, Integer> map = new HashMap<>();
        int dial = 2;
        int four = 0;
        for (int i = 97; i < (97 + 26); i++) {
            map.put((char) i, dial);
            if(dial < 7) {
                if (i % 3 == 0) {
                    dial++;
                }
            } else {
                four++;
                if(dial==8 && four==3) {
                    dial++;
                    four=0;
                }
                if(four==4) {
                    dial++;
                    four = 0;
                }
            }

        }
        int sum =0;
        for (int i = 0; i < s.length(); i++) {
            sum += map.get(s.toLowerCase().charAt(i));
        }
        System.out.println(sum + s.length());
    }
}

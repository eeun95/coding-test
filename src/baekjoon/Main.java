package baekjoon;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String quiz = br.readLine();

            int count = 0;
            int total = 0;
            for (int j = 0; j < quiz.length(); j++) {
                String answer = quiz.substring(j, j + 1);
                if(answer.equals("O")) {
                    count++;
                    //System.out.println(count);
                    total += count;
                } else {
                    count=0;
                    //System.out.println(count);
                }
            }
            System.out.println(total);
        }

    }
}

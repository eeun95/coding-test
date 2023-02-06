package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            boolean b = true;
            String s = br.readLine();
            while(true) {
                String newString = s.replace("()", "");
                s = newString;
                if (!newString.contains("()")) {
                    if(!newString.equals("")) {
                        //System.out.println("NO > " + newString);
                        b = false;
                    }
                    break;
                }
            }
            System.out.println((b) ? "YES" : "NO");
        }
    }
}

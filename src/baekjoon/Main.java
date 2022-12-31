package baekjoon;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        Map<String, Integer> map = new HashMap<>();
        for (String a : alphabet) {
            map.put(a, -1);
        }
        for (int i = 0; i < s.length(); i++) {
            String ss = s.substring(i, i + 1);
            //System.out.println(i+" "+ss);
            if(map.get(ss) == -1) {
                map.put(ss, i);
            }
        }
        for (String key : map.keySet()) {
            System.out.print(map.get(key)+" ");
        }
    }
}

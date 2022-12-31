package baekjoon;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            map.put(s, R);
        }

        for (String s : map.keySet()) {
            for (int j = 0; j < s.length(); j++) {
                String ss = s.substring(j, j + 1);
                System.out.print(ss.repeat(map.get(s)));
            }
            System.out.println();

        }
    }
}

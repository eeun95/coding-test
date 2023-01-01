package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toLowerCase();        // 소문자로 다 바꿔 ~!

        Map<String, Integer> map = new HashMap<>();
        for (int i = 97; i <= 122; i++) {
            String ch = String.valueOf((char) i);
            map.put(ch, 0);
        }

        for (int i = 0; i < s.length(); i++) {
            String ss = s.substring(i, i + 1);
            map.put(ss, map.get(ss) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));

        int count = 0;
        int max = 0;
        String result = "";
        for (String k : list) {
            if(count > 1) break;
            if(count==0) {
                max = map.get(k);
                result = k;
            }
            if(count==1 && max == map.get(k)) {
                result = "?";
            }
            count++;
        }
        System.out.println(result.toUpperCase());
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            map.put(s, s.length());
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //System.out.println(o1.getKey() + " " + o1.getValue() + " / " + o2.getKey() + " " + o2.getValue());
                if(o1.getValue() == o2.getValue()) {
                    return o1.getKey().compareTo(o2.getKey());
                } else {
                    return o1.getValue() - o2.getValue();
                }
            }
        });
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey());
        }


    }
}

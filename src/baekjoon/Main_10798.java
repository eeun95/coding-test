package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_10798 {
    static int count = 5;
    static int maxLength = 15;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr.get(j).add(s.substring(j, j + 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (ArrayList<String> list : arr) {
            if(list.isEmpty()) continue;
            for (String s : list) {
                sb.append(s);
            }
        }
        System.out.println(sb.toString());
    }
}

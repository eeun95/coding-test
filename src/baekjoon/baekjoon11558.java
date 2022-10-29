package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class baekjoon11558 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        int people = Integer.valueOf(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();

        int you = 0;
        for (int i = 1; i <= people; i++) {
            int pick = Integer.valueOf(br.readLine());
            map.put(i, pick);
            if(pick == people) {
                you = i;
            }
        }
        System.out.println(you);
    }
}

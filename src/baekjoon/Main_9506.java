package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;

public class Main_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while(n!=-1) {
            n = Integer.parseInt(br.readLine());

            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if(n%i == 0) {
                    sum += i;
                    list.add(i);
                }
            }
            if(n==sum) {
                String join = String.join(" + ", list.stream().map(Object::toString).toArray(String[]::new));
                System.out.println(n+" = "+join);
            } else {
                if (n == -1) break;
                System.out.println(n+" is NOT perfect.");
            }
        }
    }
}

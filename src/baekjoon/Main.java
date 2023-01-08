package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Integer[] a = new Integer[s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s.substring(i, i + 1));
        }

        Arrays.sort(a, Comparator.reverseOrder());
        for (int i : a) {
            System.out.print(i);
        }
    }
}
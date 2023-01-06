package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();
        String s = String.valueOf(sb.append(st.nextToken() + " " + st.nextToken()).reverse());
        System.out.println(Math.max(Integer.parseInt(s.split(" ")[0]), Integer.parseInt(s.split(" ")[1])));

    }
}
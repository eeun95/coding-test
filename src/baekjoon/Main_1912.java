package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int i=0;
        while (st.hasMoreTokens()) {
            num[i] = Integer.valueOf(st.nextToken());
            i++;
        }

        Arrays.stream(num).forEach(System.out::println);
    }
}

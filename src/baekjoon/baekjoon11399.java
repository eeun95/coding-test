package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon11399 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(br.readLine());
        String t = br.readLine();

        int[] ary = new int[p];
        StringTokenizer st = new StringTokenizer(t, " ");
        int i=0;
        while(st.hasMoreTokens()) {
            ary[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        Arrays.sort(ary);
        int total = 0;
        int sum = 0;
        for(int time : ary) {
            sum += time;
            total += sum;
        }
        System.out.println(total);

    }
}

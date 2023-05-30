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

        int[] array = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        while(st.hasMoreTokens()) {
            array[cnt] = Integer.parseInt(st.nextToken());
            cnt++;
        }

        // 직전 수에 현재 수를 더한게 더큰지, 직전 수까지만 더하는게 더 큰지
        // ex. 10 -4 3 1 5 6 -35 12 21 -1
        System.out.println(Arrays.toString(array));
    }
}

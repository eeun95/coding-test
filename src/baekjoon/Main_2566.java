package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] array = new int[9][9];
        int max = 0;
        int x = 0, y=0;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int j=0;
            while(st.hasMoreTokens()) {
                array[i][j] = Integer.parseInt(st.nextToken());
                if(max < array[i][j]) {
                    max = array[i][j];
                    x = i;
                    y = j;
                }
                j++;
            }
        }
        System.out.println(max);
        System.out.println((x+1)+" "+(y+1));
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] A = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] loc = br.readLine().split(" ");
            int x = Integer.parseInt(loc[0]);
            int y = Integer.parseInt(loc[1]);

            A[i][0] = x;
            A[i][1] = y;
        }

        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) {
                    // 같을 경우 x 축 체크
                    return o1[0]-o2[0];
                } else {
                    // y 축 체크
                    return o1[1]-o2[1];
                }
            }
        });

        for (int[] ints : A) {
            System.out.println(ints[0]+" "+ints[1]);
        }
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean b = true;
        int N = Integer.parseInt(br.readLine());

        int[] space = Arrays.stream(br.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
        int index = -1;
        for (int i = 0; i < space.length; i++) {
            if(space[i]==1) {
                index = i;
            }
        }

        int tmp = space[0];
        for(int i=1; i<index; i++) {
            if(tmp < space[i]) {
                b = false;
            } else {
                tmp = space[i];
            }
        }

        if(b) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}

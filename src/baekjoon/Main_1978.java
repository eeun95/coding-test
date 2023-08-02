package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = array.length;
        for(int i=0; i<array.length; i++) {
            if(array[i] == 0 || array[i] == 1 ) {
                sum--;
            }
            boolean hasPrime = true;
            for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                if(array[i]%j==0) {
                    sum--;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}

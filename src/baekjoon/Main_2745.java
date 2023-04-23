package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String N = input[0];
        int B = Integer.parseInt(input[1]);

        // ex.ZZZZZ 36
        // (35*36^4)+(35*36^3)+(35*36^2)+(35*36)+(35*1)

        long sum = 0;
        int j=0;
        for (int i = N.length()-1; i >= 0; i--,j++) {
            char c = N.charAt(j);
            int ascii = 0;
            if(c >= '0' && c <= '9') {
                // 0 빼주는 이유는 '0'이 아스키코드 48이라서
                // 숫자로 바꾼 아스키에 -48 해주는거랑 똑같
                ascii = c-'0';
            } else {
                ascii = c-55;
            }
            sum += ascii * (Math.pow(B, i));
        }
        System.out.println(sum);
    }
}

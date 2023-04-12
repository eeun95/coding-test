package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int length = s.length();
        String[] sArray = new String[length];
        for (int i = 0; i < s.length(); i++) {
            sArray[i] = s.substring(i, i+1);
        }
        // 0 1 2 3 4  -> 0=4 1=3
        // 0 1 2 3 4 5  0=5 1=4 2=3
        int result = 1;
        int j = length-1;
        for (int i = 0; i < length / 2; i++,j--) {
            //System.out.println(i+" "+j);
            if(!sArray[i].equals(sArray[j])) {
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}

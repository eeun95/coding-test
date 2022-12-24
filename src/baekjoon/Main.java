package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int n = Integer.valueOf(N);


        int count = 0;

        while(true) {
            if(Integer.parseInt(N)<10) {
                N = "0"+N;
            }
            int a = Integer.parseInt(N.substring(0, 1));
            int b = Integer.parseInt(N.substring(1));

            int front = b;
            int back = (a + b >= 10) ? (a + b - 10) : (a + b);

            //System.out.println(front+" "+back);
            N = front+""+back;
            //System.out.println("N = "+N);
            count++;
            if(n==Integer.parseInt(N)) break;
        }
        System.out.println(count);
    }
}

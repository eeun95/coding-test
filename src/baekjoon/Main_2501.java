package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        // 6
        // 1 2 3 6
        // 3

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            if(N%i==0) {
                //System.out.println(i);
                list.add(i);
            }
        }
        if(list.size()<K) {
            System.out.println("0");
        } else {
            System.out.println(list.get(K - 1));
        }
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main_1003 {
    static Map<Integer, int[]> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.valueOf(br.readLine());
        for (int i = 0; i <= 40; i++) {
            fibonacci((Integer) i);
        }

        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < T; j++) {
            Integer n = Integer.valueOf(br.readLine());
            sb.append(map.get(n)[0]+" "+map.get(n)[1]+"\n");
        }
        System.out.println(sb);
    }
    public static void fibonacci(Integer n) {
        if(n==0 || n==1) {
            map.put(0, new int[]{1, 0});
            map.put(1, new int[]{0, 1});
        } else {
            int cnt0 = map.get(n-1)[0] + map.get(n-2)[0];
            int cnt1 = map.get(n-1)[1] + map.get(n-2)[1];
            map.put(n, new int[]{cnt0, cnt1});
        }
    }
}

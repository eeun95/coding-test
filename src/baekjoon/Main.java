package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            a.add(Integer.parseInt(br.readLine()));
        }
        // Arrays.sort 사용하면 시간 초과
        Collections.sort(a);
        StringBuilder sb = new StringBuilder();
        for (int i : a) {
            // 하나씩 출력하면 시간초과 나기때문에 빌더 사용
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }
}
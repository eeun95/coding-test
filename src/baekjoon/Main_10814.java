package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            array[i] = age +" "+i+" "+ name;
        }
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        for (String s : array) {
            String[] ss = s.split(" ");
            System.out.println(ss[0]+" "+ss[2]);
        }
    }
}

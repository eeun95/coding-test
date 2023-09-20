package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 10진법 수 N을 B진법으로 출력
        // 60466175 36 ZZZZZ

        //(36^4 * 35 )+ (36^3 * 35 +) + (36^2 * 35) + (36^1 * 35) + 35

        // 8 2 1000(2)
        // 18 3 200(3)

        Stack<Integer> s = new Stack<>();

        int quotient = N;
        int remain;
        while(quotient >= B) {
            remain = quotient%B;
            //System.out.println(quotient+"/"+B+"="+remain);
            quotient /= B;
            s.push(remain);
        }
        //System.out.println(quotient);
        s.push(quotient);

        // 65 = A
        // 90 = Z

        StringBuilder sb = new StringBuilder();
        while(!s.empty()) {
            int n = s.pop();
            if(n >= 10) {
                char c = (char) (n + 55);
                sb.append(c);
            } else {
                sb.append(n);
            }
        }
        System.out.println(sb);
//        int a = 35+55;
//        char b = (char) a;
//        System.out.println(b);

    }
}

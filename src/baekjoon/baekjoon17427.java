package baekjoon;

import java.util.HashMap;
import java.util.HashSet;

public class baekjoon17427 {

    public static void main(String[] args) {
        int N = 10000;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            //System.out.println(i+":"+getDivisorSum(i));
            sum += getDivisorSum(i);
        }
        System.out.println(sum);

    }


    public static int getDivisorSum(int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        // 몫, 나머지 초기화
        int d = 0;
        int q = 1;
        int r = 0;
        if (x == 1) {
            return 1;
        }
        while(true) {
            d = x/q;
            r = x%q;

            if (map.containsValue(q)) {
                break;
            }
            if(r==0) {
                map.put(q, d);
                if (q == d) {
                    map.put(q, 0);
                }
            }
            q++;
        }

        for (int key : map.keySet()) {
            //System.out.println(key + " " + map.get(key));
            sum += (key + map.get(key));
        }

        return sum;
    }

}

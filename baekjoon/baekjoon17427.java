package baekjoon;

import java.util.HashMap;

public class baekjoon17427 {

    public static void main(String[] args) {
        int N = 10;
        int sum = 0;

        getDivisorSum2(N);
        for (int i = 1; i <= N; i++) {
            //System.out.println(i+":"+getDivisorSum(i));
            //sum += getDivisorSum2(i);
        }

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

    public static int getDivisorSum2(int x) {
        int sum = 0;

        return sum;
    }

}

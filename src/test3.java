import java.util.HashMap;
import java.util.Map;

public class test3 {
    public static void main(String[] args) {
        solution(21);
        solution(0);
    }

    public static int solution(int n) {
        int answer = -1;
        if(n==0) return 0;

        int[] seg7 = new int[]{6, 2, 5, 5, 4, 5, 6, 4, 7, 6};
        Map<String, Integer> seg4 = new HashMap<>();
        seg4.put("+", 2);
        seg4.put("-", 1);
        seg4.put("/", 1);
        seg4.put("*", 2);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < seg7.length; i++) {
            for (int j = 0; j < seg7.length; j++) {
                for (String k : seg4.keySet()) {
                    int key = 0;
                    if(k=="+" && (i+j)<10) {
                        //System.out.println(i + k + j + "=" + (i + j));
                        key = seg7[i] + seg4.get(k) + seg7[j] + seg7[i + j];
                    }
                    else if(k=="-" && (i-j)>=0) {
                        //System.out.println(i + k + j + "=" + (i - j));
                        key = seg7[i] + seg4.get(k) + seg7[j] + seg7[i - j];
                    }
                    else if(k=="/" && j!=0) {
                        //System.out.println(i + k + j + "=" + (i / j));
                        key = seg7[i] + seg4.get(k) + seg7[j] + seg7[i / j];
                    }
                    else if(k=="*" && (i*j) <10) {
                        //System.out.println(i + k + j + "=" + (i * j));
                        key = seg7[i] + seg4.get(k) + seg7[j] + seg7[i * j];
                    }

                    map.put(key, map.getOrDefault(key, 0)+1);
                }
            }
        }
        System.out.println(map.get(n));

        return answer;
    }
}

package hash;

import java.util.HashMap;

public class hash3_fake {
    public static void main(String[] args) {
        String[][] clothes1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}}; //5
        String[][] clothes2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}}; //3

        System.out.println(solution(clothes2));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0; i< clothes.length; i++) {
            String key = clothes[i][1];
            if(hm.containsValue(key)) {
                hm.put(key, hm.get(key) + 1);
            } else {
                hm.put(key, hm.getOrDefault(key, 0) + 1);
            }
        }

        for (String k : hm.keySet()) {
           answer *= hm.get(k)+1;
        }

        System.out.println(answer+" ");
        return answer-1;
    }
}

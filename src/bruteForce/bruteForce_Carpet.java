package bruteForce;

import java.util.HashMap;

public class bruteForce_Carpet {
    public static void main(String[] args) {

        int brown = 24;
        int yellow = 24;

        System.out.println(solution(brown, yellow));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = {};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                hm.put(i, yellow / i);
            }
        }

        int total = brown+yellow;
        int brownSide = (total-4-yellow)/2;     // 전체 타일 갯수 - 모서리 4개 - 노란색 갯수

        int width = 0;
        int height = 0;

        for (int i : hm.keySet()) {
            int sum = i + hm.get(i);

            if(sum == brownSide) {
                System.out.println(i);
                if (i < hm.get(i)) {
                    width = hm.get(i);
                    height = i;
                } else {
                    width = i;
                    height = hm.get(i);
                }
            }
        }

        width += 2;
        height += 2;

        answer = new int[]{width, height};

        return answer;
    }
}

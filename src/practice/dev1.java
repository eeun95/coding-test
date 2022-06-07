package practice;

import java.util.Arrays;

public class dev1 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        lottos = new int[]{0,0,0,0,0,0};
        win_nums = new int[]{20, 9, 3, 45, 4, 35};

        lottos = new int[]{ 1, 2, 3, 4, 5, 6};
        win_nums = new int[]{7, 8, 9, 10, 11, 12};
        solution(lottos, win_nums);
        lottos = new int[]{20, 9, 3, 45, 4, 35};
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int zero_cnt = 0;
        int lotto_cnt = 0;
        for (int i = 0; i < lottos.length; i++) {
            // 맞을 수도 틀릴 수도 있는 미지의 수
            if (lottos[i] == 0) {
                zero_cnt++;
            }

            // 무조건 맞는 로또 갯수
            for (int lotto : win_nums) {
                if (lotto == lottos[i]) {
                    lotto_cnt++;
                    break;
                }
            }
        }
        System.out.println("미지 : "+zero_cnt+" 무조건 맞음 : "+lotto_cnt);
        int min = 0;
        int max = 0;

        min = 7-lotto_cnt;      // 확정 등수
        max = 7-(lotto_cnt+zero_cnt);

        min = (min==7) ? 6 : min;
        max = (max==7) ? 6 : max;

        System.out.println(min+" "+max);
        answer = new int[]{max, min};

        return answer;
    }
}

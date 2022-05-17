package greedy;

import java.util.Arrays;

public class greedy_gymClothes {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {1, 2, 4};
        int[] reserve = {2, 4, 5}; // 정답 4
        System.out.println("return : "+solution(n, lost, reserve));

        lost = new int[] {1, 2, 4};
        reserve = new int[] {2, 3, 4, 5}; // 정답 4
        System.out.println("return : "+solution(n, lost, reserve));

        lost = new int[]{1,3,5};
        reserve = new int[]{1,3,5};
        System.out.println("return : "+solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int l_cnt = lost.length;
        int r_cnt = reserve.length;
        int s_cnt = n-(l_cnt+r_cnt);

        int cnt = 0;

        for (int i : reserve) {

            for (int j : lost) {
               //System.out.println(i + "번 학생 > " + j+"번 학생");

                int max = i+1;
                int min = i-1;

                // 빌려줄 수 있는 지 확인
                if (j==max || j==min) {
                    cnt++;
                    break;
                }
            }
        }
        if (cnt >= l_cnt) {
            // 다 빌려줄 수 있음
            answer = n;
        } else {
            answer = s_cnt + r_cnt + cnt;
        }
        System.out.println(">>>"+cnt);

        for (int i : lost) {
            if(Arrays.asList(reserve).contains(i)) {
                System.out.println(i);
            }
        }


        return answer;
    }
}

package greedy;

import java.util.*;

public class greedy_gymClothes {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {1, 2, 4};
        int[] reserve = {2, 4, 5}; // 정답 4

        n = 5;
        lost = new int[] {1, 2, 4};
        reserve = new int[] {2, 3, 4, 5}; // 정답 4

        System.out.println("return : "+solution(n, lost, reserve));
        n = 5;
        lost = new int[] { 2, 4};
        reserve = new int[] {1,3, 5}; // 정답 5


    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(reserve);
        Arrays.sort(lost);

        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> rq = new LinkedList<>();
        Queue<Integer> lq = new LinkedList<>();
        Queue<Integer> dq = new LinkedList<>();

        int cnt = reserve.length;

        for (int l : lost) {
            set.add(l);
            lq.add(l);
        }
        for (int r : reserve) {
            set.add(r);
            rq.add(r);

            if (lq.contains(r)) {
                lq.remove(r);
                rq.remove(r);
                dq.add(r);
            }
        }

        System.out.println(lq.size()+" "+rq.size());

        for (int r : reserve) {

            if (dq.contains(r)) {
                continue;
            }

            int idx = 0;
            while (idx < lq.size()) {
                if (lq.isEmpty()) {
                    break;
                }
                int max = r+1;
                int min = r-1;

                int l = lq.poll();

                if (l == max || l == min) {
                    System.out.println(r+"번 학생이 "+l+"번 학생에게 옷 빌려줌");
                    lq.remove(l);
                    cnt++;
                    break;
                } else {
                    lq.add(l);
                }

                idx ++;
            }
        }

        int s_cnt = n- set.size();      // 체육수업 무조건 듣는 학생 수
        System.out.println(s_cnt+" + "+cnt);
        answer = s_cnt + cnt;

        return answer;
    }
}

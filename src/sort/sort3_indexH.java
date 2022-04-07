package sort;

import java.util.Arrays;

public class sort3_indexH {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};  // 3
        int[] citations2 = {3, 4, 5, 11, 15, 16, 17, 18, 19, 20};
        int[] citations3 = {0,1,2,3,4,5,6,7};
        int[] citations4 = {10, 10, 10, 10, 10};
        int[] citations5 = {7,8,9,10,11,12};
        System.out.println(solution(citations2));
    }
    public static int solution(int[] citations) {
        int answer = 0;

        int h_index = 0;
        int max = citations.length;
        Arrays.sort(citations);

        for (int i = 0; i < max; i++) {
            int cnt = 0;
            int use = citations[i];
            if(use==0) continue;
            for (int j = i; j < max; j++) {
                if (use <= citations[j]) {
                    cnt++;
                    System.out.println(use + " " + cnt);
                }
            }
            if(max==cnt) {
                h_index = max;
                //break;
            }
            if(use > cnt) {
                System.out.println(use + " " + cnt+" "+citations[i-1]);
                h_index = cnt;
                break;
            }
            System.out.println("================");
        }
        answer = h_index;

        return answer;
    }
}

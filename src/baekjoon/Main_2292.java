package baekjoon;

import java.util.Scanner;

public class Main_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1; // 겹 수(최소 루트)
        int range = 2;	// 범위 (최솟값 기준)

        if (N == 1) {
            System.out.print(1);
        }

        else {
            while (range <= N) {	// 범위가 N보다 커지기 직전까지 반복
                range = range + (6 * count);	// 다음 범위의 최솟값으로 초기화
                count++;	// count 1 증가
            }
            System.out.print(count);
        }
        /*
        int bee = 1;
        int layer = 6;
        int tmp = 1;
        for (int i = 2; i <= N; i++) {
            System.out.println(layer+" "+bee+" "+tmp+" "+i);
            if (tmp == layer) {
                tmp = 0;
                bee++;
                layer = 6 * bee;
            }
            tmp++;
        }
        System.out.println(bee+1);
*/
    }
}

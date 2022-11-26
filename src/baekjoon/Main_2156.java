package baekjoon;

import java.util.Scanner;

public class Main_2156 {
    static int[] amount, dp;
    static int drink, max = 0;
    public static void main(String[] args) {
        // 잔에 있는 건 다 마셔야하고 마신 후 제자리에 둬야함
        // 연속 3잔을 마실 수 없음
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();           // 포도주 잔의 개수
        amount = new int[n + 1];        // 포도주 양을 저장한 배열
        //drink = new int[n + 1];         // 마신 포도주 순서 (0 1 2 ..)
        max = n - (n/3);                // 최대 마실 수 있는 잔
        System.out.println("최대 마실 수 있는 잔 "+max);
        for (int i = 0; i < n; i++) {
            amount[i] = sc.nextInt();   // 마실 수 있는 포도주의 양
        }
    }
    public static void drink() {
        drink++;
    }
    public static void dp() {

    }
}

package baekjoon;

import java.util.Scanner;

public class Main_15989 {
    public static void main(String[] args) {
        // 각 테스트 케이스마다 n을 1,2,3의 합으로 나타내는 방법의 수를 출력한다
        // 합을 이루고 있는 수의 순서만 다른 것은 같은 것으로 친다
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] result = new int[T];
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            dp(n);
        }
        for(int r : result) {
            System.out.println(r);
        }
    }
    public static void dp(int n) {

    }
}

/*
* 4 (1+1+1+1) (1+2+1) (1+3) (2+2) = 4
* 7 (1+1+1+1+1+1+1) (1+1+1+1+1+2) (1+1+1+2+2) (1+2+2+2) (1+1+1+1+3) (1+3+3) (1+1+2+3) (2+2+3) = 8
* 10
* */
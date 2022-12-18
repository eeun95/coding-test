package baekjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int i = sc.nextInt();
        int c = sc.nextInt();

        if (d == i && d == c && i == c) {
            System.out.println(10000+(d*1000));
        } else if((d==i) || (d==c) || (i==c)) {
            if(d==i || d==c) {
                System.out.println(1000+(d*100));
            } else {
                System.out.println(1000+(i*100));
            }
        } else {
            int max = Math.max(d, i);
            max = Math.max(max, c);
            System.out.println(max*100);
        }
    }
}

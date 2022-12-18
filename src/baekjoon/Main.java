package baekjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String b = sc.next();

        System.out.println(A*(Integer.parseInt(b.substring(2))));
        System.out.println(A*(Integer.parseInt(b.substring(1,2))));
        System.out.println(A*(Integer.parseInt(b.substring(0,1))));
        System.out.println(A*Integer.parseInt(b));
    }
}

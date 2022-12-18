package baekjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        int h, m =0;
        if(M>=45) {
            h = H;
            m = M-45;
        } else {
            h = H-1;
            m = (60+M)-45;
        }
        if(h<0) {
            h = (24+h);
        }
        System.out.println(h+" "+m);
    }
}

package baekjoon;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        boolean[] A = new boolean[31];
        for (int i = 1; i <= 28; i++) {
            A[sc.nextInt()] = true;
        }
        for (int i = 1; i <= 28; i++) {
            if(!A[i]) {
                System.out.println(i);
            }
        }
    }
}

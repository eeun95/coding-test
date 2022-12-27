package baekjoon;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] A = new double[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        double sum = 0;
        double max = A[N-1];
        for (int i = 0; i < N; i++) {
            sum += (A[i]/max)*100;
        }
        System.out.println(sum / N);

    }
}

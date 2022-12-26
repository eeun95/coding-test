package baekjoon;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        List list = new ArrayList();
        int[] A = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt()%42;
            if(!list.contains(num)) {
                list.add(num);
            }
        }
        System.out.println(list.size());

    }
}

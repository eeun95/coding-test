package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_10815 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(s[i]);
            if(binarySearch(num)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString());

    }

    public static boolean binarySearch(int num) {
        int left = 0;
        int right = arr.length-1;
        int mid = 0;

        while(left <= right) {
            mid = (left + right) / 2;
            if (num > arr[mid]) {
                // 기준값보다 클 때 왼쪽 다 버림
                left = mid+1;
            } else if(num < arr[mid]) {
                // 기준값보다 작으면 오른쪽 다 버림
                right = mid-1;
            } else {
                return true;
            }
        }
        return false;
    }
}

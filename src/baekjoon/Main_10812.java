package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main_10812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];
        for (int i = 0; i <= N; i++) arr[i] = i;
        for (int idx = 0; idx < M; idx++) {
            String[] s = br.readLine().split(" ");
            int i = Integer.parseInt(s[0]);
            int j = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);

            int[] pre = Arrays.copyOfRange(arr, k , j+1 );
            int[] sub = Arrays.copyOfRange(arr, i, k);
            //System.out.println(Arrays.toString(pre)+" "+Arrays.toString(sub));

            int index = 0;
            for (int x = 1; x <= arr.length; x++) {

                if(x < i || x > j) {
                    //System.out.print(x+" 안포함 ");
                } else {
                    if(index < pre.length) {
                        //System.out.println("p"+x+"->"+pre[index]);
                        arr[x] = pre[index];
                        index++;
                    } else {
                        int indexSub = (index-pre.length-1)+1;
                        //System.out.println(x+"->"+sub[indexSub]);
                        arr[x] = sub[indexSub];
                        index++;
                    }
                }
            }

            // 10
            // 1 2 3 4 5 6 7 8 9 10
            // 1 6 4 -> 4 5 6 1 2 3 7 8 9 10
            // 3 9 8 -> 4 5 8 9 6 1 2 3 7 10
            // 2 10 5 -> 4 6 1 2 3 7 10 5 8 9
            // 1 3 3 -> 1 4 6 2 3 7 10 5 8 9
            // 2 6 2 -> 1 4 6 2 3 7 10 5 8 9
        }
        IntStream.range(0, arr.length)
                .filter(i -> i != 0)
                .mapToObj(i -> arr[i] + " ")
                .forEachOrdered(System.out::print);
    }
}

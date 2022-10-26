package baekjoon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class baekjoon1904 {
    static HashSet<String> hs = new HashSet<>();
    static String[] ary = new String[]{"00", "1", "11"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < ary.length; i++) {
            set(n, ary[i]);
        }

        Iterator iter = hs.iterator();	// Iterator 사용
        while(iter.hasNext()) {//값이 있으면 true 없으면 false
            System.out.println(iter.next());
        }
    }
    public static void set(int n, String s) {
        while(true) {
            if (hs.contains(s) || s.length() >= n) {
                break;
            }
            if(s.length() == 2) {
                if (n % 1 == 2) {
                    // 홀수일 경우 1로 채움
                    hs.add(s+"1".repeat(n-s.length()));
                    System.out.println(s+"1".repeat(n-s.length()));
                } else {
                    for (int i = 0; i < ary.length; i++) {
                        if(ary[i].length()>1) {
                            hs.add(s + ary[i]);
                            System.out.println(s + ary[i]);
                            set(n, s + ary[i]);
                        }
                    }
                }
            } else {

            }
        }

    }
}

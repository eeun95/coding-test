package baekjoon;

import java.util.Scanner;

public class baekjoon9184 {
    static int dp[][][] = new int[21][21][21];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            String n = sc.nextLine();
            String[] ary = n.split(" ");

            int a = Integer.parseInt(ary[0]);
            int b = Integer.parseInt(ary[1]);
            int c = Integer.parseInt(ary[2]);

            if (a == -1 && b == -1 && c == -1) {
                break;
            }
            sb.append("w("+a+", "+b+", "+c+" ) = "+w(a,b,c)+"\n");
        }
        System.out.println(sb);
    }

    public static int w(int a, int b, int c) {
        if((a<=20 && b<=20 && c<=20) && dp[a][b][c] != 0) {
            return dp[a][b][c];
        }
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        if(a>20 || b>20 || c>20) {
            return dp[20][20][20] = w(20,20,20);
        }
        else if(a<b && b<c) {
            return dp[a][b][c] = w(a,b,c-1) + w(a,b-1,c-2)-w(a,b-1,c);
        }
        else {
            return dp[a][b][c] =w(a-1,b,c)+w(a-1,b-1,c)+w(a-1,b,c-1)-w(a-1,b-1,c-1);
        }
    }
}

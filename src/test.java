import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    static long[] factorial;
    public static void main(String[] args) {
        double ceil = Math.round(((10/20)*10)/10);
        System.out.println(Math.floor(31));

        System.out.println(Math.round((double) 10 / (double) 20));
        /*
        factorial = new long[1000];
        long n = fac(10);
        System.out.println(n);
        StringBuilder sb = new StringBuilder();
        sb.append(362800);
        StringBuilder reverse = sb.reverse();
        boolean startFlag = true;
        for (int i = 0; i < reverse.length(); i++) {
            char c = (char) 0;
            if(startFlag || reverse.charAt(i)=='0') {
                startFlag = false;
            } else {
                break;
            }
        }

         */
    }
    static long fac(int n) {
        if(n==1) {
            factorial[1] = 1;
            return factorial[1];
        } else {
            factorial[n] = n*fac(n-1);
            return factorial[n];
        }
    }
}

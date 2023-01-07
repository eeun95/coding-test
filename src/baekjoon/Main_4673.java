package baekjoon;

public class Main_4673 {
    static int[] self = new int[10000];
    public static void main(String[] args) {

        for (int i = 1; i <= 10000; i++) {
            d(i);
        }
    }
    public static int d(int n) {
        String s = n+"";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.substring(i, i + 1));
        }
        return (n + sum);
    }
}

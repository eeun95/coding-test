package skillCheck;

public class test1_1 {
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        solution(n, m);
    }

    public static int[] solution(int n, int m) {
        int[] answer = {};

        int gcd = getGCD(n, m);
        int lcm = (n*m)/gcd;

        answer = new int[]{gcd, lcm};
        return answer;
    }
    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}

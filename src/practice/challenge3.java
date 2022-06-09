package practice;

public class challenge3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        solution(a, b)
    }

    public static int solution(int[] a, int[] b) {
        int answer = 1234567890;

        int sum = 0;
        int i = 0;
        for (int num : a) {
            sum += (num * b[i]);
            i++;
        }
        return answer;
    }
}

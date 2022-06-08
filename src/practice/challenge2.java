package practice;

public class challenge2 {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;

        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                // 양수
                sum += absolutes[i];
            } else {
                // 음수
                sum -= absolutes[i];
            }
        }
        answer = sum;
        return answer;
    }

    public int solution2(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
}

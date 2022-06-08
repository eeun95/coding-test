package practice;

public class practice1 {
    public static void main(String[] args) {
        int n = 112;
        solution(n);
    }

    public static String solution(int n) {
        String[] num = {"4","1","2"};
        String answer = "";

        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }
}

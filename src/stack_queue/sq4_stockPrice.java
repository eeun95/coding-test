package stack_queue;

public class sq4_stockPrice {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};     // 4 3 1 1 0
        System.out.println(solution(prices));
    }
    public static int[] solution(int[] prices) {
        int[] answer = {};

        int max_sec = prices.length;
        answer = new int[max_sec];

        for (int i = 0; i < max_sec; i++) {
            int sec = 0;
            for (int j = i + 1; j < max_sec; j++) {
                System.out.println(prices[i] + " " + prices[j]);
                if(prices[i] <= prices[j]) {
                    sec++;
                } else {
                    sec++;
                    break;
                }
            }
            answer[i] = sec;
        }

        return answer;
    }
}

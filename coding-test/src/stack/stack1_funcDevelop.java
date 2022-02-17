package stack;

import java.util.Stack;

public class stack1_funcDevelop {
    public static void main(String[] args) {
        int[] answer = solution(new int[]{93,30,55}, new int[]{1,30,5});
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int max_progress = 100;

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i< progresses.length; i++) {
            int remain_progress = (max_progress-progresses[i])/speeds[i];
            if((max_progress-progresses[i])%speeds[i]>0) remain_progress++;

            stack.push(remain_progress);
        }

        for(int i=0; i< progresses.length; i++) {

        }

        return answer;
    }
}

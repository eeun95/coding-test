package sort;

import java.util.Arrays;

public class sort1_numberK {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        System.out.println(solution(array, commands));

    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];

        int startIdx = 0;
        int endIdx = 0;
        int returnIdx = 0;
        for (int i = 0; i < commands.length; i++) {

            startIdx = commands[i][0];
            endIdx = commands[i][1];
            returnIdx = commands[i][2];

            int [] ary = new int[endIdx-startIdx+1];
            int idx = 0;
            for(int k=startIdx-1; k<endIdx; k++) {
                ary[idx] = array[k];
                idx++;
            }
            Arrays.sort(ary);
            answer[i] = ary[returnIdx - 1];
        }

        return answer;
    }
}

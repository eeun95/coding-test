import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class test2 {
    public static void main(String[] args) {

        solution(new int[]{1, 2, 3, 4, 5, 6}, new int[]{6, 2, 5, 1, 4, 3});
        solution(new int[]{11, 2, 9, 13, 24}, new int[]{9, 2, 13, 24, 11});
    }
    public static int[] solution(int[] ball, int[] order) {
        int[] answer = new int[ball.length];
        Deque<Integer> q = new LinkedList<>();
        for (int i : ball) {
            q.add(i);
        }

        int cnt = 0;
        while (!q.isEmpty()) {
            int first = q.peekFirst();
            int last = q.peekLast();

            for(int o : order) {
                //System.out.println("시작:"+first+" / 끝:"+last+" / 순서:"+o);
                if (o == first || o == last) {
                    q.remove(o);
                    //System.out.println(o+" 공빼");
                    answer[cnt] = o;
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}

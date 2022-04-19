package bruteForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class bruteForce1_test {
    public static void main(String[] args) {
        int answers[] = {1, 2, 3, 4, 5};
        int answers2[] = {1, 3, 2, 4, 2};
        System.out.println(solution(answers));
    }

    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[][] students = {{1, 2, 3, 4, 5, 1, 2, 3, 4, 5},{2, 1, 2, 2, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (students[i][j] == answers[j]) {
                    hm.put((i+1), hm.getOrDefault((i+1), 0)+1);
                }
            }
        }

        // 내림차순 정렬,, 소스 분석은 좀 나중에
        List<Integer> keySet = new ArrayList<>(hm.keySet());
        Collections.sort(keySet, (value1, value2) -> (hm.get(value2).compareTo(hm.get(value1))));

        //System.out.println(keySet);

        answer = new int[keySet.size()];

        for(Integer stu : keySet) {
            //System.out.println(stu + " " + hm.get(stu));
            answer[stu-1] = stu;
        }

        return answer;
    }
}

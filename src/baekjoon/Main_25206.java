package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        int count = 20;
        double sum = 0;
        double sumScore = 0;
        for (int i = 0; i < count; i++) {
            String[] info = br.readLine().split(" ");
            double score = Double.parseDouble(info[1]);
            String grade = info[2];

            if(grade.equals("P")) continue;
            // 학점 X 과목평점 의 합을 학점의 총합으로 나눈 값
            sum += map.get(grade)*score;
            sumScore += score;
        }
        System.out.println(sum/sumScore);
    }
}

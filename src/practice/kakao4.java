package practice;

import java.util.HashMap;

public class kakao4 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        solution(s);
    }
    public static int solution(String s) {
        int answer = 0;

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String str = "";
            switch (i) {
                case 0 : str = "zero"; break;
                case 1 : str = "one"; break;
                case 2 : str = "two"; break;
                case 3 : str = "three"; break;
                case 4 : str = "four"; break;
                case 5 : str = "five"; break;
                case 6 : str = "six"; break;
                case 7 : str = "seven"; break;
                case 8 : str = "eight"; break;
                case 9 : str = "nine"; break;
            }
            map.put(str, Integer.toString(i));
        }

        for (String ss : map.keySet()) {
            if (s.contains(ss)) {
                s = s.replace(ss, map.get(ss));
            }
        }
        System.out.println(s);
        answer = Integer.parseInt(s);
        return answer;
    }
}

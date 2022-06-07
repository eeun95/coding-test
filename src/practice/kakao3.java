package practice;

import java.util.HashMap;

public class kakao3 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        solution(record);
    }

    public static String[] solution(String[] record) {
        String[] answer = {};

        HashMap<String, String> map = new HashMap<>();
        HashMap<Integer, String> result = new HashMap<>();

        for (String s : record) {
            if (s.startsWith("Enter") || s.startsWith("Change")) {
                String id = s.split(" ")[1];
                String nickname = s.split(" ")[2];
                map.put(id, nickname);
            }
        }

        int i=0;
        for (String s : record) {
            String status = "";
            if (s.startsWith("Enter")) {
                status = "님이 들어왔습니다.";
            } else if (s.startsWith("Leave")) {
                status = "님이 나갔습니다.";
            } else {
                continue;
            }
            String id = s.split(" ")[1];
            String nickname = map.get(id);
            result.put(i, nickname + status);
            i++;
        }

        answer = new String[result.size()];
        for (int key : result.keySet()) {
            answer[key] = result.get(key);
        }

        return answer;
    }
}

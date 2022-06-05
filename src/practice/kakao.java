package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class kakao {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k= 2;
        solution(id_list, report, k);

        id_list = new String[]{"ryan","con"};
        report = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};
        k = 3;
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

        HashMap<String, Integer> id = new HashMap<>();
        HashMap<String, Integer> result = new HashMap<>();
        Set<String> reportList = new HashSet<>();

        // set이 중복 제거해주므로 신고자/신고당한자 담음
        for (String r : report) {
            reportList.add(r);
        }

        Iterator<String> iterator = reportList.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            String bad = str.split(" ")[1];

            id.put(bad, id.getOrDefault(bad, 0) + 1);
        }

        for (String s : reportList) {
            String reporter = s.split(" ")[0];
            String bad = s.split(" ")[1];

            if(id.get(bad)>=k) {
                result.put(reporter, result.getOrDefault(reporter, 0) + 1);
            }
        }

        answer = new int[id_list.length];
        int index  =0;
        for (String i : id_list) {
            answer[index] = (result.get(i)!=null) ? result.get(i) : 0;
            index++;
        }

        return answer;
    }
}

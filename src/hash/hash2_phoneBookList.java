package hash;

import java.util.Arrays;
import java.util.HashMap;

public class hash2_phoneBookList {
    public static void main(String[] args) {
        String[] phone1 = {"119", "97674223", "1195524421"};
        String[] phone2 = {"123","456","789"};
        String[] phone3 = {"12","123","1235","567","88"};
        String[] phone4 = {"119", "114", "112", "123223123", "1231231234"};

        if(solution(phone4)) {
            System.out.println("겹치는 번호 없음");
        }
    }

    public static boolean solution(String[] phone_book) {
        /*
        boolean answer = true;

        int p_cnt = phone_book.length;
        Arrays.sort(phone_book);
        for(int i=0; i<p_cnt-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
         */
        boolean answer = true;

        Arrays.sort(phone_book);

        int leng = phone_book[0].length();
        for (int i = 1; i < phone_book.length; i++) {
            if(leng >= phone_book[i].length()) {
                leng = phone_book[i].length();
            }
        }

        //System.out.println(leng);

        HashMap<String, Integer> hm = new HashMap<>();

        for (String ph : phone_book) {
            hm.put(ph.substring(0, leng), hm.getOrDefault(ph.substring(0, leng), 0)+1);
        }

        for (String key : hm.keySet()) {
            //System.out.println(key + " " + hm.get(key));
            if(hm.get(key)>1) {
                answer = false;
            }
        }

        return answer;
    }
}

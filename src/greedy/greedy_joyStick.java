package greedy;

public class greedy_joyStick {
    public static void main(String[] args) {
        greedy_joyStick sol = new greedy_joyStick();

        String name = "JEROEN";     //56
        name = "JAN";               //23
        sol.solution(name);
    }

    public int solution(String name) {
        int answer = 0;

        int ascii = 65;

        int a_middle = 26/2;
        int c_middle = name.length()/2;

        int cursor_cnt = 0;
        int alphabet_cnt = 0;

        String[] names = new String[name.length()];
        for (int i = 0; i < name.length(); i++) {
            char n = name.charAt(i);
            int a =(int) n - ascii;

            if ((a) > a_middle) {
                a = 26 - a;
            }
            alphabet_cnt += a;
            cursor_cnt ++;

            if (a == 0 && c_middle >= i) {
                cursor_cnt--;
            }

            System.out.println(alphabet_cnt+" "+cursor_cnt);
        }
        cursor_cnt--;       // 맨마지막 커서 이동 카운팅 삭제

        answer = alphabet_cnt + cursor_cnt;
        return answer;
    }
}

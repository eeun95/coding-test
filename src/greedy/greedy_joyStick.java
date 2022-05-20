package greedy;

public class greedy_joyStick {
    public static void main(String[] args) {
        greedy_joyStick sol = new greedy_joyStick();

        String name = "JEROEN";     //56
        name = "SAAAAAARRM";               //23
        sol.solution(name);
    }

    public int correctSol(String name) {

        // 맞는 답안 보고 이해

        int answer = 0;
        int length = name.length();

        int index; // 다음 값들을 확인할 때 사용
        int move = length - 1; // 좌우 움직임 수를 체크

        for(int i = 0; i < name.length(); i++){
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i + 1;
            // 연속되는 A 갯수 확인
            while(index < length && name.charAt(index) == 'A'){
                index++;
            }

            // 순서대로 가는 것과, 뒤로 돌아가는 것 중 이동수가 적은 것을 선택
            move = Math.min(move, i * 2 + length - index);
            // 2022년 이전 테스트 케이스만 확인하면 여기까지해도 정답처리가 되기 때문에, 이전 정답들에는 여기까지만 정리되어 있지만,
            // BBBBAAAAAAAB 와 같이, 처음부터 뒷부분을 먼저 입력하는 것이 더 빠른 경우까지 고려하려면 아래의 코드가 필요합니다.
            move = Math.min(move, (length - index) * 2 + i);
        }
        return answer + move;
    }

    public int solution(String name) {

        int answer = 0;
        int ascii = 65;

        int a_middle = 26/2;
        int alphabet_cnt = 0;

        int len = name.length();
        int min_move = len-1;

        for (int i = 0; i < len; i++) {
            char n = name.charAt(i);
            int a =(int) n - ascii;

            if (a > a_middle) {
                a = 26 - a;
            }
            alphabet_cnt += a;

            //좌우: 연속된 A의 등장에 따라 최소 움직임이 달라진다
            int next = i+1;// 현재 다음 위치부터
            //내 다음이 A라면 계속 NEXT++
            while(next<len && name.charAt(next) == 'A')
                next++;

            min_move = Math.min(min_move, i+len-next + i);

        }
        //System.out.println("알파벳 : "+alphabet_cnt+" 커서 : ");

        answer = alphabet_cnt + min_move;
        return answer;
    }
}

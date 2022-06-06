package practice;

public class kakao2 {
    public static void main(String[] args) {
        solution(".T....E.._-*(#ST.");
    }
    public static String solution(String new_id) {
        String answer = "";

        // 1단계 - 모든 대문자를 소문자로 치환
        new_id = new_id.toLowerCase();

        // 2단계 - 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 를 제외한 모든 문자 제거
        String match = "[^a-z^-_.]";
        new_id = new_id.replaceAll(match, "");

        boolean before = false;
        boolean flag = false;
        // 3단계 - 마침표가 두번 이상 연속된 부분을 하나로 치환
        for (int i = 0; i < new_id.length(); i++) {
            String s = new_id.substring(i, i + 1);

            if (i!=0 && s.equals(".")) {
                before = true;
            } else {
                before = false;
            }
            if (before && s.equals(".")) {
                System.out.println(i);
                before = false;
            }

        }

        // 4단계 - 마침표가 처음이나 끝에 위치한다면 제거
        if (new_id.startsWith(".")) {
            new_id = new_id.substring(1);
        }
        if (new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        // 5단계 - 빈 문자열이라면 a대입
        new_id = new_id.replace(" ", "a");

        // 6단계 - 길이가 16자 이상이라면 첫 15개 제외한 모든 문자 제거
        // 제거 후 마침표가 끝에 위치한다면 마침표 제거
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            if (new_id.endsWith(".")) {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        // 7단계 - 길이가 2자 이하라면 마지막 문자를 길이가 3이 될 때까지 반복
        if (new_id.length() <= 2) {
            String last = new_id.substring(new_id.length());
            while (new_id.length() == 3) {
                new_id += last;
            }
        }
        System.out.println(new_id);
        return answer;
    }
}

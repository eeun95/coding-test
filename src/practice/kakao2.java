package practice;

public class kakao2 {
    public static void main(String[] args) {
        solution("TEST");
    }
    public static String solution(String new_id) {
        String answer = "";

        // 1단계 - 모든 대문자를 소문자로 치환
        new_id = new_id.toLowerCase();

        // 2단계 - 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 를 제외한 모든 문자 제거

        // 3단계 - 마침표가 두번 이상 연속된 부분을 하나로 치환

        // 4단계 - 마침표가 처음이나 끝에 위치한다면 제거

        // 5단계 - 빈 문자열이라면 a대입

        // 6단계 - 길이가 16자 이상이라면 첫 15개 제외한 모든 문자 제거
        // 제거 후 마침표가 끝에 위치한다면 마침표 제거

        // 7단계 - 길이가 2자 이하라면 마지막 문자를 길이가 3이 될 때까지 반복
        System.out.println(new_id);
        return answer;
    }
}

package practice;

public class kakao2 {
    public static void main(String[] args) {
        solution("=.=");
    }
    public static String solution(String new_id) {
        String answer = "";

        // 1단계 - 모든 대문자를 소문자로 치환
        new_id = new_id.toLowerCase();
        System.out.println("1: " + new_id);

        // 2단계 - 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 를 제외한 모든 문자 제거
        String match = "[^a-z^0-9^\\-_.]";
        new_id = new_id.replaceAll(match, "");
        new_id = new_id.replace("^", "");
        System.out.println("2: " + new_id);

        // 3단계 - 마침표가 두번 이상 연속된 부분을 하나로 치환
        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }
        System.out.println("3: " + new_id);

        // 4단계 - 마침표가 처음이나 끝에 위치한다면 제거
        if(new_id.length()>0) {
            while (new_id.startsWith(".")) {
                new_id = new_id.substring(1);
            }
            while (new_id.endsWith(".")) {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        System.out.println("4: " + new_id);

        // 5단계 - 빈 문자열이라면 a대입
        if (new_id.length()==0) {
            new_id = "a";
        }
        System.out.println("5: " + new_id);

        // 6단계 - 길이가 16자 이상이라면 첫 15개 제외한 모든 문자 제거
        // 제거 후 마침표가 끝에 위치한다면 마침표 제거
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            if (new_id.endsWith(".")) {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        System.out.println("6: " + new_id);

        // 7단계 - 길이가 2자 이하라면 마지막 문자를 길이가 3이 될 때까지 반복
        if (new_id.length() <= 2) {
            String last = new_id.substring(new_id.length()-1);
            while (new_id.length() < 3) {
                new_id += last;
            }
        }
        System.out.println("7: " + new_id);

        answer = new_id;

        return answer;
    }

    public String solution2(String new_id) {
        String answer = "";
        String temp = new_id.toLowerCase();

        temp = temp.replaceAll("[^-_.a-z0-9]","");
        System.out.println(temp);
        temp = temp.replaceAll("[.]{2,}",".");
        temp = temp.replaceAll("^[.]|[.]$","");
        System.out.println(temp.length());
        if(temp.equals(""))
            temp+="a";
        if(temp.length() >=16){
            temp = temp.substring(0,15);
            temp=temp.replaceAll("^[.]|[.]$","");
        }
        if(temp.length()<=2)
            while(temp.length()<3)
                temp+=temp.charAt(temp.length()-1);

        answer=temp;
        return answer;
    }
}

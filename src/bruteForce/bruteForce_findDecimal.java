package bruteForce;

import java.util.HashSet;
import java.util.Iterator;

public class bruteForce_findDecimal {
    HashSet<Integer> hs = new HashSet<>();
    public static void main(String[] args) {

        bruteForce_findDecimal sol = new bruteForce_findDecimal();

        String numbers = "17";
        System.out.println(sol.solution(numbers));  //3
        System.out.println("================");

        numbers = "011";
        System.out.println(sol.solution(numbers));  //2
        System.out.println("================");

        numbers = "123";
        System.out.println(sol.solution(numbers));
        System.out.println("================");

    }
    public int solution(String numbers) {
        int answer = 0;

        // 모든 조합 구하기
        recursive("", numbers);

        // 소수 갯수 세기
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()) {
            int number = it.next();
            if(isPrime(number)) {
                answer++;
            }
        }

        // 소수 갯수 반환
        return answer;
    }

    public boolean isPrime(int num) {
        // 0과 1은 소수 X
        if (num == 0 || num == 1) {
            return false;
        }

        // 에라토스테네스의 체의 limit을 계산 (루트를 씌운 값)
        int limit = (int) Math.sqrt(num);

        // limit 까지만 배수여부 확인
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    /*
        comb : 여태껏 조합된 수
        others : 남아있는 수
     */
    public void recursive(String comb, String others) {

        // 현재 조합 저장
        if (!comb.equals("")) {
            System.out.println(comb);
            hs.add(Integer.valueOf(comb));
        }

        for (int i = 0; i < others.length(); i++) {
            // 현재 조합+현재 숫자 , 현재 숫자를 뺀 나머지 숫자를 파라미터로 전달
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }

}

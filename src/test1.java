import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*
        1! = 1
        2! = 2X1 = 2
        3! = 3X2X1 = 6
        4! = 4X3X2X1 = 24
        5! = 5X4X3X2X1 = 120
        6! = 6X5X4X3X2X1 = 720
        7! = 7X6X5X4X3X2X1 = 5040
        8! = 8X7X6X5X4X3X2X1 = 40320
        9! = 9X8X7X6X5X4X3X2X1 = 362880
        10! = 10X9X8X7X6X5X4X3X2X1 = 3628800
        11! = 11X10X9X8X7X6X5X4X3X2X1 = 39916800
        12! = 12X11X10X9X8X7X6X5X4X3X2X1 = 479001600
        .
        .
        .
        5의 배수일 때 0 1개
        25의 배수일 때 0 2개
        125의 배수일 때 0 3개
        이런 규칙을 쭈욱 찾을 수 있다
        * */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int zero = 1;
        while(n > Math.pow(5, zero)) {
            count += Math.floor(n / Math.pow(5, zero));
            zero++;
        }
        System.out.println(count);
    }
}

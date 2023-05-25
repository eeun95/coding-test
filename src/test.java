import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        int[] dots = new int[]{1, 5, 8};
        int[] lines = new int[]{1, 3, 4, 6};
        solution(dots, lines);

        dots = new int[]{1, 3, 4, 6, 7, 10};
        lines = new int[]{2, 2, 2, 2};
        solution(dots, lines);
    }
    public static int solution(int[] dots, int[] lines) {
        int answer = 0;

        int[] betweenDots = new int[dots.length - 1];
        for (int i = 0; i < dots.length - 1; i++) {
            betweenDots[i] = dots[i + 1] - dots[i];
        }

        if (Arrays.stream(betweenDots).sum() > Arrays.stream(lines).sum()) {
            return -1;
        } else if(Arrays.stream(betweenDots).sum() == Arrays.stream(lines).sum()) {
            return lines.length;
        }

        return answer;
    }
}

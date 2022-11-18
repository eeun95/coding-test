import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class sol1 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> rotate = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(4);
        a.add(3);
        a.add(5);
        rotate.add(6);
        rotate.add(9);
        rotate.add(12);
        List<Integer> result = new ArrayList<>();

        int max = -1;
        for(int i : a) {
            if(max < i) {
                max = i;
            }
        }

        int count = 0;
        for(int i : rotate) {
            if(a.size() < i) {
                i = i%a.size();
            }

            int idx = 0;
            boolean flag = true;
            for(int v : a.subList(i, a.size())) {
                if(max==v) {
                    count = idx;
                    flag = false;
                    break;
                }
                idx++;
            }
            if(flag) {
                for(int v2 : a.subList(0, i)) {
                    if(max==v2) {
                        count = idx;
                        break;
                    };
                    idx++;
                }
            }
            result.add(count);
        }

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main_2667 {
    static boolean[][] dfs;
    static boolean[][] visit;
    static int cnt,index=0;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.valueOf(br.readLine());
        dfs= new boolean[N+1][N+1];
        visit = new boolean[N+1][N+1];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                boolean b = (s.substring(j, j+1).equals("0")) ? false : true;
                dfs[i][j] = b;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int c = dfs(i,j);
                //System.out.println(c+"======");
                if(c>0) {
                    map.put(index, c);
                    index++;
                }
            }
        }
        System.out.println(map.size());

        List<Integer> keySet = new ArrayList<>(map.keySet());

        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        });


        for (int k : keySet) {
            System.out.println(map.get(k));
        }
    }
    public static int dfs(int dx, int dy) {
        if(!visit[dx][dy]) {
            //System.out.println(dx+" "+dy);
            if(dfs[dx][dy]) {
                //System.out.println(dx+" "+dy);
                cnt++;
                visit[dx][dy] = true;
                //상
                if (dy > 0 && dfs[dx][dy - 1] && !visit[dx][dy - 1]) {
                    //System.out.println("상");
                    dfs(dx, dy - 1);
                }
                //하
                if (dy < N - 1 && dfs[dx][dy + 1] && !visit[dx][dy + 1]) {
                    //System.out.println("하");
                    dfs(dx, dy + 1);
                }
                //좌
                if (dx > 0 && dfs[dx - 1][dy] && !visit[dx - 1][dy]) {
                    //System.out.println("좌");
                    dfs(dx - 1, dy);
                }
                //우
                if (dx < N - 1 && dfs[dx + 1][dy] && !visit[dx + 1][dy]) {
                    //System.out.println("우");
                    dfs(dx + 1, dy);
                }
            } else {
                cnt = 0;
            }
        } else {
            //System.out.println("++++");
            cnt = 0;
        }
        return cnt;
    }
}


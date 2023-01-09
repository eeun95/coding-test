package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main_2941 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("c=");
        list.add("c-");
        list.add("dz=");
        list.add("lj");
        list.add("nj");
        list.add("s=");
        list.add("z=");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;
        for (String s1 : list) {
            if(s.contains(s1)) {
                int i = s.length() - s.replace(s1, "").length();
                count += (i/s1.length());
                //System.out.print(s + " > ");
                s = s.replace(s1, " ");
                //System.out.println(s);
            }
        }
        System.out.println(s.replace(" ", "").length()+count);
    }
}

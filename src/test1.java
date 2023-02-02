
public class test1 {
    public static void main(String[] args) {
//        int[][] fees = {
//                {200,910,93},
//                {400,1600,188},
//                {655, 7300, 281},
//                {0, 15372, 435}
//        };
//        int[][] fees = {
//                {200, 910, 93},
//                {400, 1600, 188},
//                {655, 7300, 281},
//                {0, 15372, 435}
//        };
        int[][] fees = {
                {100, 415, 90},
                {250, 1600, 389},
                {0, 7000, 480}
        };

        int usage = 530;
        solution(fees, usage);
    }

    static public int solution(int[][] fees, int usage) {
        int answer = 0;
        int usageTmp = usage;
        int start =0;
        for (int i = 0; i < fees.length; i++) {
            System.out.println(fees[i][0]+" "+fees[i][1]+" "+fees[i][2]+" "+start);
            int remain = (i==fees.length-1) ? usageTmp : usageTmp - (fees[i][0]-start);
            System.out.println("usageTmp : "+usageTmp+" remain : "+remain);
            if(remain > 0 && i!=fees.length-1) {
                answer += ((fees[i][0] - start) * fees[i][2]);
                System.out.println(">>"+(fees[i][0] - start)+"*"+fees[i][2]+"="+answer);
                usageTmp = remain;
                start = fees[i][0];
            } else {
                answer += (fees[i][1] + (usageTmp * fees[i][2]));
                System.out.println(">>2"+fees[i][1]+"+"+(usageTmp * fees[i][2])+"="+answer);
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}

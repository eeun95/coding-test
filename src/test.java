public class test {
    public static void main(String[] args) {
        System.out.println(numberToString("240044000"));   //2만 4천
        System.out.println(numberToString("240000"));   //24만
        System.out.println(numberToString("2400000"));   //240만
        System.out.println(numberToString("24000000"));   //2400만
        System.out.println(numberToString("200040000"));   //2억 4천
        //System.out.println(numberToString("2400000000"));   //24억
        //System.out.println(numberToString("24000000000"));   //240억
        //System.out.println(numberToString("240000000000"));   //2400백억
        System.out.println(numberToString("684000"));   //68만 4천
    }

    // 회사 깃 계정 연동 테스트
    public static String numberToString(String number) {
        String result = "";
        String[] unit = {"", "천", "만", "억", "조", "경"};
        int len = number.length();
        String[] s = new String[(len %4 ==0) ? len/4 : (len/4)+1];

        if(len < 5) {
            return number+"원";
        }
        int i=0;
        int startIdx = 0;
        int endIdx = (len%4==0) ? startIdx+4 : len%4;
        while(len > 0) {
            String n = number.substring(startIdx, endIdx);
            s[i] = n;
            startIdx = endIdx;
            endIdx = startIdx+4;
            len -= (endIdx - startIdx);
            i++;
        }

        i = 0;
        for (String money : s) {
            int m = Integer.parseInt(money);
            if((s.length-i)!=1) {
                result += (m + unit[(s.length - i)])+" ";
            } else {
                if(m > 0) {
                    result += (m / 1000) + unit[(s.length - i)];
                    result += (m%1000 > 0) ? (m%1000)+"원" : "원";
                }
            }
            i++;
        }

        return result;
    }

}

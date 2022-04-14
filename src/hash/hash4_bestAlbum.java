package hash;

import java.util.*;
class hash4_bestAlbum {
    public static void main(String[] args) {
        int[] answer = solution(new String[]{"classic","classic","classic","pop"}, new int[]{500,150,800,2500});
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        // 고유번호, 장르
        HashMap<Integer, String> genre = new HashMap<Integer, String>();
        // 고유번호, 재생횟수
        HashMap<Integer, Integer> play = new HashMap<Integer, Integer>();
        // 장르, 총 재생횟수
        HashMap<String, Integer> playCnt = new HashMap<String, Integer>();

        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i=0; i<genres.length; i++) {
            genre.put(i, genres[i]);
            play.put(i, plays[i]);
        }

        for (Integer key : genre.keySet()) {
            //System.out.println(key + " " + genre.get(key) + " " + play.get(key));
            playCnt.put(genre.get(key), playCnt.getOrDefault(genre.get(key), 0) + play.get(key));
        }

        // Map.Entry 의 내장함수 사용하여 value값 기준 정렬 (오름차순)
        // 내가 필요한건 내림차순
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(playCnt.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        for(Map.Entry<String, Integer> entry : entryList){
            //System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // 내림차순 정렬,, 소스 분석은 좀 나중에
        List<Integer> playKeySet = new ArrayList<>(play.keySet());
        Collections.sort(playKeySet, (value1, value2) -> (play.get(value2).compareTo(play.get(value1))));

        List<String> playCntKeySet = new ArrayList<>(playCnt.keySet());
        Collections.sort(playCntKeySet, (value1, value2) -> (playCnt.get(value2).compareTo(playCnt.get(value1))));

//        System.out.println(playCntKeySet);
//        System.out.println(playKeySet);

        int max = 2;
        int cnt = 0;
        int i=0;

        for (String gen : playCntKeySet) {
            cnt = 0;
            for (int id : playKeySet) {
                String g = genre.get(id);
                //System.out.println(g + " " + id + " " + play.get(id)+" "+cnt);
                if (gen.equals(g) && max > cnt) {
                    //System.out.println(cnt + " " + gen + " " + id + " " + play.get(id));
                    result.put(i, id);
                    i++;
                    cnt++;
                } else {
                }

            }
        }

        answer = new int[result.size()];
        for (int idx : result.keySet()) {
            answer[idx] = result.get(idx);
        }

        return answer;
    }
}
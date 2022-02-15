import java.util.*;
class hash4 {
    public static void main(String[] args) {

    }
    public int[] hash4(String[] genres, int[] plays) {
        int[] answer = {};

        int play_cnt = 0;

        // 고유번호, 장르
        HashMap<Integer, String> genre = new HashMap<Integer, String>();
        // 고유번호, 재생횟수
        HashMap<Integer, Integer> play = new HashMap<Integer, Integer>();
        // 장르, 총 재생횟수
        HashMap<String, Integer> playCnt = new HashMap<String, Integer>();
        for(int i=0; i<genres.length; i++) {
            genre.put(i, genres[i]);
            play.put(i, plays[i]);

            if(playCnt.containsKey(genres[i])) {
                play_cnt = playCnt.get(genres[i])+plays[i];
            } else {
                play_cnt = plays[i];
            }
            playCnt.put(genres[i], play_cnt);
        }
        List<Integer> playKeySet = new ArrayList<>(play.keySet());
        Collections.sort(playKeySet, (value1, value2) -> (play.get(value2).compareTo(play.get(value1))));

        List<String> playCntKeySet = new ArrayList<>(playCnt.keySet());
        Collections.sort(playCntKeySet, (value1, value2) -> (playCnt.get(value2).compareTo(playCnt.get(value1))));

        int index = 0;
        answer = new int[playCnt.size()*2];
        for( String key : playCntKeySet ){
            int cnt = 0;
            for(Integer i : playKeySet) {
                if(key.equals(genre.get(i))) {
                    if(cnt>1) {
                        break;
                    }
                    System.out.println(index+" "+i);
                    answer[index] = i;
                    cnt++;
                    index++;
                }
            }

        }

        //System.out.println(playCntKeySet);
        //System.out.println(playKeySet);
        return answer;
    }
}
package a202401;

import java.util.*;

public class Ps240103_1 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,9);
        map.put(1,11);
        map.put(2,3);

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println(list);
        System.out.println(list.get(0).getKey());

    }

    class Solution {
        public int[][] sortTheStudents(int[][] score, int k) {
            Map<Integer,Integer> map = new HashMap<>(); // 1. {학생 : k번째 시험점수}

            for(int i = 0; i < score.length; i++) {
                map.put(i, score[i][k]);
            }

            // 2. map -> list
            List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());

            Collections.sort(entryList, new Comparator<>() { // 3. value를 기준으로 내림차순 정렬
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });

            int[][] answer = new int[score.length][score[0].length]; // 4. 제출할 배열 초기화

            for(int i = 0; i < entryList.size(); i++) { //  5. 섞인 우선순위대로 담기.
                answer[i] = score[entryList.get(i).getKey()];
            }

            return answer;
        }
    }
}

package a202401;

import java.util.*;

public class Ps240119_1 {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,5,5,5,2,2,7};
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length / 2;
        int sum = 0;
        int cnt = 0;



        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map.entrySet());

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));


        for(Map.Entry<Integer,Integer> entry : list) {
            if(sum >= n) break;

            sum += entry.getValue();
            cnt++;
        }

        System.out.println(cnt);


    }

    class Solution {
        public int minSetSize(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
            int sum = arr.length / 2;
            int answer = 0;

            for(int i : arr) { // 1.
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            for(Map.Entry<Integer,Integer> entry : map.entrySet()) { // 2.
                queue.add(entry.getValue());
            }

            while(sum >= 0) {
                sum -= queue.poll();
                answer++; // 3.
            }

            return answer;
        }
    }
}

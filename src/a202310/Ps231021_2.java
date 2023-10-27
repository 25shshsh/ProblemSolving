package a202310;

import java.util.HashMap;
import java.util.Map;

public class Ps231021_2 {

    public static void main(String[] args) {
        int[] nums = {30000, 500, 100, 30000, 100, 30000, 100};

        Map<Integer, Integer> map = new HashMap<>(); // {}

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1); // 있다면 i+1 없다면 0+1 value에 추가. (카운트)
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                //entry.getKey();
            }
        }


    }


    class Solution {
        public int singleNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>(); // {Value, Count}

            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1); // 있다면 i+1 없다면 0+1 value에 추가 (카운트)
            }

            for(Map.Entry<Integer, Integer> entry : map.entrySet()) { // value로 key 찾기
                if(entry.getValue() == 1) {
                    return entry.getKey();
                }
            }

            return -1;
        }
    }
}

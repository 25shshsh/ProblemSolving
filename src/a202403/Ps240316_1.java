package a202403;

import java.util.HashMap;

public class Ps240316_1 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,0,0,1,0};
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLength = 0;
        int count = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length;i++) {
            count += nums[i] == 1? 1 : -1;

            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count,i);
            }
        }

    }

    class Solution {
        public int findMaxLength(int[] nums) {
            int maxLength = 0;
            int cnt = 0;
            HashMap<Integer,Integer> map = new HashMap<>();

            map.put(0, -1);

            for (int i = 0; i < nums.length; i++) {
                cnt += nums[i] == 1? 1 : -1;

                if (map.containsKey(cnt)) {
                    maxLength = Math.max(maxLength, i - map.get(cnt));
                }
                else {
                    map.put(cnt, i);
                }
            }

            return maxLength;
        }
    }
}

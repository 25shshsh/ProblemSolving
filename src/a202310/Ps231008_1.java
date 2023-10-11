package a202310;

import java.util.*;

public class Ps231008_1 {

    public static void main(String[] args) {
        int[] nums = {1,1,1};

        Map<Integer, Integer> map = new HashMap<>(); // <values, count>
        int cnt = 0;

        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        Object[] arr = map.values().toArray();

        for (Object object : arr) {
            int i = (int) object;
            if(i > 1) {
                cnt += (i * (i-1)) / 2;
            }
        }
        System.out.println(cnt);
        



    }

    /*Input: nums = [1,2,3,1,1,3]
    Output: 4*/

    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int cnt = 0;
            return helper(nums, cnt);
        }

        private int helper(int[] nums, int cnt) {
            Map<Integer, Integer> map = new HashMap<>(); // <values, count>

            for(int i = 0; i < nums.length; i++) {
                if(!map.containsKey(nums[i])) {
                    map.put(nums[i], 1);
                } else {
                    map.put(nums[i], map.get(nums[i]) + 1);
                }
            }

            Object[] arr = map.values().toArray();

            for (Object object : arr) {
                int i = (int) object;
                if(i > 1) {
                    cnt += (i * (i-1)) / 2;
                }
            }

            return cnt;
        }

    }


}

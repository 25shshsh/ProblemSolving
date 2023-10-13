package a202310;

import java.util.*;

public class Ps231012_1 {

    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Arrays.sort(nums);

        int length = nums.length;
        int min = nums[0];
        int max = nums[length-1];
        int cnt = 2; // min, max의 개수 기본 2, 중복된 min, max마다 +1

        for(int i = 1; i < length; i++) {
           if(min == nums[i] || max == nums[i]) {
               cnt++;
           }
        }

        System.out.println(length-cnt);


    }

    class Solution {
        public int countElements(int[] nums) {
            Arrays.sort(nums);

            int length = nums.length;
            int min = nums[0];
            int max = nums[length-1];
            int cnt = 2; // min, max의 개수 기본 2, 중복된 min, max마다 +1

            for(int i = 1; i < length - 1; i++) {
                if(min == nums[i] || max == nums[i]) {
                    cnt++;
                }
            }

            return length == 1? 0 : length - cnt;  // 1 <= nums.length <= 100
        }
    }


}

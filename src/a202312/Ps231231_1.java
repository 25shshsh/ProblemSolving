package a202312;

import java.util.Arrays;

public class Ps231231_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int minPairSum(int[] nums) {
            int answer = 0;
            int ptr1 = 0;
            int ptr2 = nums.length-1;

            Arrays.sort(nums);

            while(true) {
                if(ptr1 > ptr2) break; // nums.length is even.
                answer = Math.max(answer, nums[ptr1++] + nums[ptr2--]);
            }

            return answer;
        }
    }
}

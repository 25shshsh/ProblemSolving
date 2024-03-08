package a202403;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Ps240302_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length; // 1
            int[] answer = new int[n];
            int ptr1 = 0;
            int ptr2 = n-1;

            for(int i = 0; i < n; i++) { // 2
                if(Math.abs(nums[ptr1]) > Math.abs(nums[ptr2])) {
                    answer[i] = (int) Math.pow(nums[ptr1], 2);
                    ptr1++;
                }
                else {
                    answer[i] = (int) Math.pow(nums[ptr2], 2);
                    ptr2--;
                }
            }

            return answer;
        }
    }
}

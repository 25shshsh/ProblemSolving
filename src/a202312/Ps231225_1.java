package a202312;

import java.util.Arrays;

public class Ps231225_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] pivotArray(int[] nums, int pivot) {
            int idx = 0;
            int[] answer = new int[nums.length]; // 1

            for(int num : nums) { // 2
                if(num < pivot) answer[idx++] = num;
            }
            for(int num : nums) { // 3
                if(num == pivot) answer[idx++] = num;
            }
            for(int num : nums) { // 4
                if(num > pivot) answer[idx++] = num;
            }

            return answer;
        }
    }
}

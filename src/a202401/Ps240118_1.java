package a202401;

import java.util.Arrays;

public class Ps240118_1 {
    public static void main(String[] args) {
        int[] nums = {2,2,4,5};
        int k = 0;

        Arrays.sort(nums);

        int partition = 0;
        int ptr1 = 0;
        int ptr2 = 0;

        while(ptr2 < nums.length) {
            if(nums[ptr2] - nums[ptr1] > k) {
                ptr2--;
                ptr1 = ptr2;
                partition++;
            }

            ptr2++;
        }

        System.out.println(partition);
    }

    class Solution {
        public int partitionArray(int[] nums, int k) {
            int answer = 1; // 서브시퀀스는 기본 1개.
            int ptr1 = 0;
            int ptr2 = 0;

            Arrays.sort(nums);

            while(true) {
                if(ptr2 == nums.length) break;

                if(nums[ptr2] - nums[ptr1] > k) { // 1, 2
                    ptr1 = ptr2;
                    answer++;
                }

                ptr2++;
            }

            return answer; // 3
        }
    }
}

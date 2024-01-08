package a202312;

import java.util.*;

public class Ps231223_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public void sortColors(int[] nums) {
            int ptr1 = 0;
            int ptr2 = 0;
            int n = nums.length-1;

            while(ptr2 <= n) {
                if(nums[ptr2] == 0) swap(nums, ptr1++, ptr2++); // 1
                else if(nums[ptr2] == 1) ptr2++; // 2
                else swap(nums, ptr2, n--); // 3
            }
        }

        private void swap(int[] array, int firstIdx, int secondIdx) {
            int tmp = array[firstIdx];
            array[firstIdx] = array[secondIdx];
            array[secondIdx] = tmp;
        }

    }
}

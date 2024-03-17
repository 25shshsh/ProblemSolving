package a202403;

import java.util.Arrays;

public class Ps240314_1 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;


        int totalCount = 0;
        int sum = 0;
        int prefixSum[] = new int[nums.length + 1];
        prefixSum[0] = 1;

        for (int num : nums) {
            sum += num;
            if (sum >= goal) {
                totalCount += prefixSum[sum - goal];
            }

            prefixSum[sum]++;
        }
        System.out.println(Arrays.toString(prefixSum));
        System.out.println(totalCount);




    }


    class Solution {
        public int numSubarraysWithSum(int[] nums, int goal) {
            int totalCount = 0;
            int sum = 0;
            int prefixSum[] = new int[nums.length + 1];
            prefixSum[0] = 1;

            for (int num : nums) {
                sum += num;
                if (sum >= goal) {
                    totalCount += prefixSum[sum - goal];
                }
                prefixSum[sum]++;
            }

            return totalCount;
        }
    }
}

package a202401;

import java.util.*;

public class Ps240105_1 {
    public static void main(String[] args) {

    }

    /*Input: nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5]
    Output: [true,false,true]*/

    class Solution {
        public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
            List<Boolean> answer = new ArrayList<>();

            for(int i = 0; i < l.length; i++ ) {
                int[] temp = new int[r[i] - l[i] + 1]; // 1
                int ptr = 0;

                for(int j = l[i]; j <= r[i];  j++ ) { // 2
                    temp[ptr++] = nums[j];
                }

                Arrays.sort(temp); // 3
                answer.add(helper(temp)); // 5
            }

            return answer;
        }

        private boolean helper (int[] temp) { // 4
            if(temp.length == 2) return true;

            int sub = temp[1] - temp[0];

            for(int i = 2; i < temp.length; i++) {
                if(temp[i] != temp[i-1] + sub) return false;
            }

            return true;
        }

    }
}

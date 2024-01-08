package a202401;

import java.util.*;

public class Ps240102_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public List<List<Integer>> findMatrix(int[] nums) {
            List<List<Integer>> answer = new ArrayList<>();
            boolean[] flags = new boolean[nums.length]; // 1

            while(!allFlagsTrue(flags)) {
                List<Integer> temp = new ArrayList<>();

                for (int i = 0; i < nums.length; i++) {
                    if (!temp.contains(nums[i]) && !flags[i]) { // 2
                        temp.add(nums[i]);
                        flags[i] = true;
                    }
                }
                answer.add(temp); // 3
            }

            return answer;
        }

        private boolean allFlagsTrue(boolean[] flags) { // 4
            for (boolean flag : flags) {
                if(!flag) return false;
            }
            return true;
        }
    }


}

package a202403;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ps240318_1 {

    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();

            for(int i = 0; i < nums.length; i++) {
                if(set.contains(nums[i])) return true;
                set.add(nums[i]);
            }

            return false;
        }
    }
}

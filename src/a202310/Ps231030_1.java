package a202310;

import java.util.*;

public class Ps231030_1 {

    public static void main(String[] args) {

    }

    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> list = new ArrayList<Integer>();
            int maxInt = -1;

            for(int num : nums) {
                maxInt = Math.max(maxInt, num);
            }

            int[] arr = new int[maxInt+1]; // {0,0,0, ... ,0}

            for(int num : nums) {
                if(arr[num] != 0) list.add(num);
                else arr[num] += 1;
            }

            return list;
        }
    }


}

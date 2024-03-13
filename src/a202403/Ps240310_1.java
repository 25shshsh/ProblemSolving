package a202403;

import java.util.*;

public class Ps240310_1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] arr = {1,2,3,4,5};

        for(int num : arr){
            set.add(num);
        }


    }

    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for(int num : nums1) { // 1
                set1.add(num);
            }
            for(int num : nums2) { // 2
                if(set1.contains(num)) set2.add(num);
            }

            int[] answer = new int[set2.size()]; // 이하 3
            int i = 0;

            for(Integer value : set2) {
                answer[i++] = value;
            }

            return answer;
        }
    }
}

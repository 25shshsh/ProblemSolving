package a202310;

import java.util.HashSet;
import java.util.Set;

public class Ps231016_1 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        while (true) {
            System.out.println("0");
            if (!set.add(5)) {
                System.out.println(set.size());
                break;
            }
        }
        System.out.println(set.contains(5));

    }

    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Set<Integer> set = new HashSet<>();
            int i = 0;

            if (nums == null || nums.length < 2 || k == 0) return false; // basecase 종료조건

            for (int j = 0; j < nums.length; j++) {

                if (!set.add(nums[j])) {
                    return true;
                }

                if (set.size() == k + 1) { // 만약 k = 2일때 집합사이즈는 3까지 허용(0,1,2) 현재 j = k
                    set.remove(nums[i++]);
                }
            }

            return false;
        }
    }


}


/*    class Solution { // 무차별 대입(9.12%, 94.83%)
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            int ptr1 = nums.length - 1;
            int ptr2 = ptr1 - 1;


            while(ptr2 >= 0 && ptr1 - ptr2 <= k) {
                if(nums[ptr1] == nums[ptr2]) return true;
                ptr2--;

                if(ptr1 - ptr2 > k) {
                    ptr1--;
                    ptr2 = ptr1 - 1;
                }
            }

            return false;
        }
    }*/




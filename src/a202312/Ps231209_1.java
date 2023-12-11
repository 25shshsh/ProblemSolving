package a202312;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ps231209_1 {
    public static void main(String[] args) {

        String s = "101";
        String s2 = "0";
        System.out.println(Integer.parseInt(s,2));
        System.out.println("0".repeat(5) +"101"); // 문자열 반복 repeat
    }

    // https://leetcode.com/problems/find-unique-binary-string

    class Solution {
        public String findDifferentBinaryString(String[] nums) {
            Set<Integer> set = new HashSet<>();
            int n = nums.length;
            int temp = (int) Math.pow(2, n) - 1; // 1

            for (int i = 0; i < n; i++) {
                set.add(Integer.parseInt(nums[i], 2)); // 2
            }

            while(set.contains(temp)) { // 3
                temp--;
            }

            StringBuilder answer = new StringBuilder(Integer.toBinaryString(temp)); // 4

            int m = n - answer.length(); // 5
            if(m > 0) return "0".repeat(m) + answer.toString();
            return answer.toString();
        }
    }

}

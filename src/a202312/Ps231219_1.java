package a202312;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ps231219_1 {

    public static void main(String[] args) {


    }

    class Solution {
        public int getCommon(int[] nums1, int[] nums2) {
            int ptr1 = 0;
            int ptr2 = 0;

            while(ptr1 < nums1.length && ptr2 < nums2.length) {
                int num1 = nums1[ptr1];
                int num2 = nums2[ptr2];

                if(num1 > num2) ptr2++;
                else if(num1 < num2) ptr1++;
                else return num1;
            }

            return -1;
        }
    }
}

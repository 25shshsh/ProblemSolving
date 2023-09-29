package a202309;

import java.util.Stack;

public class Ps230929_1 {

    public static void main(String[] args) {
        String haystack = "abc", needle = "bc";

        for(int i = 0; i + needle.length() <= haystack.length(); i++) {

            if(haystack.substring(i, i + needle.length()).equals(needle)) {
                System.out.println(i);
            }

        }





    }

    class Solution {
        public int strStr(String haystack, String needle) {

            for (int i = 0; i + needle.length() <= haystack.length(); i++) {

                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }

            }
            return -1;

        }

    }
}

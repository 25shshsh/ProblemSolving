package a202312;

import java.util.Arrays;

public class Ps231207_1 {

    public static void main(String[] args) {
        // CharSequence와 String은 무슨차이?
        String s1 = "iloveleetcode";
        String s2 = "alove";
        String[] words = {"i", "love", "leetcode", "apples"};
        System.out.println(String.join("", words));


    }

    class Solution {
        public boolean isPrefixString(String s, String[] words) {
            StringBuilder stringBuilder = new StringBuilder();

            for(int i = 0; i <words.length; i++) {
                stringBuilder.append(words[i]);
                if(s.equals(stringBuilder.toString())) return true;
            }

            return false;
        }
    }
}

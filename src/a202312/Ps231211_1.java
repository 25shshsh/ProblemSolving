package a202312;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ps231211_1 {
    public static void main(String[] args) {
        System.out.println((int)'a');
        System.out.println((int)'z');
        // 97 ~ 122
        System.out.println(1 + 96);
        System.out.println(26 + 96);
    }
    // https://leetcode.com/problems/find-and-replace-pattern/
    // Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
    // Output: ["mee","aqq"]

    class Solution {
        public List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> answer = new ArrayList<>();

            for (String word : words) {
                if(matchPattern(word, pattern)) answer.add(word);
            }

            return answer;
    }

        private boolean matchPattern (String word, String pattern) {
            if(word.length() != pattern.length()) return false;

            Map<Character, Character> map = new HashMap<>(); // 접근방법 0
            StringBuilder stringBuilder = new StringBuilder();

            for(int i = 0; i < word.length(); i++) {
                if(!map.containsValue(pattern.charAt(i))) { // 접근방법 1
                    map.put(word.charAt(i), pattern.charAt(i));
                } else return false;
            }

            for(int i = 0; i < word.length(); i++) {
                stringBuilder.append(map.get(word.charAt(i))); //접근방법 3
            }

            return stringBuilder.toString().equals(pattern); //접근방법 3
        }
    }

}

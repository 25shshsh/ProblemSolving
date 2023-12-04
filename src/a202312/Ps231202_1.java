package a202312;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
public class Ps231202_1 {
    public static void main(String[] args) {
        StringBuilder keyWord = new StringBuilder("atach");
        String word = "hat";

        System.out.println(keyWord.indexOf(word.charAt(0)+"")); // 1 없다면 -1
        keyWord.deleteCharAt(keyWord.indexOf(word.charAt(0)+""));


        System.out.println(keyWord); // "ht"

    }
    // Input: words = ["cat","bt","hat","tree"], chars = "atach"
    class Solution {
        public int countCharacters(String[] words, String chars) {
            int cnt = 0;

            for(int i = 0; i < words.length; i++) {
                StringBuilder keyWord = new StringBuilder(chars);
                // words[i]가 keyWord의 부분집합이라면?
                if(matchingWords(words[i], keyWord)) cnt += words[i].length();
            }

            return cnt;
        }

        private boolean matchingWords(String word, StringBuilder keyWord) {
            for(int j = 0; j < word.length(); j++) {
                int keyWordIdx = keyWord.indexOf(word.charAt(j)+"");

                if(keyWordIdx != -1) {
                    keyWord.deleteCharAt(keyWordIdx); // 공통된 문자열은 소거한다.
                } else return false; // keyWord에 속하지않는 word의 값이 존재한다면 false
            }

            return true;
        }
    }
}

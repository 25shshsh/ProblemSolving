package a202312;

import java.util.ArrayList;
import java.util.List;

public class Ps231211_1 {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/find-and-replace-pattern/
    // Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
    // Output: ["mee","aqq"]

    class Solution {
        public List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> answer = new ArrayList<>();

            for(int i = 0; i < words.length; i++) {
                if(words[i].length() == pattern.length()) {
                    StringBuilder stringBuilder = new StringBuilder(words[i]);

                    for(int j = 0; j < stringBuilder.length(); j++) {

                        stringBuilder.toString()
                                .replace(stringBuilder.charAt(j), pattern.charAt(j));
                    }

                    if(stringBuilder.toString().equals(pattern)) answer.add(words[i]);
                }
            }

            return answer;
        }
    }

    // abba(pattern) caac(words[i]) 비교 >> abba aaaa words[i]의 c를 a로 전부 치환.
    // abba aaaa >> abba abba words[i]의 a를 전부 b로 치환.
    // (c -> a) (a-> b)로 각각 모든 문자열을 치환하는 키셋이 필요함
    // >> key c를 입력시 value a가 나오게! 자고일어나서 마무리합시다.
}

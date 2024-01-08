package a202312;

public class Ps231227_1 {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "bde";

        System.out.println(s.contains(t));

        t.length();

    }

    class Solution {
        public int appendCharacters(String s, String t) {
            int answer = t.length();
            int ptr = 0;

            for(char ch : s.toCharArray()) {
                if(ptr == t.length()) break;

                if(ch == t.charAt(ptr)) {
                    ptr++;
                    answer--;
                }
            }

            return answer;
        }
    }
}

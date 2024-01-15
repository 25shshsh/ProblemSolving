package a202401;


public class Ps240115_1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("((()))");
        String s = "()))((";

        //s = s.substring(0,1) + s.substring(3); 1 2 제거
        s = s.substring(-1, 0);
        System.out.println(s);

    }

    class Solution {
        public int minAddToMakeValid(String s) {
            StringBuilder stringBuilder = new StringBuilder(s);

            for (int i = 0; i+1 < stringBuilder.length(); i++) { // 1
                if (stringBuilder.charAt(i) == '(' && stringBuilder.charAt(i+1) == ')') {
                    stringBuilder.delete(i, i+2);
                    i = Math.max(i-2, -1); // 1-1.
                }
            }

            return stringBuilder.length(); // 2/
        }
    }

    class Solution2 {
        public int minAddToMakeValid(String s) {

            for (int i = 0; i+1 < s.length(); i++) {
                if (s.charAt(i) == '(' && s.charAt(i+1) == ')') {
                    s = i == 0 ? s.substring(2) : s.substring(0, i) + s.substring(i+2);
                    i = Math.max(i-2, -1);
                }
            }

            return s.length();
        }
    }
}

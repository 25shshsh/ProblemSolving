package a202312;

public class Ps231208_1 {
    public static void main(String[] args) {
        String s = "abcde";
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.deleteCharAt(0);
        System.out.println(s);
    }
// https://leetcode.com/problems/rotate-string
    class Solution {
        public boolean rotateString(String s, String goal) {
            StringBuilder stringBuilder = new StringBuilder(s); // 1

            for(int i = 0; i < s.length(); i++) {
                if(stringBuilder.toString().equals(goal)) return true; // 4
                stringBuilder.deleteCharAt(0); // 2
                stringBuilder.append(s.charAt(i)); // 3
            }

            return false;
        }
    }
}

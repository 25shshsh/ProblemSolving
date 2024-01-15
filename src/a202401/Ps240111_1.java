package a202401;

public class Ps240111_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean validPalindrome(String s) {
            int ptr1 = 0;
            int ptr2 = s.length() - 1;

            while (ptr1 <= ptr2) {
                if (s.charAt(ptr1) != s.charAt(ptr2)) { // 1
                    return isPalindrome(s, ptr1) || isPalindrome(s, ptr2); // 2
                }
                ptr1++;
                ptr2--;
            }

            return true;
        }

        private boolean isPalindrome(String s, int deleteCharIdx) { // 3
            int ptr1 = 0;
            int ptr2 = s.length() - 1;

            while (ptr1 <= ptr2) {
                if (ptr1 == deleteCharIdx) ptr1++; // *
                else if (ptr2 == deleteCharIdx) ptr2--;

                if (s.charAt(ptr1) != s.charAt(ptr2)) return false;
                ptr1++;
                ptr2--;
            }

            return true;
        }
    }


}



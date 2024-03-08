package a202403;

public class Ps240305_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int minimumLength(String s) {
            int ptr1 = 0, ptr2 = s.length()-1;

            while(ptr1 < ptr2 && s.charAt(ptr1) == s.charAt(ptr2)) {
                char currChar = s.charAt(ptr1);

                while(s.charAt(ptr1) == currChar && ptr1 < ptr2) {
                    ptr1++;
                }
                while(s.charAt(ptr2) == currChar && ptr1 <= ptr2) {
                    ptr2--;
                }
            }


            return ptr2-ptr1+1;
        }
    }
}

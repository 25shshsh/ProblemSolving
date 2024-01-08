package a202312;

public class Ps231221_1 {
    public static void main(String[] args) {

        int n = 11; // 102


        int base = 3;
        int ptr1 = 0;
        int ptr2 = n;

        while(n > 0) {
            ptr1 = (ptr1 * base) + (n % base);
            n /= base;
        }

    }

    class Solution {
        public boolean isStrictlyPalindromic(int n) {

            for(int i = 2; i < n-1; i++) {
                if(!isPalindromic(n,i)) return false;
            }

            return true;
        }

        private boolean isPalindromic (int n, int base) {
            int ptr1 = 0;
            int ptr2 = n;

            while(n > 0) {
                ptr1 = (ptr1 * base) + (n % base);
                n /= base;
            }

            return ptr1 == ptr2;
        }
    }
}

package a202312;

public class Ps231220_1 {
    public static void main(String[] args) {
        // 1 ~ 12
        int ptr1 = 1;
        int ptr2 = 2;
        int cnt = 0;


        while(true) {
            ptr1 += 1;
            ptr2 += 2;
            cnt++;

            System.out.println(ptr1+", "+ptr2+", "+cnt);

            if(ptr1 == ptr2) break;

            if(ptr1 == 12) ptr1 = 1;
            if(ptr2 == 12) ptr2 = 2;
        }

    }

    class Solution {
        public boolean isHappy(int n) {
            if(happyNumberProcess(n) == 1) return true;

            int ptr1 = n;
            int ptr2 = happyNumberProcess(n);

            while (ptr1 != ptr2) { // 1. is it a loop?
                ptr1 = happyNumberProcess(ptr1);
                ptr2 = happyNumberProcess(happyNumberProcess(ptr2));
            }

            return ptr2 == 1; // 2.
        }

        private int happyNumberProcess (int n) { // happy number process
            int answer = 0;

            while(n > 0) {
                answer += (n%10) * (n%10);
                n /= 10;
            }

            return answer;
        }
    }
}

package a202312;

import java.util.Arrays;

public class Ps231215_1 {

    public static void main(String[] args) {

    }

    class Solution {
        public boolean checkIfCanBreak(String s1, String s2) {
            char[] arrA = s1.toCharArray();
            char[] arrB = s2.toCharArray();
            Arrays.sort(arrA);
            Arrays.sort(arrB);
            int cntA = 0;
            int cntB = 0;
            int n = s1.length();

            for (int i = 0; i < n; i++) {
                if (arrA[i] >= arrB[i]) cntA++;
                if (arrA[i] <= arrB[i]) cntB++;
            }

            // 둘 중 한쪽이 모두 같거나 큰 경우가 존재할때 true
            return cntA == n || cntB == n;
        }
    }



}
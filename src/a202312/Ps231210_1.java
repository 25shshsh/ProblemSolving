package a202312;

import java.util.Stack;

public class Ps231210_1 {
    public static void main(String[] args) {
        String s = "[[[]]]][][]][[]]][[[";
        int cnt = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ']') cnt++;
            else cnt--;
            System.out.print(cnt+" ");
        }

    }

    class Solution {
        public int minSwaps(String s) {
            int cnt = 0;
            int bracketCnt = 0;

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ']') cnt++; // 1
                else cnt--;

                bracketCnt = Math.max(bracketCnt, cnt); // 2
            }

            return bracketCnt % 2 == 1? bracketCnt/2+1 : bracketCnt/2; // 3. return the swap count
        }
    }

}

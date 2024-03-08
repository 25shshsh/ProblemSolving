package a202403;

import java.util.Arrays;

public class Ps240304_1 {
    public static void main(String[] args) {

    }


    class Solution {
        public int bagOfTokensScore(int[] tokens, int power) {
            Arrays.sort(tokens); // 1

            int currScore = 0;
            int maxScore = 0;
            int ptr1 = 0;
            int ptr2 = tokens.length-1;

            while(ptr1 <= ptr2) { // 2, 3
                if(power >= tokens[ptr1]) { // face-up
                    power -= tokens[ptr1];
                    currScore++;
                    ptr1++;
                    maxScore = Math.max(maxScore, currScore);
                }
                else if(currScore > 0) { // face-down
                    power += tokens[ptr2];
                    currScore--;
                    ptr2--;
                }
                else break; // can not do it face-up, face-down
            }

            return maxScore;
        }
    }


}

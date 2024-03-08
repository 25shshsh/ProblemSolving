package a202403;

import java.util.Arrays;
import java.util.Collections;

public class Ps240308_1 {

    public static void main(String[] args) {

    }

    class Solution {
        public int maxFrequencyElements(int[] nums) {
            int[] countArray = new int[101]; // 1

            for(int num : nums) { // 2
                countArray[num]++;
            }

            Arrays.sort(countArray); // 3

            int maxFrequency = countArray[100];
            int count = 1;

            for(int i = 99; i >= 0; i--) { //4
                if(maxFrequency == countArray[i]) count++;
                else break;
            }

            return count * maxFrequency;
        }
    }
}

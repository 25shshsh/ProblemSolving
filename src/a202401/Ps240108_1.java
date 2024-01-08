package a202401;

import java.util.Arrays;

public class Ps240108_1 {
    public static void main(String[] args) {

    }
        // cold, warm, hot 주어지는 인덱스는 3개.
    class Solution {
        public int fillCups(int[] amount) {
            int answer = 0;
            Arrays.sort(amount);

            if(amount[0] == 0) return Math.max(amount[1], amount[2]);

            while(amount[0] != 0) { // 1
                amount[0]--;
                amount[2]--;
                answer++;

                if(amount[1] > amount[2]) { // 2
                    int temp = amount[2];
                    amount[2] = amount[1];
                    amount[1] = temp;
                }
            }

            answer += amount[2]; // 1-1
            return answer;
        }
    }
}

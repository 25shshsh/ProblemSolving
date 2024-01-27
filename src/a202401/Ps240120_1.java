package a202401;

import java.util.Arrays;

public class Ps240120_1 {
    public static void main(String[] args) {

        int[] costs = {7,3,3,6,6,6,10,5,9,2};
        int coins = 56;

        int answer = 0;
        int ptr = 0;

        Arrays.sort(costs);
        System.out.println(Arrays.toString(costs));




        System.out.println(coins);

    }

    class Solution {
        public int maxIceCream(int[] costs, int coins) {
            int answer = 0;

            Arrays.sort(costs); // 1

            for(int cost : costs) {
                coins -= cost;
                if(coins < 0) return answer; // 2
                else answer++;
            }

            return answer;
        }
    }
}

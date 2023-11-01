package a202310;

public class Ps231031_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int maximumWealth(int[][] accounts) {
            int max = 0;

            for(int[] x : accounts) {
                int sum = 0;
                for(int y : x) {
                    sum += y;
                }
                max = Math.max(sum, max);
            }

            return max;
        }
    }


}

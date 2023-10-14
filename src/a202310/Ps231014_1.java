package a202310;

public class Ps231014_1 {

    public static void main(String[] args) {

    }

    class Solution {
        public int minCostToMoveChips(int[] position) {
            int odd = 0;
            int even = 0;

            for(int value : position) { // 1
                if(value % 2 == 1) {
                    odd++;
                } else {
                    even++;
                }
            }

            return odd >= even ? even : odd; // 2
        }
    }


}

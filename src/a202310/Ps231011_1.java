package a202310;

public class Ps231011_1 {

    public static void main(String[] args) {

    }

    class Solution {
        public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

            int n = 0; // 1

            for(int i = 0; i < k; i++) { // 2
                if(numOnes > 0) {
                    n += 1;
                    numOnes--;
                    continue;
                }
                if(numZeros > 0) {
                    numZeros--;
                    continue;
                }
                if(numNegOnes > 0) {
                    n -= 1;
                    numNegOnes--;
                    continue;
                }

            }


            return n; // 3
        }
    }
}

package a202310;

public class Ps231017_1 {

    public static void main(String[] args) {

    }

    class Solution {
        public int passThePillow(int n, int time) {

            int quotient = time / (n-1);
            int remainder = time % (n-1);

            if(quotient % 2 == 1) {
                return n - remainder;
            }
            return 1 + remainder;
        }
    }


}

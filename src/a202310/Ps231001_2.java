package a202310;

public class Ps231001_2 {

    public static void main(String[] args) {

        int x = 2147483646;
        long temp = 1;

        System.out.println((int)Math.pow(8, 0.5));

        if (x == 0) System.out.println(0);

        while (true) {
            if (temp * temp > x) {
                System.out.println(temp-1);
                break;
            }
            temp += 1;
        }

    }
    class Solution {
        public int mySqrt(int x) {
            return (int) Math.pow(x, 0.5);
        }
    }



/*    class Solution2 {
        public int mySqrt(int x) {
            long temp = 1;

            while (true) {
                if (temp * temp > x) {
                    return (int) (temp - 1);
                }
                temp += 1;
            }
        }
    }*/


}

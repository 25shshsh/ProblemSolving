package a202403;

public class Ps240313_1 {
    public static void main(String[] args) {
        int n = 8;

        int a = 1;
        int b = 8*9/2;

        for(int i = 2; i <= n; i++) {
            if(a > b); // return -1;
            else if(a == b); //return i;

            a += i;
            b -= (i-1);
        }


    }


    class Solution {
        public int pivotInteger(int n) {
            if(n == 1) return 1;

            int a = 1;
            int b = n*(n+1)/2;

            for(int i = 2; i <= n; i++) { // 1
                a += i;
                b -= (i-1);

                if (a > b) return -1; // 2
                else if (a == b) return i; // 3
            }

            return -1;
        }
    }


}

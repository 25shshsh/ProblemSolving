package a202311;

public class Ps231106_1 {

    public static void main(String[] args) {

    }

    class Solution {
        public int diagonalSum(int[][] mat) {
            int length = mat.length; // 1
            int ptr1 = 0;
            int ptr2 = mat[0].length-1;
            int sum = 0;

            if(ptr2 % 2 == 0) sum -= mat[ptr2/2][ptr2/2]; // 2

            for(int i = 0; i < length; i++) { // 3
                if(ptr2 >= 0 && ptr1 <= length-1) {
                    sum += mat[i][ptr1++];
                    sum += mat[i][ptr2--];
                } else break;

            }

            return sum;
        }
    }
}

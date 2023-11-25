package a202311;

public class Ps231125_1 {
    public static void main(String[] args) {

    }
    // 1~n까지의 합 n(n+1)/2
    class Solution {
        public boolean checkValid(int[][] matrix) {
            int n = matrix.length;
            int rowAndColSum = n*(n+1);


            if (n == 1) return matrix[0][0] == 1;

            for(int i = 0; i < n; i++) {
                int[] arr = new int[n+1];

                for(int j = 0; j < n; j++) {
                    ++arr[matrix[i][j]];
                    if(arr[matrix[i][j]] > 1) return false;
                }
            }


            for (int i = 0; i < n; i++) {
                int tempSum = 0;
                for(int j = 0; j < n; j++) {
                    tempSum += (matrix[i][j] + matrix[j][i]);
                }
                if(tempSum != rowAndColSum) return false;
            }

            return true;
        }
    }
}

package a202311;

public class Ps231114_1 {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/toeplitz-matrix/

    class Solution { // 0ms
        public boolean isToeplitzMatrix(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;

            if(m*n == 1) return true;

            for(int i = 1; i < m; i++) {
                for(int j = 0; j < n-1; j++) {
                    if(matrix[i-1][j] != matrix[i][j+1]) return false;
                }
            }

            return true;
        }
    }





    class Solution2 { // 23ms
        public boolean isToeplitzMatrix(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int i = 0;
            int j = 0;
            int col = 0;
            int row = 0;

            while (col < n) {
                try {
                    if (matrix[i][j] == matrix[i + 1][j + 1]) {
                        i++; j++;
                    } else {
                        return false;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    col++;
                    j = col;
                    i = 0;
                }
            }

            j = 0;

            while (row < m) {
                try {
                    if (matrix[i][j] == matrix[i + 1][j + 1]) {
                        i++; j++;
                    } else {
                        return false;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    row++;
                    i = row;
                    j = 0;
                }
            }

            return true;
        }
    }
}

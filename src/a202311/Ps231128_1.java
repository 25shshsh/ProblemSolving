package a202311;

public class Ps231128_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[][] matrixBlockSum(int[][] mat, int k) {
            int m = mat.length;
            int n = mat[0].length;
            int[][] answer = new int[m][n]; // 0. mat과 같은 크기의 배열 생성

            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    int rowStart = Math.max(i-k, 0); // 1 범위 산정
                    int colStart = Math.max(j-k, 0);
                    int rowEnd = Math.min(i+k, m-1);
                    int colEnd = Math.min(j+k, n-1);

                    answer[i][j] = blockSum(mat, rowStart, rowEnd, colStart, colEnd); // 2 범위 내 모든 값 더하기
                }
            }

            return answer; // 3
        }

        private int blockSum(int[][] mat, int rowStart, int rowEnd, int colStart, int colEnd) {
            int sum = 0;

            for(int i = rowStart; i <= rowEnd; i++) {
                for(int j = colStart; j <= colEnd; j++) {
                    sum += mat[i][j];
                }
            }

            return sum;
        }

    }




}

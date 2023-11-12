package a202311;

public class ps231112_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[][] transpose(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;

            int[][] answer = new int[n][m];

            // (m*n) = (n*m) , (i*j) = (j*i)
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // 논리적으로 형태가 같으므로 matrix의 전치를 answer에 담는다.
                    answer[i][j] = matrix[j][i];
                }
            }

            return answer;
        }
    }

}

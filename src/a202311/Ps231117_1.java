package a202311;

import java.util.ArrayList;
import java.util.List;

public class Ps231117_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public void rotate(int[][] matrix) {
            int m = matrix.length;

            // 1 : 전치 행렬 만들기
            for (int i = 0; i < m; i++){
                for (int j = i; j < m; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            // 2 : 각 행을 뒤집기
            for (int i = 0; i < m; i++){
                int x = 0;
                int y = m-1;

                while (x < y) {
                    matrix[i][x] = matrix[i][x] + matrix[i][y];
                    matrix[i][y] = matrix[i][x] - matrix[i][y];
                    matrix[i][x] = matrix[i][x] - matrix[i][y];
                    x++;
                    y--;
                }
            }
        }
    }


}

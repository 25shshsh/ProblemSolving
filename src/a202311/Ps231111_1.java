package a202311;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Ps231111_1 {

    public static void main(String[] args) {


    }



    class Solution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            int m = mat.length;
            int n = mat[0].length;

            if((m * n) != (r * c)) return mat;

            int[][] answer = new int[r][c];

            int x = 0;
            int y = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    answer[i][j] = mat[x][y++];
                    if(y == n) {
                        x++;
                        y = 0;
                    }
                }
            }

            return answer;
        }
    }

}

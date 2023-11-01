package a202311;

import java.util.ArrayList;
import java.util.List;

public class Ps231101_1 {

    public static void main(String[] args) {


    }

    class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length; // 1


            for(int i = 0; i <n; i++) { // 2
                int min = matrix[i][0];
                int idx = 0;

                for(int j = 0; j < m; j++) { // 3
                    if(min > matrix[i][j]) {
                        min = matrix[i][j];
                        idx = j;
                    }
                }

                int max = min;
                for(int k = 0; k < n; k++) { // 4
                    if(matrix[k][idx] > max) {
                        max = matrix[k][idx];
                        break;
                    }
                }

                if(min == max) { // 5
                    List<Integer> list= new ArrayList<>();
                    list.add(min);
                    return  list;
                }

            }

            return new ArrayList<>();
        }
    }
}

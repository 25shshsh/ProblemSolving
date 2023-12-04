package a202312;

import java.util.ArrayList;
import java.util.List;

public class Ps231201_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int colStart = 0;
            int rowStart = 0;
            int rowEnd = matrix.length;
            int colEnd = matrix[0].length;
            List<Integer> list = new ArrayList<>(rowEnd * colEnd);
            int cnt = rowEnd * colEnd; // matrix배열의 크기만큼만 원소를 list에 넣을 것이다.

            while(rowStart < rowEnd && colStart < colEnd) {

                if((colEnd-1 == colStart && rowEnd-1 == rowStart)) { // 배열의 크기가 1일때
                    list.add(matrix[rowStart][colStart]);
                    cnt--;
                }

                for(int j = colStart; j < colEnd-1; j++) { // 1방향
                    if(cnt > 0) {
                        list.add(matrix[rowStart][j]);
                        cnt--;
                    }
                }

                for(int i = rowStart; i < rowEnd-1; i++) { // 2방향
                    if(cnt > 0) {
                        list.add(matrix[i][colEnd-1]);
                        cnt--;
                    }
                }

                for(int j = colEnd-1; j > colStart; j--) { // 3방향
                    if(cnt > 0) {
                        list.add(matrix[rowEnd-1][j]);
                        cnt--;
                    }
                }

                for(int i = rowEnd-1; i > rowStart; i--) { // 4방향
                    if(cnt > 0) {
                        list.add(matrix[i][colStart]);
                        cnt--;
                    }
                }

                // 논리적을 배열의 시작점을 +1, 끝나는 지점을 -1 조정한다.
                colStart++;
                rowStart++;
                rowEnd--;
                colEnd--;
            }

            return list;
        }
    }


}

package a202311;

public class ps231107_1 {
    public static void main(String[] args) {

    }
    // mat = [[0,0],[1,1],[0,0],[1,1]]
    class Solution {
        public int[] rowAndMaximumOnes(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int max = 0;
            int index = 0;

            for(int i = 0; i < m; i++) {
                int count = 0;

                for(int j = 0; j < n; j++) {
                    //if(mat[i][j] == 1)
                    count += mat[i][j];
                }
                if(count > max) {
                    max = count;
                    index = i;
                }
            }

            return new int[] {index, max};
        }
    }

}

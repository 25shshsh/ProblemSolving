package a202311;

public class Ps231108_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int numSpecial(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int idx = 0;
            int answer = 0;

            for(int i = 0; i < m; i++) {
                int sum = 0;

                for(int j = 0; j < n; j++) {
                    if(mat[i][j] == 1) {
                        sum += mat[i][j]; // 1
                        idx = j; // 2
                    }
                }

                if(sum == 1) { // 3
                    sum = 0;
                    for(int k = 0; k < m; k++) {
                        sum += mat[k][idx];
                    }
                }

                if(sum == 1) {
                    answer++;
                }

            }

            return answer;
        }
    }
}

package a202311;

public class Ps231115_1 {

    public static void main(String[] args) {

    }

    class Solution {
        public int[][] construct2DArray(int[] original, int m, int n) {
            int [][] answer = new int[m][n];
            int index = 0;

            if(original.length != m*n) return new int[0][0];

            // original.length == m*n이다.
            // original과 answer의 총 크기는 같다.
            // original을 answer에 순서대로 담아준다.
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    answer[i][j] = original[index++];
                }
            }

            return answer;
        }
    }


}

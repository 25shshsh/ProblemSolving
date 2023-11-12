package a202311;

public class Ps231102_1 {

    public static void main(String[] args) {

    }

    // grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
    class Solution {
        public int islandPerimeter(int[][] grid) {
            int countCell = 0; // 모든 땅의 개수
            int adjacentSide = 0; // 인접한 변의 개수
            int n = grid.length; // 행의 길이
            int m = grid[0].length; // 열의 길이

            for(int i = 0; i < n; i++) {

                for(int j = 0; j < m; j++) {

                    if(grid[i][j] == 1) {
                        countCell += 1;

                        if(j-1 >= 0 && grid[i][j-1] == 1) adjacentSide += 1;
                        if(i+1 < n && grid[i+1][j] == 1) adjacentSide += 1;

                    }

                }
            }

            return (countCell * 4) - (adjacentSide * 2);
        }
    }

}

package a202311;

import java.util.stream.IntStream;

public class Ps231129_1 {
    public static void main(String[] args) {

    }

    class Solution {

        public int countSubIslands(int[][] grid1, int[][] grid2) {
            int m = grid2.length;
            int n = grid2[0].length;

            // 접근방법 1, 2
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid1[i][j] == 0 && grid2[i][j] == 1) { // ex2의 빨간 원이 존재할 때
                        dfs(grid2, i, j); // grid1에 완전히 종속되지 않은 땅을 없앤다.
                    }
                }
            }

            // 접근방법 3
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid2[i][j] == 1) {
                        count++;
                        dfs(grid2, i, j);
                    }
                }
            }

            return count;
        }

        private void dfs(int[][] grid, int i, int j) {
            if (i < 0 || j < 0 || i > grid.length-1 || j > grid[0].length-1 || grid[i][j] == 0) return;

            grid[i][j] = 0;

            dfs(grid, i-1, j);
            dfs(grid, i+1, j);
            dfs(grid, i, j-1);
            dfs(grid, i, j+1);
        }
    }
}

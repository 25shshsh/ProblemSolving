package a202311;

public class Ps231118_1 {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/max-area-of-island/
    class Solution {
        public int cnt = 0;
        public int max = 0;

        public int maxAreaOfIsland(int[][] grid) {

            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[0].length; j++) {

                    if(grid[i][j] == 1) {
                        cnt = 0;
                        dfs(grid, i, j);
                        if(cnt > max) max = cnt;
                    }
                }
            }

            return max;
        }

        private void dfs (int[][] grid, int row, int col) {

            if(row < 0 || col < 0 || row > grid.length-1 ||
                    col > grid[0].length-1 || grid[row][col] == 0) {
                return;
            }

            cnt++;
            grid[row][col] = 0;

            dfs(grid, row+1, col);
            dfs(grid, row, col+1);
            dfs(grid, row-1, col);
            dfs(grid, row, col-1);

        }
    }
}

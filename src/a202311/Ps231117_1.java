package a202311;

public class Ps231117_1 {
    public static void main(String[] args) {

    }
    // 4방향으로 이차원배열을 잠식하기. >> 4방향으로 이어진 1의 개수를 세었다면 1->0으로
    // https://leetcode.com/problems/max-area-of-island
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

            if(row < 0 || col < 0 || row > grid.length-1 || col > grid[0].length-1 || grid[row][col] == 0) {
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

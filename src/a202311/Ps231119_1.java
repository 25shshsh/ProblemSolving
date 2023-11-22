package a202311;

public class Ps231119_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int maxSum(int[][] grid) {
            int x = 0;
            int y = 0;
            int max = 0;

            while(x+2 < grid.length && y+2 < grid[0].length) {
                int sum = 0;

                for(int i = x; i <= x+2; i++) {
                    for(int j = y; j <= y+2; j++) {
                        sum += grid[i][j];
                    }
                }
                sum -= (grid[x+1][y] + grid[x+1][y+2]);

                if(sum > max) max = sum;

                if(y+2 == grid[0].length-1) {
                    y = -1;
                    x++;
                }

                y++;
            }

            return max;
        }
    }


}

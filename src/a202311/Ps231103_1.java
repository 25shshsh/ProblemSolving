package a202311;

import java.util.stream.IntStream;

public class Ps231103_1 {

    public static void main(String[] args) {
        System.out.println(Math.min(5,5));

    }
    // grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
    class Solution {
        public int maxIncreaseKeepingSkyline(int[][] grid) {

            int n = grid.length; // 행, 열의 길이
            int sum = 0;
            int[][] memo = new int[n][2]; //{colMax, rowMax}

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(grid[i][j] > memo[i][0]) memo[i][0] = grid[i][j];
                    if(grid[j][i] > memo[i][1]) memo[i][1] = grid[j][i];
                }
            }

     /*       for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {

                }
            }*/




            return sum;
        }

        private void printArr(int[][] arr) {
            IntStream.rangeClosed(0, arr.length-1).forEach(i ->{
                System.out.println(arr[i][0]+", " + arr[i][1]);
            });
        }
    }
}

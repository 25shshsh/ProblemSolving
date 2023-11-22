package a202311;

public class Ps231113_1 {
    public static void main(String[] args) {
        int n = -100;
        System.out.println((int) (Math.log10(-n) + 1));

    }
    // grid = [[-15,1,3],[15,7,12],[5,6,-2]]
    // https://leetcode.com/problems/find-the-width-of-columns-of-a-grid
    class Solution {
        public int[] findColumnWidth(int[][] grid) {
            int[] answer = new int[grid[0].length];

            for (int j = 0; j < answer.length; j++) {
                int intLength = 0;
                int temp = 0;

                for (int i = 0; i < grid.length; i++) {
                    if(grid[i][j] < 0)  temp = (int) (Math.log10(-grid[i][j]) + 1) + 1;
                    else temp = (int) (Math.log10(grid[i][j]) + 1);

                    if(intLength < temp) intLength = temp;
                }

                if(intLength == 0) answer[j] = 1;
                else answer[j] = intLength;

            }

            return answer;
        }
    }


}

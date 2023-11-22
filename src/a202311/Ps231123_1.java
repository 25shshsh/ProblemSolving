package a202311;

public class Ps231123_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
            int [][] arr = new int[rowSum.length][colSum.length];

            for(int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    int value = Math.min(rowSum[i], colSum[j]);
                    arr[i][j] = value;
                    rowSum[i] -= value;
                    colSum[j] -= value;
                }
            }

            return arr;
        }
    }

}

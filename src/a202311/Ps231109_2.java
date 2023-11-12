package a202311;


import java.util.Arrays;

public class Ps231109_2 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = arr.length;
        int cnt = ((n * n) - n) / 2;
        int[][] arr2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[j][n-1-i] = arr[i][j];
            }
        }

        System.out.println(arr2[0][0] + " " + arr2[0][1] + " " + arr2[0][2]);
        System.out.println(arr2[1][0] + " " + arr2[1][1] + " " + arr2[1][2]);
        System.out.println(arr2[2][0] + " " + arr2[2][1] + " " + arr2[2][2]);


        arr = arr2;

        System.out.println(arr[0][0] + " " + arr[0][1] + " " + arr[0][2]);



    }

    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            int rotationCount = 3;

            while(rotationCount >= 0) { // 3
                if(Arrays.deepEquals(mat, target)) return true;
                mat = onceRotation(mat);

                rotationCount--;
            }

            return false;
        }

        private int[][] onceRotation(int[][] mat) {
            int n = mat.length;
            int[][] temp = new int[n][n]; // 1

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    temp[j][n-1-i] = mat[i][j]; // 2
                }
            }
            return temp;
        }
    }



}







